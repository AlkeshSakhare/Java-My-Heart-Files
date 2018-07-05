<html>
<body bgcolor = black	text = red>
<h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
Number1	:<fmt:formatNumber	value=	"300"	type="number"/><br>
Number2	:<fmt:formatNumber	value=	"300.000"	type="number"/><br>

Number3	:<fmt:formatNumber	value=	"33333666.23456789"	type="number" maxIntegerDigits= "5"minIntegerDigits= "3"/><br>
Number4	:<fmt:formatNumber	value=	"33333666.23456789"	type="number" minFractionDigits= "2"maxFractionDigits= "4"/><br>

Def.Currency1	:<fmt:formatNumber	value=	"300"	type="currency" /><br>
!.Currency2	:<fmt:formatNumber	value=	"300"	type="currency"  currencySymbol = "!"/><br>

percent X 100	:<fmt:formatNumber	value=	"9"	type="percent"/><br>






</h1>
</body>
</html>
