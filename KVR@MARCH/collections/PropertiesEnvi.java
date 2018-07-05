import java.util.*;
import java.io.*;


class PropertiesEnvi
{

	public static void main(String[] args) 
	{
			
		System.out.println("");

		Properties p = System.getProperties();

		
		System.out.println("---------------------------------------");

		Enumeration e = p.keys();// e ---->[10,20...................ALL KEYS]

		while(e.hasMoreElements())
			{
		Object evKey = e.nextElement();//KEY = 10
		Object evValue = p.get(evKey);
		System.out.println(evKey+"	=		"+evValue);
		}

		
		
		
	}//main
}//class
