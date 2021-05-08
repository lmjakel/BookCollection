<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/7/21
  Time: 7:12 PM
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
<c:import url="header.jsp" />
<!-- end header-->
<div id="container">

    <!-- displays message if signup successful -->
    <c:set var="signUpSuccess" value="${requestScope.Success}" />
    <c:out value="${Success}" />

    You may now <a href="login.jsp">login</a> and start cataloging your books!
    <!-- removes success message -->
    <c:remove var="Success" scope="request" />

</main>
</div>

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</body>
</html>
