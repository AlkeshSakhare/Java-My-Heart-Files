package ser;

import java.io.*;


public class  SerializeSubClass implements Serializable
{

	int sno;
	String sname;
	float  marks;

	public void setSno(int sno)
	{
		this.sno = sno;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public void setMarks(float marks)
	{
		this.marks = marks;
	}

	public    int getSno()
	{
		return sno;
	}

	public    String getSname( )
	{
		return sname;
	}

	public    float getMarks( )
	{
		return marks;
	}



	
}
