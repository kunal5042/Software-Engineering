# Overview
- S3 can and stores HUGE objects (upto 5TB)
- You often want to retrieve the entire object
- Retrieving a 5TB object takes time
- Filtering at the client side doesn't reduce this
- Solution is that S3/Glacier provides you SQL-like statements to retrieve partial data
	- Supported: CSV, JSON, Parquet, BZIP2 compression for CSV and JSON

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326163630.png)

