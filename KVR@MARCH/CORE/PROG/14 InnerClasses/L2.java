class Outer
{

	int a = 100;
	static int b = 200;
	void m1()
	{
		int x = 10;
		final int y = 20;
	class Inner
	{

	void m2()
		{
		System.out.println(a);
		System.out.println(b);
		//System.out.println(x);
		System.out.println(y);
		}

	}
	}
}

class L1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Outer on = new Outer();
		on.m1();
	}
}
