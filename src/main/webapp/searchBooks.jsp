<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/23/21
  Time: 1:36 PM
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
            <div class="pure-g book">
                <h2 class="book-head pure-u-1">Search for a book</h2>

                <div class=" form-box l-box">
                    <form action ="SearchBooks" method="GET" class="pure-form">
                        <fieldset>
                            <legend class="pure-u-1">How would you like to search for your book?</legend>
                            <div class="pure-u-1-2 pure-u-md-1-2 pure-u-lg-1-2">
                            <label for="author" class="pure-radio">
                            <input  type="radio" value="author" id="author" name="type">Author</label>

                            <label for="title" class="pure-radio" >
                            <input type="radio" value="title" id="title" name="type">Title</label>

                            <label for="genre" class="pure-radio">
                            <input  type="radio" value="genre" id="genre" name="type">Genre</label>
                            </div>
                            <div class="pure-u-1-2 pure-u-md-1-2 pure-u-lg-1-2">
                            <label for="searchTerm">Enter Search Term: </label>
                            <input type="text"  id="searchTerm" name="searchTerm">
                            <br>
                            </div>

                            <div class="pure-u-1">
                            <label for="viewAll"  class="pure-radio">
                            <input type="radio" value="viewAll" id="viewAll" name="type">View All Books</label>
                            </div>
                        </fieldset>

                        <button type="submit" name="search" value="search">Search</button>
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
