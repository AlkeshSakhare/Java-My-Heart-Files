<html>
<body bgcolor = red text = white>
<h1><center>Table<BR>
<table border= 5 >

<% for(int i=1;i<=20;i++)	{%>
<tr>
	<td><%= i %></td>
	<td>* 5 = </td>
	<td><%= (i*5) %></td>
	<tr>
<% } %>

</table>
</h1></center>
</body>
</html>