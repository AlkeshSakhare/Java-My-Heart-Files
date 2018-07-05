<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:set	var = "a"	value = "10" /><br>
<c:set	var = "b"	value = "20" /><br>

<c:out value = "a value	: ${a}"/><br>
<c:out value = "b value	: ${b}"/><br>

<c:set	var = "c"	value = "${a+b}" /><br>
<c:out value = "SUM	: ${c}"/><br>
<c:out value = "SUB	: ${b-a}"/><br>
<c:out value = "MUL	: ${a*b}"/><br>

</h1>
</body>
</html>