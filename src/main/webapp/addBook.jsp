<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/27/21
  Time: 10:01 AM
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
        <h2>Add a Book</h2>
        <p>
            Please enter the ISBN (13 numbers found on the barcode on the back of the book). If your book is already
            in the system you will be asked to select a genre and add notes. If the ISBN cannot be found you will be
            prompted to manually enter the Title, Author, Genre, and ISBN into the database.
        </p>
        <form id="bookForm" action ="AddBook" method="GET">
            <label for="isbn">ISBN: </label>
            <input type="text" id="isbn" name="isbn">
            </br>

            <button class="formButton" type="submit" name="submit" value="submit">Add Book</button>

        </form>

    </main>
</div>

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</body>
</html>
