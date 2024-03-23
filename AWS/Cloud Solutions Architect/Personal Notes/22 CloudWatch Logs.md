# CloudWatch
- Public service - usable from AWS or on-premises
- Store, Monitor and access logging data
- AWS Integrations - EC2, VPC Flow Logs, Lambda, CloudTrail, R53 and more
	- IAM and Service Roles provide access
- Can generate metrics based on logs - metric filter


```mermaid
flowchart TD
    subgraph Input["Logging Sources"]
        L1["AWS Services"]
        L2["APIs"]
        L3["Et Cetera"]
    end

    L4["Log Events: Timestamp Message"]

    subgraph LG["Log Group"]
        style LG fill:#f9f9f9,stroke:#cccccc,stroke-width:2px;
        LG1["Log Stream Instance i"]
        LG2["Log Stream Instance j"]
        LG3["Log Stream Instance k"]
    end

    style Input fill:#eaf2ff,stroke:#99c2ff,stroke-width:2px;
    style L4 fill:#f5f5f5,stroke:#d9d9d9,stroke-width:2px;
    style LG1, LG2, LG3 fill:#f0f0f0,stroke:#cccccc,stroke-width:2px;

    Input --> L4
    L4 --> LG

```

![](AWS/Cloud%20Solutions%20Architect/Personal%20Notes/Fundamentals/attachments/Pasted%20image%2020240322163925.png)

