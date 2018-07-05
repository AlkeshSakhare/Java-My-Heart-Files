<html>
<body bgcolor = red text = white>
<h1><center>
<%@ page buffer = "1888kb" autoFlush = "true"%>
<% out.println("Buffer");%>
<% 
for(int i = 0; i<=1;i++)
{
	out.println("<img src = 'img.jpg' >");
}
%>
</h1></center>
</body>
</html>