class Demo
{

	Demo()
	{
		System.out.println("Demo():Constror----> so Object is Created Using newInstance()");	
	}

	public 	String toString()
	{
	System.out.println("Using Object method Will call");	
	return "satya";
	}

}


public class  newInstanceOf
{
	public static void main(String[] args) throws Exception
	{
		//load the Class to create Object

		Class c =  Class.forName("Demo");

		//create Object to Demo using newInstance()

		Object ob = c.newInstance();
		
			String s	=	ob.toString();

		System.out.println("Returnn Type of the String also Printing	:	"+s);	

	}
}
