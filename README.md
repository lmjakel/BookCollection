# LeeAnn Jakel Individual Project

## Problem Statement
Across the globe book lovers are struggling to remember what books they have
in their book collections when not at home to investigate. This Book Collection
application will allow users to catalog their book collection and view it from
anywhere: a bookstore, a friend's house, or even the comfort of their own couch.

The application will store book title, author, genre, ISBN, any notes the user 
wishes to add. I personally would add who I lent the book to in the notes section, 
but it could be used for a short personal review if preferred! The application 
will display the book information as well as the cover photo received by the API 
response. The application will allow the user to search for their book by 
part or all of the book title, genre, or author. They may also choose to view all 
of their books. 

I chose this project because I have quite a few books of my own, and many bookshelves
around my house. I sometimes have trouble remembering if I've read a book, or own a book,
or where I put that book if I do own it! Generally my books are organized but as I've
had to rearrange my house with various life events, it isn't always easy to remember
which books are where.

A future goal for this project is to add a location for the user to enter for eac
book. Ideally the user would be able to customize the location options for their
purposes. I think a customized location list would better serve the user, rather
than a pre-made list they choose from. Right now locations can be added to the notes
section if the user would like to keep track of where things are!

## Project Technologies/Techniques
* Security/Authentication
    * Tomcat's JDBC Realm Authentication
* Database
    * MySQL 8.0.22
* ORM Framework
    * Hibernate 5
* Dependency Management
    * Maven
* Web Service consumed using Java
    * http://openlibrary.org
* CSS
    * Pure CSS
* Data Validation
    * Form Validator for front end
    * Explore Hibernate's validation
* Logging
    * Log4J2
* Hosting
    * AWS
* Independent Research Topic/s
    * CI tools in AWS
    * API Integration
    * Hibernate Validation
    * Hibernate Search
    * Pure CSS
* IDE: IntelliJ IDEA
* API
    * GET 
    *POST 
    * JSON Response Type
* Database Operations
    * Full CRUD
* Project Lombok
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage

## Design
* [User Stories](DesignDocuments/userStories.md)
* [Flow](DesignDocuments/Flow.md)
* [ERD](DesignDocuments/ERD.png)

## Project Progress
* [Project Plan](ProjectPlan.md)
* [TimeLog](TimeLog.md)
* [Weekly Reflection](WeeklyReflection.md)
