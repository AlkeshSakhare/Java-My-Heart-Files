import java.io.*;
import java.net.*;

class client 
{
	public static void main(String args[])
	{
		try{
			String add = args[0];
			int port = Integer.parseInt(args[1]);			
			Socket s = new Socket(add,port);
			OutputStream out = s.getOutputStream();
			InputStream in = s.getInputStream();
			byte b1[] =  new byte[10];
			byte b2 []= new byte[10];
			while(true)
			{
				System.out.println("Satya	: 	");
				System.in.read(b1);
				in.read(b2);
				String s1 = new String(b2);
				String s2 = s1.trim();
				System.out.println("Sunny 	:	"+s2); 
				
			}	
			 }catch(Exception e)
			{
				System.err.println(e);
			}
	}

}