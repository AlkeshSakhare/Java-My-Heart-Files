//HAS_A --->Creating Object  of one class as a Datamember of Another Class


class c1
{
	void show()
	{
		System.out.println("C1 show");	
	}
}

class c2  extends c1   
{

	c1 ob1 = new c1();//HAS-A relation ship
	ob1.show();
	void disp()
	{
		System.out.println("C2 disp");	
	}
}


class HAS_A 
{
	public static void main(String[] args) 
	{
        c2 ob = new c2();
		ob.disp();
		
	}
}
