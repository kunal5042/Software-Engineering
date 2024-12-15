Key Insights for [Data Plane – Apache Kafka®'s Replication Protocol](https://www.youtube.com/watch?v=PPDffzAy86I)

**Overview of Kafka's Data Replication**  
- Apache Kafka's replication protocol is essential for maintaining data durability and availability across clusters.  
- Replication enables the development of mission-critical applications by providing fault tolerance through data redundancy.  
- Users can specify the number of replicas for a topic upon creation, allowing for resilience against failures.  

![[Pasted image 20241214222807.png]]

**Leader and Follower Roles**  
- Each partition in a Kafka topic designates one replica as the leader, while the others act as followers.  
- Producers send data to the leader, which then distributes it to the followers, ensuring all replicas are updated.  
- Consumers primarily read from the leader but can be configured to read from followers as well.  


**In-Sync Replicas (ISR)**  
- In-Sync Replicas are a key concept representing replicas that have fully caught up with the leader, ensuring data consistency.  
- The leader maintains a leader epoch, a unique identifier that helps track the version of the leader and the data it has processed.  
- Committed records are those that are acknowledged by the ISR, ensuring they are safe for consumption by consumers.  

**High Watermark and Data Commitment**  
- The High Watermark represents the offset before which all records are considered committed and safe for consumers.  
- The leader updates the High Watermark only after confirming that all in-sync replicas have received the corresponding records.  
- Followers receive updates on the High Watermark during fetch responses, ensuring they remain consistent with the leader's view of committed data.  

**Leader Election and Failure Handling**  
- In the event of a leader failure, Kafka quickly elects a new leader from the in-sync replicas, ensuring minimal disruption.  
- The new leader resumes accepting requests with a bumped leader epoch, facilitating continued data processing.  
- Consumers may encounter retriable errors during this transition, prompting them to retry fetch requests until the new leader stabilizes.  

![[Pasted image 20241215151333.png]]
**Follower Failures and Load Balancing**  
- If a follower becomes out of sync due to lag, it is removed from the ISR, allowing the leader to advance the High Watermark without waiting for slow replicas.  
- Load balancing among leaders is managed through the concept of preferred replicas, which aim to distribute the leader load evenly across brokers.  
- Regular checks ensure that leaders are assigned to preferred replicas, maintaining an efficient and balanced cluster operation.  