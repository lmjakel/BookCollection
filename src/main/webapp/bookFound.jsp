<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/15/21
  Time: 1:35 PM
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
        Please add the book genre and any notes you'd like saved!
    </p>

    <table>

    <jsp:useBean id="books" scope="request" type="java.util.List"/>
    <c:forEach var="bookInfo" items="${books}">
            <tr>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.title}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.isbn}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.author.name}</td>
            </tr>

        <form action="AddBook" method="POST">
            <label for="genre">Genre: </label>
            <select name="genre" id="genre">
                <option value="Action">Action</option>
                <option value="Adventure">Adventure</option>
                <option value="Children">Children's</option>
                <option value="Fantasy">Fantasy</option>
                <option value="Historical_Fiction">Historical Fiction</option>
                <option value="History">History</option>
                <option value="Mystery">Mystery</option>
                <option value="Non_Fiction">Non-Fiction</option>
                <option value="Other">Other</option>
                <option value="Romance">Romance</option>
                <option value="Science_Fiction">Science Fiction</option>
                <option value="Thriller">Thriller</option>
                <option value="Western">Western</option>
                <option value="Young_Adult">Young Adult</option>
            </select>

            <label for="notes">Add any notes about the book:</label>
            <textarea name="notes" id="notes" cols="30" rows="10"></textarea>

            <input name="bookId" value="${bookInfo.id}" type="hidden">
            <button class="formButton" type="submit" name="submit" value="submit">Add Book</button>

        </form>
    </c:forEach>

    </table>
</main>
</div>
</body>
</html>
