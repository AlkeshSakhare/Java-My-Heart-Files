import java.io.*;


class SerilalizeDemo
{
	public static void main(String[] args) throws Exception
	{
		//choose a file to store data

		FileOutputStream fos	 = new FileOutputStream("abc.txt");

		ObjectOutputStream oos	 = new ObjectOutputStream(fos);

		//crete an Object Using data

		Student st = new Student(10,"Satya",86);

		//wite that Data to File

		oos.writeObject(st);

		System.out.println("Serlization Done	:	open abc.txt to See Data");
	}
}
