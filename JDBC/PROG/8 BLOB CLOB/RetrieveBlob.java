 import java.sql.*;
 import java.io.*;
 class RetrieveBlob
 {
     public static void main(String args[])throws Exception
     {
       Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery("select * from blobtest");

       if(rs.next())
       {
         InputStream in=rs.getBinaryStream("img");

     	 FileOutputStream fos=new FileOutputStream("newpict.gif");

	     int bytesRead=0;
  	     byte [] buffer=new byte[4096];

    	 while((bytesRead=in.read(buffer))!=-1)
	     {
	        fos.write(buffer,0,bytesRead);
         }

		System.out.println("photo is stored in newpict.gif");

          fos.close();
	      in.close();
	      rs.close();
	      st.close();
	      con.close();
	   }//if
       }//main
     }//class