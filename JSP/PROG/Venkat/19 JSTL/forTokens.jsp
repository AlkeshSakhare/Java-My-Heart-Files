<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<c:forTokens		var = "s" delims= "." items = "one.two.three.four.five.siX"  >
						<c:out value = "Tokens Are	:	${s}"/><br><br>
</c:forTokens>


</h1>
</body>
</html>
