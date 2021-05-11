<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LeeAnn Jakel
  Date: 2/11/21
  Time: 4:02 PM
--%>

<html>
<!-- head-tag section -->
<c:import url="head-tag.jsp"/>
<!-- end head-tag -->


<!-- Body -->
<body>
<!-- header -->
<c:import url="header.jsp" />
<!-- end header-->


<!-- main -->
<div class="splash-container">
    <div class="splash">
        <h1 class="splash-head">Welcome to your personal library database!</h1>

        <p class="splash-subhead">
            This application was designed to help book lovers around the world keep better track of their personal libraries.
            It's not always easy to remember the books that makeup your collection, where you have them stored, the author name,
            or any other notes you want to keep track of!
        </p>
    </div>
</div>

<div class="content-wrapper">
    <div class="content">
        <h2 class="content-head is-center">Capabilities</h2>

        <div class="pure-g">
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-4">
                <h3 class="content-subhead"><i>Add Book</i></h3>
                <ul>
                    <li>Enter the book ISBN-13 found on the barcode</li>
                    <li>Application will pull book information</li>
                </ul>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-4">
                <h3 class="content-subhead"><i>Search</i></h3>
                <ul>
                    <li>Search by part or all of an author's first name or last name</li>
                    <li>Search by part of all of a book title</li>
                    <li>Search by genre</li>
                    <li>View all books stored in your database</li>
                </ul>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-4">
                <h3 class="content-subhead"><i>Book Notes</i></h3>
                <ul>
                    <li>Keep track of who you loan a book to</li>
                    <li>Thoughts on characters</li>
                    <li>Opinion of the story itself</li>
                </ul>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-4">
                <h3 class="content-subhead"><i>Book Suggestions</i></h3>
                <ul>
                    <li>Books selected are based on your most popular genre</li>
                    <li>5 popular book selections will be displayed</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="ribbon l-box-lrg pure-g">
        <div class="ribbon-content l-box-lrg pure-u-1">
            <h2 class="content-head content-head-ribbon is-center">User Guide</h2>
            <section>
                <h3>Application functions:</h3>
                <ul>
                    <li>Add a book</li>
                    <li>Add notes to a new book</li>
                    <li>Modify notes on an existing book</li>
                    <li>Delete a book</li>
                    <li>Get book by author</li>
                    <li>Get book by title</li>
                    <li>Get book by genre</li>
                    <li>Get all books</li>
                    <li>Sign up a new user</li>
                </ul>
                <p>
                    To use the personal library application a user must create an account with a login and password.
                    Once the account is authenticated, and the username is verified to be unique, the user will be
                    able to access the application.
                    <br>
                    The user is able to add books to their collection. At this time adding books is only done through
                    the ISBN number. The Open Library API uses the ISBN to pull information about the book. I've chosen
                    only to use the Author, Title, ISBN, and Cover from the API. That information is stored in the
                    database, then the user is prompted to select a genre from a list and given the option to add notes
                    to their book.
                    <br>
                    After the user has added books they have the capability to edit any notes they've added to the book.
                    Book information will be displayed on the page and the he current notes will be in a textarea of
                    a form for editing. A message is displayed to the user confirming the change took place.
                    <br>
                    If the user gives a book away or loses a book (oh no!) they are able to delete that book from their
                    collection. Before the book is removed the user is asked to confirm that they do wish to remove the
                    book they selected, the book information will be displayed to the user with an option to select
                    yes or no in a form. If the user selects "yes" the book is removed, if the user selects "no" the
                    book is not removed. Regardless of the choice, a message is displayed to the user confirming the
                    change, or lack there of.
                </p>
            </section>
        </div>

    </div>
<!-- end main -->
<!-- footer -->
    <c:import url="footer.jsp" />
<!-- end footer -->
</div>

</body>
</html>

