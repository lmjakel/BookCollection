<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/10/21
  Time: 5:00 PM
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

<div id="container">
    <main>
        <div class="book-container">
            <div class="pure-g book">
                <h2 class="book-head pure-u-1">Invalid username/password, please try again</h2>
                <p class="book-subhead">
                    <a href="login.jsp">Login</a>
                    <br>
                    Don't have an account set up? <a href="signUp.jsp">Click here</a> to set up a profile
                </p>
            </div>
        </div>
    </main>
</div>
</body>
</html>
