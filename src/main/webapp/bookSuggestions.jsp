<%@include file="taglib.jsp"%>
<c:set var="title" value="Book Suggestions" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#bookSuggestionsTable').DataTable();
    } );
</script>


<!-- head-tag section -->
<c:import url="head-tag.jsp"/>
<!-- end head-tag -->


<!-- Body -->
<body>
<!-- header -->
<c:import url="header-logged-in.jsp" />
<!-- end header-->


<!-- main -->

<div class="splash-container">
    <div class="splash">
        <h1 class="splash-head">Book Suggestions!</h1>

        <p class="splash-subhead">
            <c:forEach var="bookInfo" items="${books}">
                <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                ${bookInfo.title}
                ${bookInfo.isbn}
                ${bookInfo.genre.name}
                ${bookInfo.author.name}
            </c:forEach>
        </p>
    </div>
</div>


<div class="content-wrapper">
    <div class="content">
        <h2 class="content-head is-center">Genre1</h2>
        <div class="pure-g">
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <h3 class="content-subhead"><i>TItle/Author</i></h3>
                <p>
                    Description
                </p>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <h3 class="content-subhead"><i>Title/Author</i></h3>
                <p>Description
                </p>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <h3 class="content-subhead"><i>Title/Author</i></h3>
                <p>Description
                </p>
            </div>
        </div>
    </div>
    <div class="ribbon l-box-lrg pure-g">
        <div class="ribbon-content l-box-lrg pure-u-1">
            <h2 class="content-head content-head-ribbon is-center">Genre2</h2>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-2">
                <h3><i>Title/Author</i></h3>
                <p>
                   Description
                </p>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-2">
                <h3><i>Title/Author</i></h3>
                <p>
                    Description
                </p>
            </div
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-2">
                <h3><i>Title/Author</i></h3>
                <p>
                    Description
                </p>
            </div>

        </div>

    </div>
    <!-- end main -->
    <!-- footer -->
    <c:import url="footer.jsp" />
    <!-- end footer -->
</div>

</body>
</html>