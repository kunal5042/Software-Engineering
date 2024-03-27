[46 EC2 Architecture](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/46%20EC2%20Architecture.md)

# Decision Factors
- Raw CPU, Memory, Local Storage Capacity & type requirements
- Resource ratios - do you need faster compute or more memory?
- Storage and Data Network Bandwidth
- System Architecture / Vendor 
- Additional features and capabilities 
	- GPU
	- FPGA - Field Programmable Gate Arrays

# EC2 Categories 
- General purpose - default
	- Diverse workloads, equal resource ratio
- Compute Optimised - Media Processing, HPC, Scientific Modelling, Gaming, Machine learning
- Memory Optimised - Processing large in-memory datasets, some database workloads
- Accelerated Computing - hardware gpu, field programmable gate arrays
- Storage Optimised - sequential and random io - scale-out transactional databases, data warehousing, elasticSearch, analytics workloads

# Decoding EC2 Types
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240327125027.png) 
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240327125431.png)

[Find More About EC2 instances in one place at here](https://www.ec2instances.info)
