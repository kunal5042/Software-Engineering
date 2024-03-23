# Object Versioning
- Disabled by default, once enabled **can't disable again**
	- Can be suspended and re-enabled
	- Bucket level permission
- Versioning lets you store multiple versions of objects within a bucket. Operations which would modify objects generate a new version.
- All objects in a bucket has id = null when versioning is disabled
	- On enabling the versioning and id is assigned 
	- On Overwriting the old object is not deleted but a new object with a new id is saved linked to the same name
- When retrieving an object without specifying a version latest version is returned
	- Versions are individually accessed by specifying the id
- Versioning impacts the delete operations as well
	- When you delete without specifying, latest version is deleted (Stack pop())
	- Alternatively you can specify which version to delete
- Space is consumed by all versions
- You are billed for all versions
- Only way to 0 costs - is to delete the bucket
- Even on suspension all previous versions are not deleted and you are still charged for them

# MFA Delete
- Enabled in versioning configurating
- MFA is required to change bucket versioning state
- MFA is required to delete versions