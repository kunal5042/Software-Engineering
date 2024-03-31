- Snapshots are incremental volume copies to S3
- The first is a full copy of 'data' on the volume 
	- Fewer snapshots are completely incremental, store only the changes
	- Takes much less space
- Volumes can be created (restore) from snapshots 
	- These snapshots can also be copied to other regions and used

# Snapshots Architecture 
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240328182228.png)
- New EBS volume = full performance immediately 
- Snaps restore lazily - fetched gradually 
- Requested blocks are fetched immediately 
- Fast Snapshot Restore (FSR) - Immediate restore 
	- Upto 50 snaps per region of type FSR
	- Set on the Snap & AZ
- Billed gigabyte-month 
	- Billed on used data not the allocated data
		- \*For instance you are charged on full allocation of EBS volume
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240328182557.png)
