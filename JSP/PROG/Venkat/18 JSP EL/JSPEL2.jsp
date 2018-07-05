<html>
<body bgcolor = yellow	text = red>
<h2>JSPEL 2ND PROGRAMME <br>
<%

	pageContext.setAttribute("item1","J2SE",pageContext.PAGE_SCOPE);
	pageContext.setAttribute("item2","J2EE",pageContext.REQUEST_SCOPE);
	pageContext.setAttribute("item3","J2ME",pageContext.SESSION_SCOPE);
	pageContext.setAttribute("item4","J2FX",pageContext.APPLICATION_SCOPE);

%>

${pageScope.item1} <br>
${requestScope.item1} <br>
${sessionScope.item1} <br>
${applicationScope.item1} <br>

${pageScope.item1} <br>
${requestScope.item2} <br>
${sessionScope.item3} <br>
${applicationScope.item4} <br>


</h2>
</body>
</html>