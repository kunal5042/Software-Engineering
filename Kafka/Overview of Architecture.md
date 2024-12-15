![[Pasted image 20241214214218.png]]

- Apache Kafka is designed as an event streaming system, enabling real-time processing of events as they occur.
- The architecture consists of a storage layer for efficiently storing event data and a processing layer that can scale independently.
- Events in Kafka are modelled as records containing a timestamp, key, value, and optional headers, allowing flexible data encoding.

**Data Management and APIs**
- Kafka offers two primitive APIs: the Producer API for publishing events and the Consumer API for reading them.
- Additionally, higher-level APIs such as the Connect API allow integration with external data sources and sinks, while the Stream API enables continuous processing of events using a SQL-like syntax.
- The separation of storage and processing layers is crucial for independent scaling and management of resources.

**Core Components**
- Kafka’s primary components include producers, consumers, and brokers. Producers publish events to Kafka topics, while consumers read these events.
- Each topic can have multiple partitions, which facilitate data distribution and parallel processing across different brokers.
- The unique offset assigned to each event within a partition ensures that events are delivered in the order they were produced.