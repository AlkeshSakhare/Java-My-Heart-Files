<html>
<body bgcolor = black	text = red>
<h2>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/functions"   prefix = "fn"%>

<c:set var = "s1"  value = "WELCome"/>  
<c:set var = "s2"  value = "${fn:toUpperCase(s1)}"/>  
<c:set var = "s3"  value = "${fn:toLowerCase(s1)}"/>  
<c:set var = "s4"  value = "${fn:length(s1)}"/>  
<c:set var = "s5"  value = "${fn:startsWith(s2,s1)}"/>  
<c:set var = "s6"  value = "${fn:endsWith(s2,s1)}"/>  

Actual	:	<c:out value = "${s1}"/><br><br>
Upper	:	<c:out value = "${s2}"/><br><br>
Lower	:	<c:out value = "${s3}"/><br><br>
Length	:	<c:out value = "${s4}"/><br><br>

starts	:	<c:out value = "${s5}"/><br><br>
ends	:	<c:out value = "${s6}"/><br><br>



</h2>
</body>
</html>
