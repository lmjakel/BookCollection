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
    <h1 class="splash">Welcome to your personal library database!</h1>
    <p class="splash-subhead">
        This application was designed to help book lovers around the world keep better track of their personal libraries.
        It's not always easy to remember the books that makeup your collection, where you have them stored, the author name,
        or any other notes you want to keep track of!
    </p>

    <div class="content-wrapper">
        <div class="content">
            <h2 class="content-head is-center">Capabilities</h2>


                <h3 class="content-subhead">Search</h3>
                <ul>
                    <li>Search by part or all of an author's first name or last name</li>
                    <li>Search by part of all of a book title</li>
                    <li>Search by genre</li>
                    <li>View all books in your b</li>
                </ul>
            </div>

            <h3>Book Notes</h3>
            <ul>
                <li>Keep track of who you loan a book to</li>
                <li>Thoughts on characters</li>
                <li>Opinion of the story itself</li>
            </ul>

            <h3>Book Suggestions</h3>
            <ul>
                <li>Based on your library genres</li>
                <li>5 popular book selections</li>
            </ul>
        </div>
    </div>
</div>
<!-- end main -->

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->

</body>
</html>

