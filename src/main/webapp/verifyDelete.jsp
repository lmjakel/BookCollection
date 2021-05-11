<%--
  Created by IntelliJ IDEA.
  User: ljakel
  Date: 4/30/21
  Time: 1:26 PM
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
        <p>
            Are you sure you want to delete your book?
        </p>

        <table>
            <c:out value="Title:${books.title} Author:${books.author.name} ISBN:${books.isbn} Genre: ${books.genre.name} Notes: ${books.notes}" />

            <form id="bookForm" action ="DeleteBook" method="POST">

            <label for="delete">Yes, delete the book</label>
            <input class="delete" id="delete" type="radio" name="confirmation" value="delete">
            <br>
            <label for="noDelete">No, I want to keep that book</label>
            <input class="noDelete" id="noDelete" type="radio" name="confirmation" value="noDelete">

            <input name="bookId" value="${books.id}" type="hidden">
            <button class="formButton" type="submit" name="submit" value="submit">Confirm</button>
        </form>


    </main>

    <!-- footer -->
    <c:import url="footer.jsp" />
    <!-- end footer -->
</div>
</body>
</html>
