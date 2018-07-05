package sing;

public class Singleton
{

	private static Singleton obj = null;

	private Singleton()
	{
	System.out.println("Obj. is created for the 1st time");
	}//cons

	public  static Singleton method()
	{
	
	if(obj!=null)
		{
	obj = new Singleton();
		}

		else
		{
		System.out.println("Obj. is already created ");
		}
	return obj;
	}//method

}//class