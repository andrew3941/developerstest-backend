# developerstest-backend
# What is the CRUD operation?
# The CRUD stands for Create, Read/Retrieve, Update, and Delete. These are the four basic functions of the persistence storage.

# The CRUD operation can be defined as user interface conventions that allow view, search, and modify information through computer-based forms and reports. CRUD is data-oriented and the standardized use of HTTP action verbs. HTTP has a few important verbs.

-POST: Creates a new resource
-GET: Reads a resource
-PUT: Updates an existing resource
-DELETE: Deletes a resource
Within a database, each of these operations maps directly to a series of commands. However, their relationship with a RESTful API is slightly more complex.

# Standard CRUD Operation
CREATE Operation: It performs the INSERT statement to create a new record.
READ Operation: It reads table records based on the input parameter.
UPDATE Operation: It executes an update statement on the table. It is based on the input parameter.
DELETE Operation: It deletes a specified row in the table. It is also based on the input parameter.
How CRUD Operations Works
CRUD operations are at the foundation of the most dynamic websites. Therefore, we should differentiate CRUD from the HTTP action verbs.

Suppose, if we want to create a new record, we should use HTTP action verb POST. To update a record, we should use the PUT verb. Similarly, if we want to delete a record, we should use the DELETE verb. Through CRUD operations, users and administrators have the right to retrieve, create, edit, and delete records online.

We have many options for executing CRUD operations. One of the most efficient choices is to create a set of stored procedures in SQL to execute operations.

The CRUD operations refer to all major functions that are implemented in relational database applications. Each letter of the 
CRUD can map to a SQL statement and HTTP methods.

# Spring Boot JpaRepository
JpaRepository provides JPA related methods such as flushing, persistence context, and deletes a record in a 
batch. It is defined in the package org.springframework.data.jpa.repository. JpaRepository extends both CrudRepository
 and PagingAndSortingRepository.

# To view your H2 in-memory datbase
The 'test' profile runs on H2 in-memory database. To view and query the database you
 can browse to http://localhost:2021/h2-console. Default username is 'sa' with a password 'kamara'.
 
 ## Entry point for h2
![entry point for h2](https://user-images.githubusercontent.com/77746680/169733905-a1f95baf-5ab7-42d5-b56b-a940aeb9f871.png)

## select record from h2

![select record from the h2 database](https://user-images.githubusercontent.com/77746680/169734048-ef89fc96-d2fd-4c17-b10b-a89f71106a58.png)
