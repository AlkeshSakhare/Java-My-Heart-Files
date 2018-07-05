<html>
<body bgcolor = red text = white>
<form action= "error.jsp">
<h1>THIS IS ERROR PAGE</h1>
<%@ page  isErrorPage= "true"%>
<% out.println("Error");%>

<a href = "sum.html">Goback</a>


</form>
</body>
</html>