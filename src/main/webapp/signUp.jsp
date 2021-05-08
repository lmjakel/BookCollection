<%--
  Created by IntelliJ IDEA.
  User: LeeAnn Jakel
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
        <!-- displays error message if signup error -->
        <c:set var="signUpError" value="${requestScope.Error}" />
        <c:out value="${Error}" />

       <form id="signUpForm" action ="SignUp" method="POST">
            <label for="firstName">First Name: </label>
            <input type="text" id="firstName" name="firstName">
            </br>

            <label for="lastName">Last Name: </label>
            <input type="text" id="lastName" name="lastName">
            </br>

            <label for="userName">Username: </label>
            <input type="text" id="userName" name="userName">
            </br>

            <label for="email">Email: </label>
            <input type="text" id="email" name="email">
            </br>

           <label for="password">Password: </label>
           <input type="text" id="password" name="password">
           </br>

            <button class="formButton" type="submit" name="submit" value="create">Create Account</button>
        </form>

        <!-- removes error message -->
        <c:remove var="Error" scope="request" />

    </main>
</div>

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</body>
</html>
