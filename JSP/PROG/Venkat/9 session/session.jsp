<html>
<body>
<h1>


<% 


String s1 = request.getParameter("uname");
String s2 = request.getParameter("pword");


if(s1.equals(""))
{
out.println("	USER NAME plz.......");
out.println("<a href = login.html>Go back </a>");

}

else if(s2.equals(""))
{
out.println("	PASSWORD  plz.......");
out.println("<a href = login.html>Go back </a>");
}

	else
	{
out.println("WELCOME	"+s1);
session.setAttribute("uname",s1);
session.setAttribute("pword",s2);
out.println("<br><a href = true.jsp>TRUE </a><br>");
out.println("<br><a href = false.jsp>FALSE</a>");
}

%>

</h1>
</body>
</html>