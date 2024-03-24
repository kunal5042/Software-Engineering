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

# S3 Glacier Archive Architecture
![Amazon S3 Glacier storage classes overview](https://d1.awsstatic.com/reInvent/re21-pdp-tier1/s3/s3-glacier-overview.0d570958d5161d19059c7dee00865500c1470256.png "Amazon S3 Glacier storage classes overview")