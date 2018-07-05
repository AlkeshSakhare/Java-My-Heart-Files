<html>
<body>
<h1>Session True													[
<%@ page session = "true"%>
<%
String s1 = (String)session.getAttribute("uname");
out.println("Welcome		:"+s1);
%>
]
</h1>

</body>
</html>
