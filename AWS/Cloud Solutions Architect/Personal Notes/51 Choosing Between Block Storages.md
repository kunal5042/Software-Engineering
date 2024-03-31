# Factors -> Storage
- Persistence : EBS over Instance
- Resilience : EBS over Instance
- Storage isolated from instance lifecycle : EBS
- Resilience w/ App In-build replication : it depends
- High performance needs : it depends
- Super high performance needs : Instance 
- Cost : it depends but Instance if can replace data easily

# EBS 
- Cheap : ST1 or SC1
- Throughput / streaming : ST1
- Boot : Not ST1 or SC1
- GP2/3 - upto 16,000 IOPS
- IO1/2 - upto 64,000 IOPS (\*256,000)
	- Pair with good sized EC2 instance capable of delivering this level of performance
- RAID0 + EBS upto 260,000 IOPS (io1/2-BE/GP2/3)
- More than 260,000 IOPS - Instance store 
	- Lack of persistence 