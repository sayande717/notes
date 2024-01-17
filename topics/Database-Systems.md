
# Basics

## Structured data
- Data that needs to be stored in a structured manner.
- Data stored in a RDB, ie a Relational Database, in the form of a relation/table. It is managed by a RDBMS.
- Users can operate on the data using DBMS/RDBMS. Possible operations: Insert, Add, Delete, Update.
- Examples: SQL Server, Oracle, MySQL, etc.

## Unstructured data: 
- Data that does not need to be stored in a particular pre-defined structure.
- Example: Websites, photos, videos, etc.

## File System vs DBMS
- Filesystems were used before DBMS existed.
- In 1970's, the user used to access data in their own system.
- Advantages of using databases & database management systems (`-`: filesystem, `+`: database):
    ```diff
    - Data is stored in 1 user's computer, and is only accessible by that particular user.
    + We have the data stored in a centralized server, and multiple users can access the data from anywhere (over the internet or other type of network).

    - Users need to download the full file even if they only want some specific data.
    + Users can send a query to the server to access only the data they need.

    - Users need to know the location of the file, to fetch it.
    + Users don't need to know details about the data ie where it is stored, how it is stored, etc. They can fetch the data just from sending a query.

    - Concurrency: In modern times, a lot of people access/update data from a server at the same time. File systems don't have any protocols to handle inconsistency & conflict during concurrent operations.
    + There are protocols in place to handle inconsistency & conflict during concurrent operations.

    - Security: Since filesystem is controlled by OS, there is no level-by-level control. No security protocols can be defined.
    + Role-based (hierarchical) security protocols are available, so different kinds of users are only allowed to access relevant data.
    
    - Redundancy: Multiple files with same content but different names, can be stored.
    + DBMS has various contraints to ensure we don't waste storage space by storing duplicate/redundant data. In ensures that only unique data can be stored.
    ```

# Data Models: ER Model, Relational Model, Object-Oriented Model, Network Model, Hierarchical Model

# Basics of keys
# Basics of Keys (especially foreign keys)
# Normalization
# Transaction Control & Concurrency: ACID property, R-W W-R W-W locking, Conflict Serializability, Recoverability, 2-Phase locking, timestamp ordering for concurrency
# SQL & Relational algebra: DDL, DML & DCL commands, constraints of various keys, Aggregate functions, Joins (natural, outer join, inner join), nested query
# Indexing: single-level (primary, cluster, secondary), multi-level (b-tree, b+ tree)
