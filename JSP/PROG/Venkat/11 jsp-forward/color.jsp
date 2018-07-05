<%
String s1 = request.getParameter("c");
%>


<%
if(s1.equals("red"))
{ %>


															<jsp:forward	page = "red.jsp"/>

<%
}

else if(s1.equals("green"))
{
%>
															<jsp:forward	page = "green.jsp"/>
<%
}

else 
{

%>
															<jsp:forward	page = "blue.jsp"/>
															<%
}

%>
