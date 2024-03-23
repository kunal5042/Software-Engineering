# Single PUT upload
- Default uploads are single blob of data in single data stream
- Limited to 5 Gb of data in one PUT call

# Multipart Upload
1. Data is broken up
2. Minimum data size is 100MB for multipart 
3. 10,000 max parts
	- Ranging between 5MB - 5GB in size
	- Last part can be smaller than 5MB
4. Parts can fail, and be restarted
5. Transfer rate is optimised as all parts are uploaded in parallel

# S3 Accelerated Transfer 
1. Switched off by default
	- Few constraints to enable 
		- Bucket name can not contain periods
		- Bucket name should be DNS compatible
2. Data is first transferred to the Edge locations from where it's directly forwarded to the regional bucket