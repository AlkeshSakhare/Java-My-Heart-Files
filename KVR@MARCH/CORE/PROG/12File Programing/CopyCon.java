import  java.io.*;

class CopyCon 
{
	public static void main(String[] args)  throws Exception
	{

			String sf = args[0];
			String df = args[1];

			FileInputStream fis = new FileInputStream(sf);
			FileOutputStream fos = new FileOutputStream(df);

		int k;
		do
		{
			k = fis.read();
			char ch = (char) k;
			fos.write(ch);
		}		while ((fis.read())!=-1);
			
		System.out.println("Hello World!");
	}
}

