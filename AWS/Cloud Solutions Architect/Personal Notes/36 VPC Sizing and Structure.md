# VPC Sizing
Questions to ask yourself
- What size should the VPC be?
- Are there any networks we can't use?
- VPC's, Cloud, On-premises, Partners & Vendors ranges being used?
- What the situation is now is important but what things could be like in the future?
- VPC Structure - Tiers & Resiliency (Availability) Zones

Example
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326171818.png)

From the above image we can conclude that we have to avoid below IP Ranges
- 192.168.10.0/24
- 10.0.0.0/16 (AWS)
- 172.31.0.0/16 (Azure)
These are the confirmed networks in-use, let's say we contacted other offices and got to know
- 192.168.15.0/24 is in use by London office
- 192.168.20.0/24 is in use by New York office
- 192.168.25.0/24 is in use by Seattle Office

So when designing IP address planning for this business, we will exclude these ranges.
As architects, we also avoid using the default VPCs

More Considerations
- VPC minimum /28 (16 IP), and maximum /16 (65536 IPs)
- Personal preference by many architects is for the 10.x.y.z range
- Avoid common ranges - avoid future issues
	- ex. 10.0.x.x
- Reserve 2+ networks per region being used per account
- Ex 
	- 3 U.S, 1 Europe, 1 Australia
		- ranges - 5 x 2 = 10
		- Assume 4 AWS accounts
	- Total ranges (40 Ideally) 10 per account

#### VPC sizing reference chart
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326172626.png)

#### VPC Structure 
- VPC services run from within the subet
- Subnet is located in one availability zones
	- How many AZ will your VPC use?
		- This decision impacts HA and Resilience
- Step-1: Pick how many AZ will your VPC use
	- Default you can pick 3 as it will work in all AZs, but you can add one spare
		- i.e 4 AZs
		- We need to split the VPC into 4 smaller networks
		- We also have tiers 
			1. Web
			2. App
			3. DB
			4. Spare: Always keep a spare for future use as a good design practice

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326173119.png)

Whatever prefix you pick for the VPC, subnet will be 4 steps away.

# Proposal 
- Use the 10.16 -> 10.127 range (avoiding google)
- Start at 10.16 (US1), 10.32 (US2), 10.48 (US3), 10.64 (EU), 10.80 (Australia)
	- Each AWS account has 1/4th
- /16 per VPC - 3 AZ(+1), 3 Tiers(+1) - 16 subnets
- /16 split into 16 subnets = /20 per subnet or 4091 IP addresses