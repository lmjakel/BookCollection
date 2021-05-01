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
        <div class="container-fluid">
            <h2>Search Results: </h2>

            <table id="resultsTable" class="display" cellspacing="0" width="100%">
                <thead>
                <th style="border: 3px solid black; border-collapse: collapse">Title</th>
                <th style="border: 3px solid black; border-collapse: collapse">Genre</th>
                <th style="border: 3px solid black; border-collapse: collapse">ISBN</th>
                <th style="border: 3px solid black; border-collapse: collapse">Author</th>
                <th style="border: 3px solid black; border-collapse: collapse">Notes</th>
                <th style="border: 3px solid black; border-collapse: collapse">Delete</th>
                <th style="border: 3px solid black; border-collapse: collapse">Edit</th>



                </thead>

                <tbody>
                <jsp:useBean id="book" scope="request" type="java.util.List"/>
                <c:forEach var="bookInfo" items="${book}">
                    <tr>
                        <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.title}</td>
                        <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.genre.name}</td>
                        <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.isbn}</td>
                        <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.author.name}</td>
                        <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.notes}</td>
                        <td>
                            <form id="bookDeleteForm" action ="DeleteBook" method="GET">
                                <input type="hidden" value="${bookInfo.id}" id="bookId" name="bookId">
                                <input type="submit" value="delete" id="delete" name="modify">
                            </form>
                        </td>
                        <td>
                            <form id="bookEditForm" action ="EditBook" method="GET">
                                <input type="hidden" value="${bookInfo.id}">
                                <input type="submit" value="edit" id="edit" name="modify">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </main>
</body>
</html>
