# What is NAT?
- Network Address Translation - A set of processes remapping the source and destination IP Addresses
	- Ex. We've seen in IGW example remapping when a traffic reaches within the subnet from IGW
- IP masquerading - hiding CIDR blocks behind one IP
	- Many private IPs to one single IP
	- Public IPv4 addresses running out
- Gives Private CIDR range outgoing internet* access

***If you need to give an instance it's own public IPv4 address then only the IGW is required, if you want to give the private instances outgoing access to the internet along with AWS public services such as S3 then you need both the NAT gateway for this many-to-One translation and IGW to translate from the IP of the NAT gateway to real public IPv4 address***

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326234356.png)

## NAT Gateways
- Runs from a public subnet 
	- Needs to be assigned a public IPv4 address
	- Subnet configured to allocate IPv4 addresses   
	- Default routes for those subnets pointing to the internet gateway (IGW)
- Uses Elastic IPs (Static IPv4 Public)
	- Allocated to your AWS account for a region
- NAT gateways are AZ resilient (HA in that AZ) service
	- They can recover from hardware failure within an AZ but if entire AZ fails they are impacted
	- Unlike IGW which are fully resilient in a region
		- If you want similar functionality 
		- NATGW in each AZ
		- Route Table in for each AZ with that NATGW as target
- Managed service, scales to 45 Gbps, $ Duration & Data Volume
	- Split heavy consumers between two different subnets within an AZ
	- Billed based on the number you have, subject to change and is different per region
	- Hourly charged, so partial hours are charged full
	- Also a data processing charge, same as hourly charge
		- Base charge + data processed 

