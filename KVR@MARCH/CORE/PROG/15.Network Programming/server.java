import java.io.*;
import java.net.*;

class server 
{
	public static void main(String args[])
	{
		try{
			int port = Integer.parseInt(args[0]);
			ServerSocket ss = new ServerSocket(port);
			while(true)
			{
				Socket s =ss.accept();
				InputStream in = s.getInputStream();
				OutputStream out = s.getOutputStream();
				byte b1[]  = new byte[10];
				byte b2[] = new byte[10];
				while(true)
				{
				in.read(b1);
				String s1 = new String(b1);
				String s2 = s1.trim();
				System.out.println("Satya 	:	"+s2);
				System.out.println("Syama	:	");
				System.in.read(b2);
				out.write(b2);
				}
			}		   
		     }catch(Exception e)
			{
			System.err.println(e);
			}
	}


}