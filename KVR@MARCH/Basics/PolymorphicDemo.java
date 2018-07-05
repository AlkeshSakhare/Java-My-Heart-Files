class c1
{
	int a,b;
	void sum(int x,int y)
	{
		int z = (x+y);
	System.out.println("C1.INT Sum"+z);
	}
}

class c2 extends c1
{
	int a,b;
	void sum(int x,int y)
	{
		int z = (x+y);
	System.out.println("C2.INT Sum"+z);
	}
}

class c3 extends c1
{
	int a,b;
	void sum(int x,int y)
	{
		int z = (x+y);
	System.out.println("C3.INT Sum"+z);
	}
}






class PolymorphicDemo 
{
	public static void main(String[] args) 
	{
     c1 o = new c1();
	     o.sum(10,20);
    o = new c2();
            o.sum(1,2);
	o = new c3();
            o.sum(1000,2000);
	}
}
