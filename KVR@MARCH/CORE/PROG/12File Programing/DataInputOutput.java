import java.io.*;



class DataInputOutput 
{
	public static void main(String[] args) throws Exception
	{

		DataInputStream di = new DataInputStream(System.in);
		System.out.println("1st :	");
		String a = di.readLine();

		System.out.println("2nd :	");
		String b = di.readLine();

		System.out.println("A :	"+a+"B	:"+b);
		int c = Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("Sum	:	"+c);
	}
}

