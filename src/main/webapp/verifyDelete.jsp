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

        <c:forEach var="bookInfo" items="${book}">
            <tr>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.title}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.genre.name}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.isbn}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.author.name}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.notes}</td>
            </tr>

        <form id="bookForm" action ="Services/ModifyBook" method="GET">

        <input>
            <label for="delete">Yes, delete the book></label>
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
