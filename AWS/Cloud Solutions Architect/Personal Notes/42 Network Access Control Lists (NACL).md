# Overview
- NACL are associated with Subnets and filter data crossing the subnet boundary 
	- Inbound or Outbound
	- Connections within the subnet are not affected
- Each NACL contains two types of rules
	- Inbound rules
	- Outbound rules 
- NACLs are stateless, only direction of the data is given attention to
- Rules match the DST IP/range, DST Port and ALLOW or DENY based on that match
- Rules are processed in order, lowest rule number first. Once a match occurs, processing STOPS. \* is an implicit DENY if nothing else matches 

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326222449.png)
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326222627.png)
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326223026.png)
- By Default when a VPC is created a NACL is also created 
- Inbound and Outbound rules have implicit deny (\*) and an ALLOW ALL rule
- The result - all traffic is allowed, the NACL has no effect 

Custom NACLs can be created for a specific VPC and are initially associated with NO subnets
- They only have 1 INBOUND rule by default with implicit (\*) DENY
	- Similar 1 OUTBOUND rule

# Summary
- STATELESS - Request and Response are seen as different
- Only impacts data crossing subnet boundary
- NACLs can explicitly allow and deny
	- Block IPs or IP ranges 
	- Handy feature for security purposes
- Not aware of any logical resources
	- IPs/CIDR, Ports & protocols 
	- Are only assigned/associated to subnets 
- Use together with Security Groups to add explicit DENY
	- Security Groups to allow traffic
	- NACLs to DENY the traffic
- Each subnet can have one NACL 
	- A NACL can be associated with MANY Subnets 
	- NACL - one to many - Subnet