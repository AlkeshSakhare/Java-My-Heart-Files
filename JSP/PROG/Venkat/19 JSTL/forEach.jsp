<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<c:forEach		var = "i" begin ="0" end = "50"	 step="5"  >
						<c:out value = "i value	:	${i}"/><br><br>
</c:forEach>


</h1>
</body>
</html>
