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
        <div class="book-container">
            <div class="book">
                <h2 class="book-head pure-u-1">Add a Book</h2>
                    <p class="book-subhead">
                        Please enter the ISBN-13 (13 numbers found on the barcode on the back of the book).
                        Once your book is located, you will be prompted to select a genre and given the opportunity
                        to add notes.
                    </p>
                    <div class="pure-g l-box">
                        <div class="form-box pure-u-1">
                            <form id="bookForm" action ="AddBook" method="GET" class="pure-form">
                                <label for="isbn">ISBN: </label>
                                <input type="text" id="isbn" name="isbn" required>
                                <button class="pure-button pure-button-primary" type="submit" name="submit" value="submit">Add Book</button>
                            </form>
                        </div>
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
