# VPC
- Virtual Network inside AWS
- A VPC is within 1 account & 1 region
	- One default VPC per region
	- Many custom VPCs per region
- Private and Isolated unless you decide otherwise


## Types
1. Default VPC
	1. Created by default by AWS
	2. Preconfigured, One per region - can be removed & recreated
	3. Default VPC CIDR is always **172.31.0.0/16**
	4. /20 Subnet in each AZ in the region
2. Custom VPC
	1. Created by the users
	2. Can create one or more per region

AWS Account --> Region --> VPCs --> Subnet
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240319211656.png)


