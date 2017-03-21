# HibernateDemo
CRUD Operations example Using Hibernate



# Overview
Hibernate an open source Java persistence framework project. Perform powerful object relational mapping and query databases using HQL and SQL. [ Read more ](http://hibernate.org/).

## Tools & technologies used 
1.	Java 1.8
2.	Maven 3.2.
3.	Hibernate 5.x
4.	Mysql 5
5.	Eclipse

## Here are the steps required :
* Add Hibernate dependency and MySQL dependency in pom.xml
* Create Hibernate Configuration file 
* Create Entity Class
* Create Hibernate Utility Class
* execute CRUD methods


###	Dependencies (POM.xml)
```xml
   <dependency>
     <groupId>org.hibernate</groupId>
     <artifactId>hibernate-core</artifactId>
     <version>4.3.10.Final</version>
    </dependency>
    <dependency>
       <groupId>org.hibernate</groupId>
       <artifactId>hibernate-search-orm</artifactId>
       <version>5.3.0.Final</version>
    </dependency>
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.39</version>
</dependency> 
```
