import java.net.*;

class UDPServer
{
	public static void main(String args[])
	{
		try{
			DatagramSocket ds = new DatagramSocket(Integer.parseInt(args[0]));
			byte b1[] = new byte[100];

			DatagramPacket rpack = new DatagramPacket(b1,b1.length);
			ds.receive(rpack);
			b1 = rpack.getData();
			InetAddress add = rpack.getAddress();
			int port = rpack.getPort();
			String s1 = new String(b1);
			String s2 = s1.trim();
			String s3 = s2.toUpperCase();
			byte b2[] = s3.getBytes();
			DatagramPacket spack = new DatagramPacket(b2,b2.length,add,port);
			ds.send(spack);
			ds.close();			
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}