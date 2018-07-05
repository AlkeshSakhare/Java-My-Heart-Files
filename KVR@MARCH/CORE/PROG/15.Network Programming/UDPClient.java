import java.net.*;

class UDPClient 
{
	public static void main(String args[])
	{
		try{
			InetAddress add = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);
			byte b1[] = new byte[100];
			System.out.println("Enter STRING in LowerCASE: ");

			System.in.read(b1);
			
			DatagramSocket ds = new DatagramSocket();
			DatagramPacket spack = new DatagramPacket(b1,b1.length,add,port);
			ds.send(spack);
			byte b2[] = new byte[100];
			DatagramPacket rpack = new DatagramPacket(b2,b2.length);
			ds.receive(rpack);
			b2 = rpack.getData();
			String s1 = new String(b2);
			String s2 = s1.trim();
			System.out.println("FROM SERVER : " +s2);
			ds.close();

		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}