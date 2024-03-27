- EC2 instances are virtual machines (OS + Resources)
- These instances run on EC2 Hosts
	- Could be one of Shared Hosts or Dedicated Hosts
- AZ Resilient service 
- Primary Network Interface in subnets are mapped to the data network interface of the EC2
	- EC2 data network can be mapped to multiple primary network interfaces 
- EBS is the primary storage for an EC2 instance 
	- EBS is also AZ resilient 
	- They allocate volumes to EC2 instances 
- Instances have their hardware, network, storage are locked in an AZ
	- But they can be migrated, copied using snapshots and AMIs

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240327122248.png)


# What's EC2 Good for?
- Traditional OS + Application Compute
- Long-Running compute
- Server style applications
- Either burst or steady-state load
- Monolithic application stacks
- Migrated application workloads or Disaster Recovery

