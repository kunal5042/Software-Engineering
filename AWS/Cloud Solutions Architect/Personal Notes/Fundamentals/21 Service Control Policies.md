# Service Control Policies
1. **Account Permissions Boundaries**:
    - SCPs serve as boundaries for account permissions within AWS Organizations.
    - They define the scope of actions and services that an account (including the account root user) can access or manage.
    
2. **Limiting Account Actions**:    
    - SCPs limit what actions an account can perform on AWS services and resources.
    - They control access to specific APIs, services, or actions, helping enforce security policies and compliance requirements.

3. **No Permission Grants**:
    - SCPs do not grant any permissions directly to accounts or users.
    - Instead, they focus on restricting or denying access to certain functionalities, even if permissions are granted through IAM policies.

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240322162605.png)

SCP Overrides Identity Policies in Accounts

