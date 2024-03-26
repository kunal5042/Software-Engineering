# S3 Object Lock
- Objet lock enabled on 'new' buckets* (Support req for existing)
	- Once enabled can't be disabled
	- Versioning also need to be enabled
- Write once ready many (WORM) - no delete, no overwrite
- Requires versioning - individual versions are locked
- Retention is managed by one or the other of below methods or none, can be defined on individual object versions
	- 1 - Retention Period
	- 2 - Legal hold
- A bucket can have default object lock settings


# Retention Period
- Specify DAYS & YEARS - A Retention Period
- Two Modes
	1. COMPLIANCE MODE - Can't be adjusted, deleted, overwritten
		- No changes to object version or retention mode once applied
		- Most strict mode
		- Even root user can't modify
	1.  GOVERNANCE - Special permissions can be granted allowing lock settings to be adjusted
		- s3:BypassGovernanceRetention
		- x-amz-bypass-governance-retention:true(console default)

# Legal Hold
- Set on an object version - On or OFF
- No concept of retention, it's either on or off
- No deletes or changes until removed
- s3:PutObjectLegalHold is required to add or remove
- Prevent accidental deletion of critical object versions


# Summary
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240326164946.png)

- You can use these modes in conjunction 


