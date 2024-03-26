# VPC Router
- Every VPC has VPC router - Highly Available 
- In every subnet 'network +1' address
- Routes traffic between subnets
- Controlled by 'route tables' each subnet has one
- A VPC has a Main route table - subnet default 

# Route Tables
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326213019.png)
- Are attached to zero or more subnets 
	- Subnet has to have a route table
- Controls what happens to data as it leaves the subnet or subnets with which the route table is associated with
	- Higher prefix values are specific and take priority
- Default route when nothing else matches

# Internet Gateway (IGW)
- Region resilient gateway attached to a VPC
	- You don't need a gateway per availability zone
	- One IGW covers all regions which VPC is using
- VPC can have no IGW or at most one IGW
- IGW can be created and not attached to a VPC
	- But if attached, maps to only one and available to all AZ of that VPC
- Runs from within the AWS public zone
- Gateways traffic between the VPC and the Internet or AWS Public Zone (S3, SQS, SNS, etc)

## Using an IGW
1. Create a IGW
2. Attach IGW to VPC
3. Create custom RT
4. Associate RT
5. Default routes => IGW
6. Subnet allocate IPv4
 ![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326213630.png)
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326214143.png)

In IPv4 the EC2 instance doesn't have information about the IG address
- The above statement is not applicable in IPv6


## Bastion Host / Jumpbox
- Bastion Host = Jumpbox
- An instance in a public subnet
- Incoming management connections arrive there
- Then access internal VPC resources 
- Often the only way IN to a VPC

