<html>
<body bgcolor = red text = white>
<form action= "error.jsp">
<h1>Divide</h1>
<h2>
<%@ page errorPage = "error.jsp"	 isErrorPage= "false"%>

<%
String s1 = request.getParameter("num1");
String s2 = request.getParameter("num2");

int x = Integer.parseInt(s1);
int y = Integer.parseInt(s2);
int z = (x/y);

out.println("RESULT	 ="+z );%>
</h2>

</form>
</body>
</html>