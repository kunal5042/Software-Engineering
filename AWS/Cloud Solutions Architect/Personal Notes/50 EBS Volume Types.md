# Hard Disk Drive (HDD) 
- Two types of HDD based storages 
	1. st1
		- Throughput optimised
		- Cheap
		- Used for data where data is read in sequential way
		- Max 500 IOPS (1MB blocks) ~ 500 MB/s
		- Credit bucket on MB/s rather than IOPS unlike gp2
		- Big data, data warehouses, log processing

	2. sc1
		- Cold HDD
		- Cheaper than st1
		- Infrequent workflows, store lots of data and don't care much about performance
		- Max 250 IOPS (1MB blocks) ~ 250 MB/s
			- 12MB/s/TB Base
			- 80MB/s/TB Burst
			- Significantly cheaper than st1 but at the cost of lower performance
		- Colder data requiring fewer scans per day


# Instance Store Volumes 
- Block Storage Devices
- Physically connected to one EC2 Host
- Instances on that host can access them
- Highest storage performance in AWS
- Included in instance price
- **Attached at the launch** - you can't attach once the instance is launched 

### Instance Store Volume Architecture 
![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/attachments/Pasted%20image%2020240328114727.png)

- D3 = 4.6 GB/s throughput 
- I3 are nvm.e SSDs = 16 GB/s of sequential throughput
- More IOPS and throughput vs EBS

## Exam Power-up
- ISVs are local on EC2 host
- Attach at launch ONLY
- Lost on instance move, resize or hardware failure
- High performance (highest data performance within AWS)
- You pay for it anyway - included in instance price
- Temporary - can't use for any data which is not replaceable 

