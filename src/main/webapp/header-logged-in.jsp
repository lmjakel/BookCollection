<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/27/21
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<header class="header">
    <div class="home-menu pure-menu pure-menu-horizontal pure-menu-fixed">
        <a class="pure-menu-heading" href="index-logged-in.jsp">Personal Library</a>

        <ul class="pure-menu-list">
            <li class="pure-menu-item"><a href="index-logged-in.jsp" class="pure-menu-link">Home</a></li>
            <li class="pure-menu-item"><a href="addBook.jsp" class="pure-menu-link">Add Book</a></li>
            <li class="pure-menu-item"><a href="searchBooks.jsp" class="pure-menu-link">Search Library</a></li>
            <li class="pure-menu-item"><a href="bookSuggestions.jsp" class="pure-menu-link">Book Suggestions</a></li>

            <li class="pure-menu-item">
                <form action="LogoutUser" method="POST">
                    <button type="submit" value="logout" name="logout">Logout</button>
                </form>
            </li>
        </ul>
    </div>
</header>