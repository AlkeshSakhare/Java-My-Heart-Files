import java.io.*;


class DeSerilalizeDemo
{
	public static void main(String[] args) throws Exception
	{
		//choose a file to Rerive Data

		FileInputStream fis	 = new FileInputStream("abc.txt");

		ObjectInputStream ois	 = new ObjectInputStream(fis);

		//Retrve data and Store in an Object
			
				Student	s1	= (Student)ois.readObject();

		//Student Object is Created...call disp method using ths Obj

				s1.disp();

		System.out.println("DeSerlization Done	:	open abc.txt to See Data");
	}
}
