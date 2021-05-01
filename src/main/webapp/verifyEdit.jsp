<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/1/21
  Time: 11:31 AM
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
            Edit your notes below
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
        </table>
        <form id="bookForm" action ="EditBook" method="POST">

            <label for="notes">Edit your notes below</label>
            <input class="notes" id="notes" type="text" name="notes" value="${bookInfo.notes}">

            <input name="bookId" value="${bookInfo.id}" type="hidden">
            <button class="formButton" type="submit" name="submit" value="submit">Confirm</button>
        </form>

        </c:forEach>

    </main>




</div>

</body>
</html>