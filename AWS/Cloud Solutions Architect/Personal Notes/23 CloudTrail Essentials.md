# CloudTrail 
- Logs API calls/ activities as a CloudTrail Event
- 90 days stored by default in Event History
- Enabled by default - no cost for 90 day history
- To customise the service create 1 or more Trails
- Management Events and Data Events

# Management Events
- Management Events: Record actions on AWS resources for management purposes.
- Types: Create, Modify, Delete, Access Control events.
- Granularity: Detailed info like caller identity, time, source IP, and parameters.
- Integration: Works with various AWS services like EC2, S3, IAM, etc.
- Security: Detect unauthorized changes, enhance security, ensure compliance.
- Log Storage: Logs stored in S3, can be analyzed with tools like Athena or Elasticsearch.
- Alerting: CloudWatch Events for setting alerts and notifications based on specific events.

 ![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240322220750.png)

Additionally, cloudTrail can collect all the data and put it in CloudWatch Logs. It makes it much more powerful as you get access to a lot more functionality.

Summary
- Enabled by default but only for 90 days and no S3 Configuration by default
- Trails are how you configure S3 and CWLogs 
- Management events only by default
- IAM, STS, CloudFront --> Global Service Events
- NOT REALTIME - There is a delay


