# Refresher
[44 NAT (Network Address Translation)](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/44%20NAT%20(Network%20Address%20Translation).md)

# True Region Resilience
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326235710.png)

# NAT Instance vs NAT Gateway
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240327000340.png)

 - Right click an instance in console you can see option to disable source/destination checks which you need to disable for it to work as a NAT instance
 - Not preferred to use EC2 based NAT instances
 - If you value of Availability, Bandwidth, Low Maintenance and High performance you can use NAT gateways
	 - Highly performant, custom designed and scales well
 - EC2 based NAT instances are not that performant as they are general purpose
	 - Easy failures, if hardware fails, storage or network fails
	 - Can't automatically recover or scale unlike NAT Gateways
	 - Are extremely configurable 
	 - Can be used as a Bastion Host
	 - Can be configured with port forwarding
	 - You can filter traffic even using SG and ACLs
		 - Whereas in NAT gateways you can only use [NACLs](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/42%20Network%20Access%20Control%20Lists%20(NACL).md)


# Important Points with Respect to Exam
- NAT isn't required for IPv6
- The [IGW](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/40%20VPC%20Routing%20&%20Internet%20Gateway.md) works with all IPv6 IPs directly 
- All IPv6 addresses in AWS are publicly routable
- **NAT Gateways don't work with IPv6**
- ::/0 Route + IGW for bi-directional connectivity 
- ::/0 Route + Egress-Only Internet Gateway - Outbound only
