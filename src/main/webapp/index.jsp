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
        <div class="l-box-lrg is-center pure-u-1">
            <h2 class="content-head content-head-ribbon">User Guide</h2>
            <p>
                Supported verbs: Get, Post
            </p>
        </div>

    </div>
<!-- end main -->
<!-- footer -->
    <c:import url="footer.jsp" />
<!-- end footer -->
</div>

</body>
</html>

