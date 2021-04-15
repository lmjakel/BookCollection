<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/15/21
  Time: 12:51 PM
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


    <main>
        <form id="signUpForm" action ="SignUp" method="GET">
            <label for="firstName">First Name: </label>
            <input type="text" id="firstName" name="firstName">
            </br>

            <label for="lastName">Last Name: </label>
            <input type="text" id="lastName" name="lastName">
            </br>

            <label for="userName">Username: </label>
            <input type="text" id="userName" name="userName">
            </br>

            <label for="password">Password: </label>
            <input type="text" id="password" name="password">
            </br>

            <button class="formButton" type="submit" name="submit" value="create">Create Account</button>

        </form>

    </main>
</div>

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</body>
</html>
