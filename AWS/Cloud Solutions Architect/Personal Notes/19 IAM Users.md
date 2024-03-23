IAM Users are an identity used for anything requiring long-term AWS access e.g. Applications, Service Accounts or Human users

```mermaid
graph TD
    Principal --> Request --> IAM
    Principal --> UP["U & P"] --- Authenticated_Identity --> IAM
    Principal --> Access_Keys --> IAM
    linkStyle default straight

```


# Amazon Resource Name (ARN)

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Screenshot%202024-03-22%20at%2011.10.25%20AM.png)

# Summary
- 5000 IAM users per account
- IAM User can be a member of 10 groups
- This has systems design impacts
- Internet-scale applications
- Large orgs & org merges
- IAM Roles & Identity Federation fix this (more later)

