import java.util.*;
import java.io.*;


class PropertiesDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			
		System.out.println("");

		Properties p = new Properties();  // p-----> [   ]

		FileInputStream fis = new 	FileInputStream(args[0]);//fis  ------------>  [Data in file]

		p.load(fis);  // p ---> [data - - - - -]

		String sno = p.getProperty("sno");
		String sname = p.getProperty("sname");
		String smarks = p.getProperty("smarks");
		
		System.out.println("RollNo	 :	"+sno);
		System.out.println("Name	:	"+sname);
		System.out.println("Marks	:	"+smarks);

		fis.close();
		}
		catch (Exception e)
		{
		System.out.println("FileNot Found    /   Enter file From CMD promt");
		
		}
		
	}//main
}//class
