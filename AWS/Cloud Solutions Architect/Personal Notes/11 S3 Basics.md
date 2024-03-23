# S3
- Global Storage Platform - regional based/resilient
- Public service, unlimited data & multi-user
- ...Movies, Audio, Photos, Text, Large Data sets
- Economical & accessed via UI/CLI/API/HHTP
- Default storage option for most users
- Objects & Buckets

# S3 Objects
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240320111513.png)

## S3 Buckets
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240320112158.png)

## Summary 
1. Bucket names are globally unique
2. 3 - 63 characters, all lower case and no underscores
3. Start with a lowercase letter or a number
4. Can't be IP formatted e.g. 1.1.1.1
5. Buckets - 100 soft limit, 1000 hard per account
	- Soft limit - preconfigured limit
	- Hard limit - can increase the limit upto this number with support requests 
6. Unlimited objects in a bucket, 0 bytes to 5TB
7. Key = name, value = data


# S3 Pattern and Anti-Patterns
- S3 is an object store - not file or block
	- Has no file system, it's flat in nature
	- Likewise it's not a block storage, you can't mount it
- S3 bucket can't be mounted as (K:\ or /images)
- Great for large scale data storage, distribution or upload
- Great for 'offload'
- INPUT and/or OUPTU to many AWS products

