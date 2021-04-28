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
        <form action ="searchBooks" method="GET">
            <button id="viewAllBooks" type="submit" name="submit" value="viewAll">View all books</button>

            <fieldset>
                <legend>How would you like to search for your book?</legend>
                <label for="author">Author</label>
                <input type="radio" value="author" id="author" name = type">
                <br>

                <label for="title">Title</label>
                <input type="radio" value="title" id="title" name = type">
                <br>

                <label for="genre">Genre</label>
                <input type="radio" value="author" id="genre" name = type">
            </fieldset>

            <label for="searchTerm">Enter Search Term: </label>
            <input type="text"  id="searchTerm" name="searchTerm">

            <button type="submit" name="submit" value="search">Search</button>
        </form>
    </main>
</body>
</html>
