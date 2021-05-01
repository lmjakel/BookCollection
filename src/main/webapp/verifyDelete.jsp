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
        <jsp:useBean id="book" scope="request" type="java.util.List"/>
        <c:forEach var="bookInfo" items="${book}">
            <tr>
                <td>Title:</td><td>${bookInfo.title}</td>
            </tr>
            <tr>
                <td>Genre:</td><td>${bookInfo.genre.name}</td>
            </tr>
            <tr>
                <td>ISBN</td><td>${bookInfo.isbn}</td>
            </tr>
            <tr>
                <td>Author:</td><td>${bookInfo.author.name}</td>
            </tr>
            <tr>
                <td>Notes:</td><td>${bookInfo.notes}</td>
            </tr>
        </table>
        <form id="bookForm" action ="DeleteBook" method="POST">

            <label for="delete">Yes, delete the book</label>
            <input class="delete" id="delete" type="radio" name="confirmation" value="delete">
            <br>
            <label for="noDelete">No, I want to keep that book</label>
            <input class="noDelete" id="noDelete" type="radio" name="confirmation" value="noDelete">

            <input name="bookId" value="${bookInfo.id}" type="hidden">
            <button class="formButton" type="submit" name="submit" value="submit">Confirm</button>
        </form>

        </c:forEach>

    </main>




</div>

</body>
</html>
