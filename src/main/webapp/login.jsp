<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/23/21
  Time: 1:32 PM
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
        <div class="form-box">
            <FORM ACTION="j_security_check" METHOD="POST">
                <TABLE>
                    <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username" required>
                    <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password" required>
                    <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
                </TABLE>
            </FORM>
        </div>
    </main>
</div>
</body>
</html>
