Buckets aren't encrypted but objects are 

Two main encryption methods
1. Client-side encryption
2. Server-side encryption

# SSE-S3 (AES256)
- AWS handles both encryption/decryption and management of keys
- User provides plain text data
	- AWS creates root key to use for all encryption processes
- You have very little control how these keys are used
- Default type of encryption for most use cases
- Data is encrypted at rest and customer doesn't have any admin overhead
- Concerns
	- You don't have access to the keys
	- You don't control the rotation of the keys
	- Role separation is not allowed

# SSE-KMS
- Key management is handled by KMS
	- Uses the Data Encryption Keys architecture of KMS
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240324195814.png)

- You can pick your own customer managed keys
	- This allows you rotation 
	- And custom permissions over the key to be used
	- If you don't pick your own key, KMS will generate a new key by default
- S3 Administrator can't read any objects if it doesn't have the KMS access/permissions allowing you to implement the role separation


![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240324200426.png)

# Bucket Default Encryption
- If you specify this header: x-amz-server-side-encryption, objects will use encryption
- You can alternative specify AES256 or aws:kms for changing the type of encryption
	- This is done on per object basis
- You can set a default encryption on the bucket for example DEFAULT = AES256
	- By default all objects will be encrypted based on the default strategy unless specified otherwise which overrides the default strategy 

