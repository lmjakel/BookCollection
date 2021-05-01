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
<h2>Welcome to your personal library database!</h2>
<p>
    This application was designed to help book lovers around the world keep better track of their personal libraries.
    It's not always easy to remember the books that makeup your collection, where you have them stored, the author name,
    or any other notes you want to keep track of!
</p>

<h3>Capabilities</h3>
<h4>Search</h4>
<ul>
    <li>Search by part or all of an author's first name or last name</li>
    <li>Search by part of all of a book title</li>
    <li>Search by genre</li>
    <li>View all books in your b</li>
</ul>

<h4>Book Notes</h4>
<ul>
    <li>Keep track of who you loan a book to</li>
    <li>Thoughts on characters</li>
    <li>Opinion of the story itself</li>
</ul>

<h4>Book Suggestions</h4>
<ul>
    <li>Based on your library genres</li>
    <li>5 popular book selections</li>
</ul>

<!-- end main -->

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->

</body>
</html>

