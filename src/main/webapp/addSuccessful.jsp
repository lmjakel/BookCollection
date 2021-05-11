<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/2/21
  Time: 8:32 PM
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
                <h2 class="book-head is-center">Success!</h2>

                <div class="pure-g">
                    <div class="l-box pure-u-1 pure-u-md-1 pure-u-lg-1">
                        <p class="book-subhead">We added the following book to your collection:</p>

                        <table id="resultsTable" class="pure-table is-center" cellspacing="0" width="100%">
                            <tbody>
                            <tr>
                                <td>Title: ${books.title}</td>
                            </tr>
                            <tr>
                                <td>Author: ${books.author.name}</td>
                            </tr>
                            <tr>
                                <td>ISBN: ${books.isbn}</td>
                            </tr>
                            <tr>
                                <td>Genre: ${books.genre.name}</td>
                            </tr>
                            <tr>
                                <td>Notes: ${books.notes}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
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
