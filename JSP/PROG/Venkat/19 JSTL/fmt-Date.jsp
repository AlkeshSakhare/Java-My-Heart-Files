<html>
<body bgcolor = black	text = red>
<h2>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/fmt"   prefix = "fmt"%>

<c:set var = "d"  value = "<%= new java.util.Date() %>" />

Date1		:<fmt:formatDate value ="${d}"/><br><br>
Date2		:<fmt:formatDate value ="${d}" type = "date"/><br><br>
time			:<fmt:formatDate value ="${d}" type = "time"/><br><br>
both		:<fmt:formatDate value ="${d}" type = "both"/><br><br>

Styles		:<fmt:formatDate value ="${d}" type = "both" dateStyle ="short"		timeStyle ="short"/><br><br>
Styles		:<fmt:formatDate value ="${d}" type = "both" dateStyle ="medium"		timeStyle ="medium"/><br><br>
Styles		:<fmt:formatDate value ="${d}" type = "both" dateStyle ="long"		timeStyle ="long"/><br><br>

Pattern	:<fmt:formatDate value ="${d}" type = "both" dateStyle ="short"		timeStyle ="short"	pattern = "h:m:s:d-M" /><br><br>



</h2>
</body>
</html>
