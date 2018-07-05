<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:set	var = "a"	value = "10" /><br>
<c:set	var = "b"	value = "20" /><br>
Before Remove..............<br><br><br>
<c:out value = "a value	: ${a}"/><br>
<c:out value = "b value	: ${b}"/><br>
After Remove.....................<br><br><br>
<c:remove var = "a"/>
<c:out value = "a value	: ${a}"/><br>
<c:remove var = "b"/>
<c:out value = "b value	: ${b}"/><br>



</h1>
</body>
</html>
