## Storage Refresher 
1. Direct - attached storage on the EC2 host
2. Network attached storage - volumes delivered over the network (EBS)
3. Ephemeral Storage - Temporary Storage
4. Persistent Storage - Permanent storage, lives on past the lifecycle of the EC2

## Main Storage Categories 
- Block Storage - Volume presented to the OS as a collection of blocks, no structure provided 
	- Mountable and bootable 
	- Creates a file system on top of this like NTFS, ext
	- Physical form as spinning hard-drive or ssd
	- Has no in build structure 
	- Collection of uniquely addressable blocks
	- You can mount EBS volumes in EC2, which is used to boot the instance and start the OS

- File Storage - Presented as a file share, has a structure 
	- Mountable but not bootable
	- File structure, you can locate and request a file operations 
	- Given access to a pre-defined file system (NTFS, ext4)

- Object Storage - Collection of objects, flat structure 
	- Not mountable and not bootable
	- Key - value pairs
	- Objects can be anything (binary data, images, movies, any data really)
	- You just have a container in AWS case it's S3
	- Can be accessed by thousands and millions of people at the same time

### Basic choices
Boot, High Performance OS storage = Block Storage
Share files between multiple different servers = File Storage
Large Access to read files and data = Object storage

## Storage Performance
- IO Block Size
	- `Size of the wheels of the race car`
	- Size of the blocks of data being written to the disk
		- 16K, 64K, 1MEG
		- If your size of object being written is 16K and block size is 4K it will take 4 Blocks

- IOPS
	- `Rounds per minute of the race car`
	- How many reads/writes a disk can accommodate in a second
	- Network storage and local storage can significantly impact the IOPS

- Throughput
	- `End speed of the race car`
	- IO (block) size x IOPS = throughput
	- Rate of data at which you can store the data to the disk 
		- Ex. 16KB (block size) x 100 IOPS = 1.6 MB/s

### Factors Involved in Final Performance
Application --> Operating System --> Storage Sub System --> Transport Mechanism --> Storage Interface --> Drive Itself and the Technology it uses 


# EBS
- Block storage - raw physical disks and provides allocations of these disks (volumes)
	- Can be unencrypted or you can choose to encrypt using KMS
- Instances see block device and create file system on this device (ext3/4, xfs, NTFS)
- Storage is provisioned in one AZ so AZ resilience 
	- Separated and isolated in each availability zone
- You create a volume and you generally attach it to one EC2 instance
	- You also have the option to multi-attach but you need to handle the data consistency and parallel read/writes conflicts
- You can de-attach and re-attach, not lifecycle linked to one instance, it's a persistent storage
- Snapshot (backup) into S3.
	- Create volume from snapshot (also helps you migrate between AZs)
	- This makes the backup regional resilient 
- 