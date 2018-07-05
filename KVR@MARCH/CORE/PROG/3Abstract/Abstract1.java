 abstract class Op
{
	Op()
	{
		System.out.println("Abstract Constructor");
	}

	abstract void sum();
}


class isum extends Op
{


	int a =10;
	int b=10;
	int c;
	
	void sum()
	{
	c = (a+b);
	System.out.println("Int Sum......."+c);
	}
	
}


class fsum extends Op
{
	float a =10,b=10,c;
	
	void sum()
	{
	c = (a+b);
	System.out.println("Flaot Sum......."+c);
	}
	
}


class Abstract1 
{
	public static void main(String[] args) 
	{
	
	Op ob;

	ob = new isum();
	ob.sum();
	System.out.println("ob is an Objecet Of	 :	"+ob.getClass());

	ob = new fsum();
	ob.sum();
	}
}

/*
Abstract Constructor
Int Sum.......20
Abstract Constructor
Flaot Sum.......20.0
*/
