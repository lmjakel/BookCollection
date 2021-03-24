<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head-tag.jsp"%>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#bookTable').DataTable();
    } );
</script>

<html>
<body>

<div class="container-fluid">
    <h2>Search Results: </h2>

    <table id="resultsTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th style="border: 3px solid black; border-collapse: collapse">Title</th>
        <th style="border: 3px solid black; border-collapse: collapse">Genre</th>
        <th style="border: 3px solid black; border-collapse: collapse">ISBN</th>
        <th style="border: 3px solid black; border-collapse: collapse">Author</th>
        </thead>

        <tbody>
        <c:forEach var="bookInfo" items="${book}">
            <tr>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.title}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.genre.name}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.isbn}</td>
                <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.author.lastName}, ${bookInfo.author.firstName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
