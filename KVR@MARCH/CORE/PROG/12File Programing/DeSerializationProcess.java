import java.io.*;
import ser.SerializeSubClass;
import java.util.*;

public class  DeSerializationProcess 
{
	public static void main(String[] args)  throws Exception
	{
		SerializeSubClass ob = new SerializeSubClass();

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter file to Open	:");
		String file = sc.next();

		FileInputStream fos = new  FileInputStream(file);

		ObjectInputStream obj = new 		ObjectInputStream(fos);

		Object obb = obj.readObject();

		ob = (SerializeSubClass) obb;

	int sno	= ob.getSno();
	String sname=	ob.getSname();
	float mar = 	ob.getMarks();

	System.out.println(" sno	:"+sno);
	System.out.println(" sname	:"+sname);
	System.out.println(" marks	:"+mar);


	}
}
