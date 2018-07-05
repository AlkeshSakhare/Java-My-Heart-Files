//{13}ByUrChoiceOfOrder  --->  Retriving data by taking ur's Wish order

import java.sql.*;

public class ByUrChoiceOfOrder
{
	public static void main(String[] args)		throws Exception
	{

		//register driver in DManger Tabel
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		//Serch driver Using URL and Load that Driver & create CONNCTION objct
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		//create statement obj To SEND & EXICUTE qry
			Statement st = con.createStatement();

			//exicute it in DB & Gather Results in ResultSet Obj
			ResultSet rs = st.executeQuery("select *from student");												//rs		------------>   101		satya	hyd

				if(con!= null)
				{
				System.out.println("conn...ok");		
				
				}

			//process the Result Set Obj

			System.out.println("Sname		Sadd			Sno");		
			System.out.println("________________________________________________________________________________________");		
		
			while(rs.next())
			{
			
		System.out.println(rs.getString("sname")+"		"+rs.getString("sadd")+"			"+rs.getInt("sno"));		
			
			}

		//close Connection & all

			st.close();
			con.close();

	}
}
