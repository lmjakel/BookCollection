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
    <div class="book-container">
        <div class="book">
            <h2 class="book-head">We found your book</h2>
                <h3 class="book-subhead">
                    Please add the book genre and any notes you'd like saved
                </h3>

            <div class="pure-g">
                <div class="l-box pure-u-1 pure-u-md-1 pure-u-lg-1">
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
                        </tbody>
                    </table>
                </div>

                <div class="form-box pure-u-1">
                    <form class="pure-form pure-form-aligned" action="AddBook" method="POST">
                        <div class="pure-control-group">
                            <label for="genre">Genre: </label>
                            <select name="genre" id="genre">
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
                        </div>
                        <br>

                        <div class="pure-control-group">
                            <label for="notes">Add any notes about the book:</label>
                            <textarea name="notes" id="notes" class="pure-input-2-3" rows="8"></textarea>
                        </div>
                        <br>

                        <input name="bookId" value="${books.id}" type="hidden">
                        <button class="pure-button pure-button-primary" type="submit" name="submit" value="submit">Add Book</button>
                    </form>
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
