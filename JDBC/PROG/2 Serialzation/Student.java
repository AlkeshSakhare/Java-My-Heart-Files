import java.io.*;


public class Student implements Serializable
{
		int sno;
		String sname;
		float mar;

	Student()
	{
		System.out.println("Student()	:	O- param Constructor");
	}

	Student(int sno, String sname, float mar)
	{
		this.sno = sno;
		this.sname = sname;
		this.mar = mar;

		System.out.println("Student()	:	3- param Constructor");
	}

	public void disp()
	{
		System.out.println("Sno	:		"+sno+"|		Sname		:	"+sname+"|			Smarks	:	"+mar);
	}


}