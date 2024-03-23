# S3 Security
- **S3 is private by default
	- The only identity which has initial access is the account root user which created it

# S3 bucket policies
- A form of resource policy
- Like identity policies, but attached to a bucket
- Resource perspective permissions
	- With identity policies you are controlling what that identity can access
		- Identity policies can also only be attached to the identities in your own account
		- Can only control security inside your account
		- Can be given to only valid/existing  identities
	- Who can access that resource
		- Resource policy allow/deny same or different accounts
		- Because it is attached to a resource
		- Flexibility to reference to any other identity 
		- Resource policy can allow/deny anonymous principals

# Resource vs Identity Policies

| Aspect           | Resource-based Policies                                           | Identity-based Policies                                     |
| ---------------- | ----------------------------------------------------------------- | ----------------------------------------------------------- |
| Scope of Control | Apply permissions directly to AWS resources.                      | Apply permissions based on user identities and roles.       |
| Focus            | Centered around the resource being accessed.                      | Centered around the identity requesting access.             |
| Granularity      | Can be granular, allowing specific actions on specific resources. | Typically broader, affecting multiple resources or actions. |
| Flexibility      | Flexible in defining permissions for individual resources.        | Flexible in assigning permissions based on roles or groups. |
| Maintenance      | Requires updating policies when resource changes occur.           | Easier to maintain as policies are tied to roles or groups. |
| Examples         | S3 bucket policies, IAM role policies.                            | IAM group policies, IAM user policies, IAM role policies.   |
|                  |                                                                   |                                                             |
Note: **Not every service supports resource policies**
# Example
```json
{
	"Version": "",
	"Statement":[
		{
			"Sid": "PublicRead",
			"Effect":"Allow",
			"Principal": "*",
			"Action": ["s3:GetObject"],
			"Resource": ["arn:aws:s3:::myproject/*"],
			"Condition": {
				"NotIpAddress": {"aws:SourceIp" : "x.x.x.x/net"},
				"Null": {"aws:MultiFactorAuthAge": true}
			}
		}
	]
}
```

- Since principal is a \* this policy applies to identities, partner accounts, and anonymous accounts.
- Allows you to deny/allow ip addresses 
# ACLs
- Legacy way of controlling access, AWS recommends bucket policies and Identity policies 
-  ACLs on objects and bucket
- Inflexible & Simple permissions

| Permission | Bucket                                                                  | Object                                                    |
| ---------- | ----------------------------------------------------------------------- | --------------------------------------------------------- |
| READ       | Allows grantee to list the objects in the bucket                        | Allows grantee to read the object data and its metadata   |
| WRITE      | Allows grantee to create, overwrite and delete any object in the bucket | Not applicable                                            |
| READ_ACP   | Allows grantee to read the bucket ACL                                   | Allows grantee to read the object ACL                     |
| WRITE_ACP  | Allows grantee to write the ACL for the applicable bucket               | Allows grantee to write the ACL for the applicable object |

# Block Public Access
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240323175958.png)

