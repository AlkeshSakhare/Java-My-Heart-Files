class Bc
{
	int a;

	Bc()
	{
	
		System.out.println("BC Def Constuctor");
	}

	Bc(int x)
	{
		a = x;
		System.out.println("BC param Constuctor");
		System.out.println("BC param Constuctor"+a);
	}
}

class Dc extends Bc
{
	int b;

	Dc()
	{
		super(1000);//super();
	System.out.println("DC Def. Constuctor");
	}
}
	
class SuperPosibility4
{
	public static void main(String[] args) 
	{
		Bc ob1 = new Bc(100);
		Dc ob = new Dc();
		
	}
}
