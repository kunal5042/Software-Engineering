- AZ Resilient
- A subnetwork of a VPC - within a particular AZ
- 1 Subnet can be only in one AZ
	- AZ can have many or 0 subnets
- IPv4 CIDR is assigned/within the range of the VPC CIDR
- Cannot overlap with other subnets in the VPC
- Optional IPv6 CIDR (/64 subset of the /56 VPC - space for 256)
- Subnets can communicate with other subnets in the VPC


## Subnet IP Addressing
- Reserved IP Addresses (5 in total)
- 10.16.16.0/20 (10.16.16.0 ==> 10.16.31.255)
- Network Address (10.16.16.0)
- 'Network +1' (10.16.16.1) - VPC Router
- 'Network +2' (10.16.16.2) - Reserved (DNS*)
- 'Network +3' (10.16.16.3) - Reserved Future Use
- Broadcast Address 10.16.31.255 (Last IP in subnet )

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326190455.png)
