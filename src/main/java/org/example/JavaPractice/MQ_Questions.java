package org.example.JavaPractice;
/*
public class MQ_Questions package JavaBasic;

public class MQ_Questions {
        /*
//1. If you’re sending the same POST request repeatedly with the same data what status code you will get?
If we'll send the same request with same data , Api will give the same response code everytime but it totally depends
on the server supposedly if the service has some kind of rate limiting policies then it might fail with the 429 too many request error code
when we hit multiple apis at a certain a time frame which might throw 429 error code
and supposedly if the server encounter the same api witgh same data or duplocate data , then it might
throw 409 conflict error when we have duplicate data

//2. Find vowels in a string using Regular Expression.
Done

//3.Write a query to insert a column in the employee table
ALTER TABLE employee ADD COLUMN email varchar(255);

UPDATE email set email = "adc@ghsjs.com";



 //4. What is Absolute & Relative Path?

 See both the path used for searching the path
 absolute path is something which starts from parent dom strutre and ends to the child staruc ture
 And this can lead to an issue whenever FE make changes in the code , DOM structure can change  so we generally go for relatice x path which can reduce these
 kind of issues, syntax of relative xpath is //
 absolute xpath syntax is /


 //5. What is the difference between union & union all in SQL?

 Union operator is used to combine two or more select statement and removes duplicate rows
 where union all is used to combine two or more select statement using union all operator but does not remove
 duplicate rows

 //6. What is the difference between drop, delete & truncate?

 Drop is a command - DDL where it is used to delete the database and it cannever rolled back
 however delete command is used to delete the row in a table and it is dml and it can be  colled back
 where rruncate is something which cant be rolled back abd it is DDL and it is used delete all thevrows in the table and justr
 the fields will be remaining


 //


        */

