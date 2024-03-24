# KMS
- Regional & Public Service
- Create, Store and Manage Keys
	- KMS Keys are logical - ID, date, policy, desc & state
	- Backed by physical key material
	- Generated or imported
	- KMS keys can be used for up to 4kb of data
- Symmetric and Asymmetric Keys
- Cryptographic operations (encrypt, decrypt & )
- Keys never leave KMS - Provides FIPS 140-2 (L2)

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240323225843.png)

- KMS Keys are isolated to a region & never leave
- AWS Owned & Customer Owned
- Customer owned AWS Managed or Customer Managed KEYS
- Customer managed keys are more configurable 
- KMS Keys support rotation
- Backing Key (and previous backing keys)
- Aliases

# Key Policies and Security
- Key policies are like resource policies 
- Every KEY has one!
- Key Policies + IAM Policies 
- Permissions are very granular
- Key Policies + Grants