<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 4/30/21
  Time: 9:26 PM
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
        <div class="results-container">
            <div class="pure-g results">
                <h2 class="results-head pure-u-1">Confirm Modifications: </h2>
                <c:out value="${output}"/>
            </div>
        </div>
    </main>

</div>

</body>
</html>
