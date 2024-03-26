## Security Group Refresher
- Stateful - detect response traffic automatically
- Allowed (In or Out) request = allowed response 
- No explicit deny... only allow or implicit deny 
	- Can't block specific IPs or ranges
- Supports IP/CIDR and logical resources 
- Including other security groups AND ITSELF
- Attached to ENI's not instances (even if the UI shows it this way)
	- Not attached to a subnet or VPC
	- But to primary elastic network interfaces

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326231551.png)
#### Logical References in SGs
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326232626.png)
- We don't have to worry about IP addresses or CIDR range of subnet
- Reduces admin over ahead and streamlined application security 

#### SG Self References 
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326232823.png)

- Allows communication between two instances which have it attached, IP changes are handled since it's a logical resource reference
	- Free flow of communication within a security group
- Simplified management of intra-app communication
- Application high availability within application clusters
	- Note: SG don't allow you to explicitly deny traffic
