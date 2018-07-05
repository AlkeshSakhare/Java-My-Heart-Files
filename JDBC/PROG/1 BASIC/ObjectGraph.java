class ObjectGraph
{
	public ObjectGraph()
	{
		System.out.println("Demo():Constror----> so Object is Created Using newInstance()");	
	}
	
	public 	void m1()
	{
	System.out.println("Using Object method Will call");	
	}

}

abstract class Demo extends ObjectGraph
{
public Demo()
	{
		System.out.println("Demo():Constror----> so Object is Created Using newInstance()");	
	}
	
	public 	void m2()
	{
	System.out.println("Using Object method Will call");	
	}

}