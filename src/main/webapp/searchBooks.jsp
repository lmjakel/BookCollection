<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/23/21
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<!-- head section -->
<c:import url="head-tag.jsp"/>
<!-- end head-tag -->


<!-- Body -->
<body>

<!-- header -->
<c:import url="header-logged-in.jsp" />
<!-- end header-->
<div id="container">

    <main>
        <form action ="SearchBooks" method="GET">

            <fieldset>

                <legend>How would you like to search for your book?</legend>
                <label for="author">Author</label>
                <input type="radio" value="author" id="author" name="type">

                <label for="title">Title</label>
                <input type="radio" value="title" id="title" name="type">

                <label for="genre">Genre</label>
                <input type="radio" value="genre" id="genre" name="type">
                <br>

                <label for="searchTerm">Enter Search Term: </label>
                <input type="text"  id="searchTerm" name="searchTerm">
                <br>
                <br>

                <label for="viewAll">View All Books</label>
                <input type="radio" value="viewAll" id="viewAll" name="type">
                <br>
            </fieldset>

            <button type="submit" name="search" value="search">Search</button>
        </form>
    </main>
</body>
</html>
