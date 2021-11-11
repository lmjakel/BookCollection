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

        </p>
    </div>
</div>


<div class="content-wrapper">
    <div class="content">
        <c:forEach var="bookInfo" items="${books}" end = "0">
            <h2 class="content-head is-center">${bookInfo.genre.name}</h2>
        </c:forEach>

        <div class="pure-g">
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <c:forEach var="bookInfo" items="${books}" end = "0">
                    <h3 class="content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                    <h4>${bookInfo.isbn}</h4>
                    <p>
                        <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                        ${bookInfo.description}
                    </p>
                </c:forEach>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <c:forEach var="bookInfo" items="${books}" begin = "1" end = "1">
                    <h3 class="content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                    <h4>${bookInfo.isbn}</h4>
                    <p>
                        <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                            ${bookInfo.description}
                    </p>
                </c:forEach>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <c:forEach var="bookInfo" items="${books}" begin = "2" end = "2">
                    <h3 class="content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                    <h4>${bookInfo.isbn}</h4>
                    <p>
                        <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                            ${bookInfo.description}
                    </p>
                </c:forEach>
            </div>
        </div>
    </div>
    <div class="ribbon l-box-lrg pure-g">
        <div class="ribbon-content l-box-lrg pure-u-1">
            <c:forEach var="bookInfo" items="${books}" begin = "3" end = "3">
                <h2 class="content-head content-head-ribbon is-center">${bookInfo.genre.name}</h2>
            </c:forEach>

            <div class="pure-g">
                <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                    <c:forEach var="bookInfo" items="${books}" begin = "3" end = "3">
                        <h3 class="ribbon-content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                        <h4>${bookInfo.isbn}</h4>
                        <p>
                            <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                                ${bookInfo.description}
                        </p>
                    </c:forEach>
                </div>
                <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                    <c:forEach var="bookInfo" items="${books}" begin = "4" end = "4">
                        <h3 class="ribbon-content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                        <h4>${bookInfo.isbn}</h4>
                        <p>
                            <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                                ${bookInfo.description}
                        </p>
                    </c:forEach>
                </div>
                <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                    <c:forEach var="bookInfo" items="${books}" begin = "5" end = "5">
                        <h3 class="ribbon-content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                        <h4>${bookInfo.isbn}</h4>
                        <p>
                            <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                                ${bookInfo.description}
                        </p>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>

    <div class="content">
        <c:forEach var="bookInfo" items="${books}" begin = "6" end = "6">
            <h2 class="content-head is-center">${bookInfo.genre.name}</h2>
        </c:forEach>

        <div class="pure-g">
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <c:forEach var="bookInfo" items="${books}" begin = "6" end = "6">
                    <h3 class="content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                    <h4>${bookInfo.isbn}</h4>
                    <p>
                        <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                            ${bookInfo.description}
                    </p>
                </c:forEach>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <c:forEach var="bookInfo" items="${books}" begin = "7" end = "7">
                    <h3 class="content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                    <h4>${bookInfo.isbn}</h4>
                    <p>
                        <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                            ${bookInfo.description}
                    </p>
                </c:forEach>
            </div>
            <div class="l-box pure-u-1 pure-u-md-1-2 pure-u-lg-1-3">
                <c:forEach var="bookInfo" items="${books}" begin = "8" end = "8">
                    <h3 class="content-subhead"><i>${bookInfo.title} By:${bookInfo.author.name}</i></h3>
                    <h4>${bookInfo.isbn}</h4>
                    <p>
                        <img  src="https://covers.openlibrary.org/b/isbn/${bookInfo.isbn}-S.jpg" alt="book cover">
                            ${bookInfo.description}
                    </p>
                </c:forEach>
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