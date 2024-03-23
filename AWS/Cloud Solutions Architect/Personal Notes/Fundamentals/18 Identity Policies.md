# IAM Policies
Identity - Access - Management

IAM Policy Document
```json
{
	// This field specifies the version of the policy language.
	// If left empty as in this case, it indicates that the policy uses the default version, which is currently the latest version supported by AWS IAM.
	"Version": "",

	// This section contains an array of individual statements that define the permissions and access controls granted or denied by the policy.
	"Statement": [
		{
			// The Statement ID (Sid) is an optional identifier for the statement. It helps in organizing and managing multiple statements within a policy.
			"Sid": "",

			// The Effect field specifies whether the statement allows (`"Allow"`) or denies (`"Deny"`) the specified actions. It can have values of `"Allow"` or `"Deny"`.
			"Effect": "",

			// The Action field specifies the list of actions or API operations that the policy applies to. These actions can include AWS service operations like `s3:GetObject` for Amazon S3 or `ec2:DescribeInstances` for Amazon EC2.
			"Action": [""],

			// The Resource field specifies the AWS resources (e.g., S3 buckets, EC2 instances) to which the actions specified in the Action field apply. It uses ARNs (Amazon Resource Names) to identify specific resources.
			"Resource": [""]
		}
	]
}
```

### Order of Priority in IAM Policy Document (Allow/Deny)

When multiple statements with different effects (Allow or Deny) are present in an IAM policy document, AWS follows a specific order of priority to determine the overall effect. Here's the order of priority:

1. **Explicit Deny:** If there is any explicit `Deny` statement that matches the requested action and resource, access is denied regardless of any other matching `Allow` statements.
    
2. **Explicit Allow:** If there is an explicit `Allow` statement that matches the requested action and resource, access is allowed, overriding any potential `Deny` statements.
    
3. **Default Deny:** If no explicit `Allow` or `Deny` statement matches the requested action and resource, access is denied by default. This means that if there are no matching `Allow` statements, access is implicitly denied.
    

It's important to note that explicit `Deny` statements take precedence over explicit `Allow` statements, and the default behavior is to deny access if no matching `Allow` or `Deny` statements are found. This order of priority ensures that IAM policies provide the intended level of access control and security for AWS resources.

### AWS Managed Policies

AWS Managed Policies are predefined policies created and managed by AWS. Here are key points about AWS Managed Policies:

- **Purpose:** They provide ready-to-use permissions policies designed by AWS to grant common sets of permissions for various AWS services and resources.
    
- **Types:** AWS offers two types of managed policies: AWS-managed policies and customer-managed policies.
    
    - **AWS-managed policies:** These are created and maintained by AWS. They cover common use cases such as full access to specific services, read-only access, or specific permissions for AWS resources.
    - **Customer-managed policies:** These are policies created and managed by AWS customers. Customers can define custom permissions and attach these policies to IAM users, groups, or roles within their AWS account.
- **Advantages:**
    
    - Time-saving: They save time by providing preconfigured permissions that align with best practices.
    - Easy maintenance: AWS manages updates and maintains these policies, ensuring they stay current and secure.
    - Granular control: They offer granular permissions, allowing users to access only the resources and services they need.
- **Usage:** AWS Managed Policies can be attached directly to IAM users, groups, or roles within an AWS account, providing the necessary permissions for users to interact with AWS services.
    
- **Examples:** Some examples of AWS Managed Policies include `AmazonS3FullAccess` for full access to Amazon S3, `AmazonEC2ReadOnlyAccess` for read-only access to Amazon EC2 resources, and `AdministratorAccess` for full administrative access to AWS services.