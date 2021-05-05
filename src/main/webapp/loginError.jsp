<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/10/21
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<
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
        Invalid username/password, please try again. <a href="login.jsp">Login</a>
        <br>
        Don't have an account set up? <a href="signup.jap">Click here to set up a profile</a>
    </main>
</div>
</body>
</html>
