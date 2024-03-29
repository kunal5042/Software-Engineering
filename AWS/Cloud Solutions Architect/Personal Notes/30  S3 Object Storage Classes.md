# S3 Standard
- Eleven 9's of durability 
	- For 10,000 objects you may loose 1 object in 10,000 years
- Replication over at least 3 AZ's & Content-MD5 Checksums and Cyclic redundancy checks (CRCs) are used to detect and fix any data corruption.
	- [08 AWS Global Infrastructure](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/08%20AWS%20Global%20Infrastructure.md)
- When objects are stored a HTTP/1.1 200 OK response is provided by the S3 API Endpoint
- With S3 Standard, you are billed a GB/m fee for data stored. A $ per GB charge for transfer OUT (IN is free) and a price per 1000 requests.
- No Specific retrieval fee, no minimum duration, no minimum size
- Has milliseconds first byte latency and objects can be made publicly available 

# S3 Standard IA (Infrequent Access)
- Data is still replicated at least 3 AZ
- Durability is same as S3 Standard
- Per request charge and data transfer out costs same as S3 standard 
- Has per GB data retrieval fee, overall cost increases with frequent data access. 
- Has minimum duration charge for 30 days - objects can be stored for less, but the minimum billing always applies
- Has a minimum capacity charge of 128KB per object 

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240325014327.png)

# S3 One Zone - IA
- Cheaper than S3 standard and S3 infrequent access at the compromise of data replication at one AZ
- Retrieval fee applies similar to S3 IA
- Minimum capacity fee similar to S3 IA 
- Same level of durability as S3 Standard
- Data is still replicated within the AZ
	- But if the AZ fails, you can loose the data
- Should be used for data which is infrequently accessed 
- Should be used for data which is non-critical and can be easily replaced
	- For example the intermediate data 

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240325014632.png)

# S3 Glacier - Instant
- Cheaper storage than all above, more expensive retrieval, longer minimum 
- ![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240325014933.png)

# S3 Glacier - Flexible
- Same three AZ architecture as S3 standard
- Same durability as S3 standard
- Storage cost as low as 1/6th of S3 standard
- Objects cannot be made publicly accessible any access of data beyond object metadata requires a retrieval process
	- Stored in S3 IA when you retrieve them
- 40KB minimum billable size with 90 day minimum billable duration
	- This means that any data stored in S3 Glacier Deep Archive will be billed with a minimum charge equivalent to 40 KB, even if the actual data size is smaller.

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240325015235.png)

# S3 Glacier Deep Archive
- Data in a frozen state
- 40KB minimum billable size with 90 day minimum billable duration
- Objects cannot be made publicly accessible any access of data beyond object metadata requires a retrieval process!
- Retrieval jobs takes much longer than all the above classes
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240325015753.png)

![Amazon S3 Glacier Deep Archive storage class](https://d1.awsstatic.com/reInvent/re21-pdp-tier1/s3/deep-archive-how-it-works.1d6acf44c81c46ae9f3e920d83b13e5fde1ed343.png "Amazon S3 Glacier Deep Archive storage class")

# S3 Intelligent-Tiering
- Frequent, Infrequent, and Archive Instant Access tiers have the same low-latency and high-throughput performance of S3 Standard 
- The Infrequent Access tier saves up to 40% on storage costs  
- The Archive Instant Access tier saves up to 68% on storage costs  
- Opt-in asynchronous archive capabilities for objects that become rarely accessed 
- Archive Access and Deep Archive Access tiers have the same performance as S3 Glacier Flexible Retrieval and S3 Glacier Deep Archive and save up to 95% for rarely accessed objects
- Designed for durability of 99.999999999% of objects across multiple Availability Zones and for 99.9% availability over a given year
- No operational overhead, no lifecycle charges, no retrieval charges, and no minimum storage duration
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240325020802.png)

![](https://youtu.be/6brzBokCYV0)

# S3 Glacier Archive Architecture
![Amazon S3 Glacier storage classes overview](https://d1.awsstatic.com/reInvent/re21-pdp-tier1/s3/s3-glacier-overview.0d570958d5161d19059c7dee00865500c1470256.png "Amazon S3 Glacier storage classes overview")


![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326133024.png)

# S3 Replication
- Not retroactive & Versioning needs to be ON
	- When replication is enabled only after that point the next objects are replicated, \**existing objects are not replicated (Non-Retroactive)
		- Enabled versioning is a prerequisite to this process
		- \**When setting up replication you can get an option of batch replication which allows you to replicate existing objects
	- Ownership - default is the source account
	- Storage class - default is to maintain the same class as source
	- By default best effort replication, users can opt for Replication Time Control (RTC) for an SLA of 15 minutes
- One-way replication Source to Destination
	- Bi-Directional replication doesn't work
	- Option to replicate subset, all objects or filter objects scope using tags or prefix
- Replication is capable of handling unencrypted, SSE-S3 & SSE-KMS (with extra config)
	- With KMS you can configure and manage the keys used for encryption in the replication process
- Source bucket owner needs permissions to objects
- No system events, Glacier or Glacier Deep Archive storages doesn't support this functionality 
- No deletes are replicated by default


# Why use replication?
- SRR - Log aggregation
- SRR - PROD and Test Sync
- SRR - Resilience with strict sovereignty 
- CRR - Global Resilience Improvements
- CRR - Latency Reduction

