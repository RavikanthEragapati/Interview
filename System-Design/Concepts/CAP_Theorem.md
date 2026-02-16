#CAP Theorem - Distributed Systems (Database's)

The CAP theorem states that distributed data systems can only provide two of three guarantees simultaneously: 

* Consistency (all nodes see the same data)
* Availability (every request gets a response) and 
* Partition Tolerance (system works despite network failures). 

Because Network Partitions (P) are unavoidable, systems must choose between Consistency (CP) or Availability (AP) during faults.

## CP model (Consistency, Partition)
- NoSQL 
- you can be horizontally scalable because you can partition data 
- But doesn't provide ACID

## CA model (Consistency, Availability)
SQL - hard to implement data partition relational data


## AP model (Availability, Partition)
- Eventual Consistency 