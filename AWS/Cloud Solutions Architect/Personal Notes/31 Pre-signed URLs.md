![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326141842.png)

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326161852.png)

- Time limited urls which encode the authentication information of a IAM user to grant access to an object/(s) within a private S3 bucket
- You can create a URL for an object you don't have access to 
	- Since it's linked to your identity, the url will also not have the access to that object
- Access denied could mean the generating ID never had access or doesn't have access now
	- When using the URL the permissions match the identity which generated it
	- So at the time of generation of the url you might have access but if you don't have the access now, the url too will not have the access.
- Don't generate with a role, URL stops working when temporary credentials expire

To generate a pre-signed url from AWS CloudShell
`aws s3 presign <bucket-name> --expires-in <time-in-seconds>`

