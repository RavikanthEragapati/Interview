# ACID - Database

## A = Atomicity
Atomicity means a transaction is all-or-nothing either all its operations succeed, or none are applied. If any part fails, the entire transaction is rolled back to keep the database consistent.
- (BEGIN - COMMIT) ROLLBACK

## C = Consistency
Consistency ensures that a database transaction transforms the system from one valid state to another, maintaining all predefined rules.
- Foreign key
- column Constraints 


## I = Isolation
Isolation ensures that transactions run independently without affecting each other. Changes made by one transaction are not visible to others until they are committed.
- SELECT ... FOR UPDATE
- DB Row locking (exclusive lock on the row) 


## D = Durability
Durability ensures that once a transaction is committed, its changes are permanently saved, even if the system fails. The data is stored in non-volatile memory, so the database can recover to its last committed state without losing data.
- DB Transaction Log

---

## Other related topics :
* SAGA pattern (Microservices)
* Outbox pattern
* Eventual Consistency (NOSQL)