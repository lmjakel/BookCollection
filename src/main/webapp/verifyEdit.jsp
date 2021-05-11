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
            <c:out value="Title:${books.title} Author:${books.author.name} ISBN:${books.isbn} Genre: ${books.genre.name} Notes: ${books.notes}" />

            <form id="bookForm" action ="EditBook" method="POST">

            <label for="notes">Edit your notes below</label>
            <input class="notes" id="notes" type="text" name="notes" value="${bookInfo.notes}">

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