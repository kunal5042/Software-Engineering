# VPC
- Regional service - all AZs in the region
- Isolated network
- Nothing IN or OUT without explicit configuration
- Flexible configuration - simple or multi-tier
- Hybrid networking - other cloud & on-premises
- Default or Dedicated Tenancy
- Can use IPv4 Private CIDR Blocks & Public IPs 
	- 1 Primary Private IPv4 CIDR Block
	- Min /28 (16 IP) Max /16(65,536 IP)
	- Optional Secondary IPv4 blocks
	- Optional single assigned IPv6 /56 CIDR Block
- Explicitly you have to allow public if you want

# DNS in a VPC
- Provided by R53 [16 Route53 Fundamentals](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/16%20Route53%20Fundamentals.md)
- VPC `Base IP+2` Address
	- If VPC IP is 10.0.0.0 
	- 10.0.0.2 will be DNS IP
- `enableDnsHostnames` - gives instances DNS names
	- If set to true, instances do get public host names
- `enableDnsSupport` - enables DNS resolution in VPC

End State of Multi-tier custom VPC
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326174033.png)
