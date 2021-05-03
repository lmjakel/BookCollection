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
        <c:forEach var="bookInfo" items="${newBook}">
            <tr>
            <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.title}</td>
            <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.isbn}</td>
            <td style="border: 3px solid black; border-collapse: collapse">${bookInfo.author.name}</td>
            </tr>
        </c:forEach>
    </main>
</div>

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</body>
</html>
