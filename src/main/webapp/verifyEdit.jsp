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
        <div class="book-container">
            <div class="book">
                <h2 class="book-head">Edit your book notes below</h2>


                <table id="resultsTable" class="pure-table is-center" cellspacing="0" width="100%">
                <tbody>
                <tr>
                    <td>Title: ${book.title}</td>

                    <td>Author: ${book.author.name}</td>

                    <td>ISBN: ${book.isbn}</td>

                    <td>Genre: ${book.genre.name}</td>

                    <td>Notes: ${book.notes}</td>
                </tr>
                </tbody>
                </table>

                <div class="form-box">
                    <form id="bookForm" class="pure-form pure-form-stacked" action ="EditBook" method="POST">
                        <label for="notes"></label>
                        <textarea name="notes" id="notes" class="pure-input-1" rows="10">${book.notes}</textarea>

                        <input name="bookId" value="${book.id}" type="hidden">

                        <button class="formButton" type="submit" name="submit" value="submit">Confirm</button>
                    </form>
                </div>
            </div>
        </div>

    </main>
    <!-- footer -->
    <c:import url="footer.jsp" />
    <!-- end footer -->
</div>

</body>
</html>