# AWS Control Tower
- Quick and Easy setup of multi-account environment
- Orchestrates other AWS services to provide this functionality
- Organisations, IAM Identity Center, CloudFormation, Config and more
- Landing Zone - multi-account environment
- SSO/ID Federation, Centralised Logging & Auditing
- Guard Rails - Detect/Mandate rules/standards across all accounts
- Account Factory - Automates and Standardises new account creation
- Dashboard - single page oversight of the entire environment 


![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240323165801.png)
Figure summary 
- Control tower is created within an AWS account and this account becomes the management account

- Within the management account we have the control tower now which orchestrates everything, we have organisations units (this provides the multi account structure and service control policies) and Single Sign On (SSO) which is provided by the AWS IAM Centre.

- When Control Tower is setup it creates 2 organisational units 
	1. Foundational Organisation Unit (default name Security) - two AWS accounts within this unit.
		1. Audit Account (for users who need access to the audit information made available by CloudTower, or third party tools can perform auditing of your environment from this location)
			1. SNS - notification of changes to governance and security policies
			2. CloudWatch - monitor landing zone wide metrics
		2. Log Archive Account (for users who need all logging information for all enrolled accounts within landing zone, you have to grant access to this account and it provides secure read only archive account for logging)
			1. AWS Config
			2. CloudTrail
			
	2. Custom Organisations Unit (default name Sandbox)
		- Account Factory
			- Automatic creation, modification or deleting AWS accounts as per business needs
				- Can be interacted with Control Tower Console or / and Service catalog
				- Within custom organisation unit AF will create AWS accounts in fully automated way
			- For these accounts you have a baseline template and network baseline template
			- Control Tower uses CloudFormation under the cover to achieve this automation
			- Uses both AWS Config and Service Control Policies to implement guard rails

# Landing Zone
- Feature implemented to allow **Well Architected multi account environment** - Home Region
- Built with AWS Organisations, AWS Config, CloudFormation
- Control tower brings features of a lot of AWS Products together and orchestrates them
- Security OU - Log Archive & Audit Accounts (CloudTrail & Config Logs)
- Sandbox OU - Test/Less rigid security
- You can create other OU's and Accounts
	- Potentially even nested ones
- IAM Identity Centre (AWS SSO) - SSO, multiple-accounts, ID Federation
- Monitoring and Notifications - CloudWatch and SNS
- End User account provisioning via Service Catalog


# Guard Rails
- Guardrails are rules for multi account governance
- Mandatory, Strongly recommended or Elective
- Preventive - Stop you doing things within AWS accounts in your landing zone (AWS ORG SCP)
- Either they are enforced or are not enabled
- Example - allow or deny regions or disallow bucket policy changes within accounts in your landing zone
- Detective - compliance checks (AWS CONFIG rules)
- Three states: Clear, in violation or not enabled
- Preventive will stop things from happening whereas detective will only notify/point things


# Account Factory
- Automated account provisioning 
- Either done by cloud admins or end users (with appropriate permissions)
- Guardrails - automatically added
- Account admin given to a named user (IAM Identity Center)
- Account & network standard configuration
- Allows accounts to be closed or repurposed
- Can be fully integrated with a businesses SDLC via APIs

