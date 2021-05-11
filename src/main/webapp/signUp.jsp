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
        <div class="book-container">
            <div class="pure-g book">
                <h2 class="book-head pure-u-1">Sign Up!</h2>
                <p class="book-subhead">
                    <!-- displays error message if signup error -->
                    <c:set var="signUpError" value="${requestScope.Error}" />
                    <c:out value="${Error}" />
                </p>

                <div class=" form-box pure-u-1">
                   <form id="signUpForm" class="pure-form pure-form-aligned" action ="SignUp" method="POST">
                       <div class="pure-control-group" >
                       <label for="firstName">First Name: </label>
                        <input type="text" id="firstName" name="firstName" required>
                       </div>
                       <div class="pure-control-group" >
                        <label for="lastName">Last Name: </label>
                        <input type="text" id="lastName" name="lastName" required>
                       </div>
                       <div class="pure-control-group" >
                        <label for="userName">Username: </label>
                        <input type="text" id="userName" name="userName" required>
                       </div>
                       <div class="pure-control-group" >
                        <label for="email">Email: </label>
                        <input type="text" id="email" name="email" required>
                       </div>
                       <div class="pure-control-group" >
                       <label for="password">Password: </label>
                       <input type="text" id="password" name="password" required>
                       </div>

                        <button class="pure-button pure-button-primary" type="submit" name="submit" value="create">Create Account</button>
                    </form>

                    <!-- removes error message -->
                    <c:remove var="Error" scope="request" />

                </div>
            </div>
        </div>
        <!-- footer -->
        <c:import url="footer.jsp" />
        <!-- end footer -->
    </main>
</div>
</body>
</html>
