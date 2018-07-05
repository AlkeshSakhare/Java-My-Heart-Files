<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<c:set	var = "a"	value = "-80" />

<c:if test = "${a<0}">
<c:out value = "Negative bcoz	a = ${a}	"/>
</c:if>

<c:if test = "${a>0}">
<c:out value = "Positive  bcoz	a = ${a}	"/>
</c:if>


</h1>
</body>
</html>
