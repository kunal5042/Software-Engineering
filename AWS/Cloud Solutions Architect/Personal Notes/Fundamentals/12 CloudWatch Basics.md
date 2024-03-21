# CloudWatch
- Collects and manages operational data
- Metrics - AWS Products, Apps, on-premises
- CloudWatch Logs - AWS Products, Apps, on-premises
- CloudWatch Events - AWS Services & Schedules

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240320162458.png)

# Namespace
- Container for monitoring data, keep things easy to manage
- AWS/service --> AWS/EC2
	- All metric data for EC2
	- You can't use this type of naming as it's reserved by AWS
- Contains related metrics
	- Metric
		- Collection of related data points in time ordered structure
		- CPU Usage, Network IN/OUT, Disk IO as examples
		- Dimension
			- Flexible entities to separate the datapoints within same metric
			- ![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240320170429.png)
