class Demo
{

	Demo()
	{
		System.out.println("Demo():Constror");	
	}

	public void m()
	{
	System.out.println("Using Object method Will call");	
	}

}

public class  Object_1_NEW
{
	public static void main(String[] args) throws Exception
	{
		Demo d = new Demo();
		d.m();


	}
}
