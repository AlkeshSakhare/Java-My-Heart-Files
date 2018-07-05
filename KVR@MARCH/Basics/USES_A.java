//USES_A --->A method of one class is using an Object of another Class


class c1
{
	void show()
	{
		System.out.println("C1 show");	
	}
}

class c2  extends c1   
{

	void disp()
	{
		c1 ob1 = new c1();//USES-A relation ship
			ob1.show();
	System.out.println("C2 disp");	
	}
}


class USES_A 
{
	public static void main(String[] args) 
	{
        c2 ob = new c2();
		ob.disp();
		
	}
}
