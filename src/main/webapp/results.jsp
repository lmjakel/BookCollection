<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#bookTable').DataTable();
    } );
</script>


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
        <div class="results-container">
            <div class="pure-g results">
                <h2 class="results-head pure-u-1">Search Results: </h2>

                <div class="l-box pure-u-1">
                    <table id="resultsTable" class="pure-table pure-table-bordered" cellspacing="0" width="100%">
                        <thead>
                            <th >Cover Photo</th>
                            <th >Title</th>
                            <th >ISBN</th>
                            <th >Genre</th>
                            <th >Author</th>
                            <th >Notes</th>
                            <th >Delete</th>
                            <th >Edit</th>
                        </thead>

                        <tbody>
                            <c:forEach var="bookInfo" items="${book}">
                                <tr>
                                    <td><img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover"></td>
                                    <td >${bookInfo.title}</td>
                                    <td >${bookInfo.isbn}</td>
                                    <td >${bookInfo.genre.name}</td>
                                    <td >${bookInfo.author.name}</td>
                                    <td >${bookInfo.notes}</td>
                                    <td>
                                        <form id="bookDeleteForm" action ="DeleteBook" method="GET">
                                            <input type="hidden" value="${bookInfo.id}" class="bookId" name="bookId">
                                            <input type="submit" value="delete" id="delete" name="modify">
                                        </form>
                                    </td>
                                    <td>
                                        <form id="bookEditForm" action ="EditBook" method="GET">
                                            <input type="hidden" value="${bookInfo.id}" class="bookId" name="bookId">
                                            <input type="submit" value="edit" id="edit" name="modify">
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </main>
</div>
</body>
</html>
