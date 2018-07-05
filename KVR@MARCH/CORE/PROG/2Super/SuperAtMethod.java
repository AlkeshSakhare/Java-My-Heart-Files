class Bc
{
	void disp()
	{
		System.out.println("From Base Class");	
	}
}


class Dc extends Bc
{


   
	void disp()
	{
	super.disp();
		System.out.println("From Derived");	
	}
}



class SuperAtMethod
{
	public static void main(String[] args) 
	{
			Dc ob = new Dc();
			ob.disp();
	}
}
