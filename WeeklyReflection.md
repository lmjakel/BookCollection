# Weekly Reflection

## Week 1
Time Spent On Project: 30 minutes<br/>
This week I solidified my project idea with Paula and posted in Slack what my 
project will include, and why I chose to pursue this idea!

## Week 2
Time Spent On Project: 1 hour <br/>
During activity 3 we set up this repository in GitHub and learned about the
general set up we will be using. This is my first semester with IntelliJ, so 
some of these tasks take longer than I anticipate. That will, hopefully, 
improve as time goes on, and I have more practice with the program!

## Week 3
Time Spent On Project: 4 hours <br/>
During week 3, I used Figma to create the wireframes for the website, and the user flow
diagram. I added the pdf versions of those documents to the project folder and explained
the user flow in the Flow.md file. There is also a file called Ideas in the DesignDocuments
that I created as a rough sketch of the website components and what I hope to include. 
That will be my brainstorming file for this project, that way all my thoughts and ideas
stay in one place!

## Week 4
Time Spent On Project: 30 minutes <br/>
During week 4, I finished my userStories for checkpoint 1, updated my timeLog and
my weekly reflections for week 3 and the first part of week 4.

## Week 5
Time Spent on Project: 0 minutes <br/>

## Week 6
Time Spent on Project: 2.5 Hours<br/>
Discussed project during design review with Lisa. <br/>
Created Classes for the different tables in the database as well as created a test 
database with the corresponding classes and directories.

## Week 7 
Time Spent on Project: 2 Hours <br/>
So far this week I have created the AuthorDao and BookDao classes with their 
corresponding test classes. All tests pass at this point with a good % coverage.
So far I have separate Dao classes for ease of set up and work through at this
point. 

## Week 8
Time Spent on Project: 0 Hours <br/>

## Week 9
Time Spent on Project: 5 Hours <br/>
I implemented OpenLibrary API for week 8 exercise, I am considering using that 
to fill all the book data in rather than having the user enter all the data
by hand. That way they would just have to enter the isbn and then confirm the 
correct information was pulled based on the isbn they entered. I'm also hoping
to use the API to display the cover art for the books. 

I created the GenericDao and updated tests to correlate, all tests pass! 

Created SearchBook and results jsp, as well as searchBooks servlet. I was able
to get the jsp to display on the webpage and correctly search all books as well 
as search by title or part of title. These are displayed on a result jsp page, 
at this time they do not sort and only display for the user that is currently 
logged in but that is the goal in the long run. 

The application was successfully deployed using AWS after creating the database
and tables via ssh in the terminal window. 

## Week 10 - 11
No time spent on project due to team project

## Week 12
Time Spent on Project: 2.5 Hours <br/>

This week I was working to create a user SignUp page and get the API to connect
to get a book using the ISBN number.

## Week 13
Time Spent on Project: 2 Hours <br/>

I created an API getAuthor method in the API dao

## Week 14
Time Spent on Project: 16 Hours <br/>

This week I created the bulk of the jsp layouts and getting the pages set up properly. I was working
to allow a user to edit and delete books from their database. I had a bit of a snag during that phase,
because I wanted the user to be able to verify what book they were deleting or editing, rather
than just blindly deleting a book only to find out you clicked on the wrong line!

## Week 15
Time Spent on Project: 16 Hours <br/>

This week I was able to get a lot more work done, yay for healthy babies that are willing to sleep a
bit more by themselves! I added Lombok to the java bean classes, connected the API to get the cover
photos and have those displayed in the results table. There was a struggle getting the API to connect
to my website for adding a book. It turns out there was a security issue so Paula helped me rewrite
the code to connect to the API and get the book information translated between the openlibrary website
and mine!

## Week 16
Time Spent on Project: 16 Hours <br/>

This week (3 days) I was working on finalizing the code, and implementing the Pure CSS. That was
a bit challenging to learn but it was similar to bootstrap and the examples on the purecss.io page
were incredibly useful! I also made sure to update my time log, the weekly reflections (oops got a
little behind on these). I created an error handling in the web.xml file to route 404, 403, and 500
errors to an error jsp page.
