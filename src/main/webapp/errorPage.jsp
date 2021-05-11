<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 5/11/21
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<!-- head-tag section -->
<c:import url="head-tag.jsp"/>
<!-- end head-tag -->


<!-- Body -->
<body>
<!-- main -->
<div class="splash-container">
    <div class="splash">
        <h1 class="splash-head">Oops!</h1>

        <p class="splash-subhead">
            We've encountered an error, please go back and try again!</p>
        <a href="index-logged-in.jsp">Home</a>
    </div>
</div>
<!-- end main -->

<!-- footer -->
<c:import url="footer.jsp" />
<!-- end footer -->
</body>
</html>