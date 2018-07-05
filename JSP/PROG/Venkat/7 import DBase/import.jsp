<html>
<body bgcolor = red text = white>
<h1>import.jsp</h1>

<%@page import = "java.sql.*" %>

<%!ResultSet rs = null;
Connection con = null;
Statement st = null;
%>



<%  
		
		try
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a"); 

		st = con.createStatement();

		 rs = st.executeQuery("select * from student");

		 System.out.println("ok");
 		 System.out.println(rs.next());

		

		}catch(Exception e)
		{
		
		}

		while (rs.next())
		{
%>

<table   width = "4" border = "2" >
		<tr>
		<td>
		<%= rs.getString(1)%>
		</td>
		<td>
		<%= rs.getString(2)%>
		</td>
		<td>
		<%= rs.getString(3)%>
		</td>
		</tr>
</table>

		<%  } %>

		
Code is Executed
</body>
</html>