![[Pasted image 20241214214839.png]]

Every event in Kafka is modelled as a record.
- An event in Kafka represents a significant occurrence, such as a transaction or user action, and is stored immutably in topics.
- Topics serve as logical groupings for similar events, akin to database tables, and each event is immutable and appended to the end of the topic.
- Partitions within topics are essential for distributing data across the Kafka cluster, allowing for efficient read and write operations.

A record has
- timestamp
- key
	- enforcing ordering
	- co-located data
	- key retention 
		- will update a link here
- value
	- payload
- headers
	- optional

# Topics
Organising events of the same type together in a database table.
![[Pasted image 20241214215147.png]]

All events published to the topic are immutable, append only.

Kafka is designed with distributed systems in mind, so Kafka topics are partitioned.

![[Pasted image 20241214215310.png]]




**Key Concepts: Retention and Ordering**
- Kafka ensures durability and ordering guarantees, with events stored in a way that they can be retrieved in the order they were produced.
- The key associated with each event is used to enforce ordering, co-locate related data, and manage retention policies.
- Kafka supports various serialization formats, allowing the flexibility to encode data as needed, enhancing interoperability with other systems.