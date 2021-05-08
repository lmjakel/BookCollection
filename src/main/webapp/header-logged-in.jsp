<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 3/27/21
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<header>
    <div id="header">

        <div id="slogan">Personal Library</div>

    </div>

    <nav id="menu">
        <ul>
            <li><a href="index-logged-in.jsp">Home</a></li>
            <li><a href="addBook.jsp">Add Book</a></li>
            <li><a href="searchBooks.jsp">Search Library</a></li>
            <li><a href="bookSuggestions.jsp">Book Suggestions</a></li>
        </ul>
    </nav>

    <form action="LogoutUser" method="POST">
        <button type="submit" value="logout" name="logout">Logout</button>
    </form>
</header>