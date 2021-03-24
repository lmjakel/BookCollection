<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/23/21
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Library</title>
</head>
<body>

<form action ="searchBooks" method="GET">
    <label for="searchTerm">Search By Title: </label>
    <input type="text"  id="searchTerm" name="searchTerm">

    <button type="submit" name="submit" value="search">Search</button>
    <button type="submit" name="submit" value="viewAll"> View all books</button>
</form>

</body>
</html>
