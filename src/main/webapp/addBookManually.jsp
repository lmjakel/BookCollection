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
                    Please enter the book information required below. </p>
                <p>
                    If you have located your ISBN-13 (13 numbers found on the barcode on the back of the book) please
                    <a href="addBook.jsp" class="pure-menu-link">click here</a> to return to add your book by ISBN. If
                    there is no ISBN or the book cannot be found, please fill out the form below!
                </p>
                <div class="pure-g l-box">
                    <div class="form-box pure-u-1">

<%--TODO create form for manual entry of book--%>

                        <form id="bookForm" action ="AddBookManually" method="GET" class="pure-form">
                            <fieldset>
                            <legend>Book Form</legend>
                            <label for="isbn">ISBN: (optional) </label>
                            <input type="text" id="isbn" name="isbn">
                            <br>

                            <label for="title">Title: </label>
                            <input type="text" id="title" name="title" required>
                            <br>


                            <label for="author">Author: </label>
                            <input type="text" id="author" name="author" required>
                            <br>


                            <label for="genre">Genre: </label>
                            <select name="genre" id="genre" required>
                                <option value="Action">Action</option>
                                <option value="Adventure">Adventure</option>
                                <option value="Children">Children's</option>
                                <option value="Fantasy">Fantasy</option>
                                <option value="Historical Fiction">Historical Fiction</option>
                                <option value="History">History</option>
                                <option value="Mystery">Mystery</option>
                                <option value="Non Fiction">Non Fiction</option>
                                <option value="Other">Other</option>
                                <option value="Romance">Romance</option>
                                <option value="Science Fiction">Science Fiction</option>
                                <option value="Thriller">Thriller</option>
                                <option value="Western">Western</option>
                                <option value="Young Adult">Young Adult</option>
                            </select>
                            <br>

                            <textarea name="notes" id="notes" class="pure-input-2-3" rows="8"></textarea>


                            <button class="pure-button pure-button-primary" type="submit" name="submit" value="submit">Add Book</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </main>

</div>


<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</div>
</body>
</html>
