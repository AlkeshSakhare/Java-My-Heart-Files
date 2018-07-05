class Bc
{
	int a;
	Bc()
	{
		a = 25;
		System.out.println("BC def. Constuctor");
		System.out.println("BC def. Constuctor"+a);
	}
}

class Dc extends Bc
{
	int b;
	Dc()
	{  
		//super(); Optional....in my View Super is a Constuctor/Object Depends On time
		b = 50;
		System.out.println("DC def. Constuctor");
		System.out.println("DC def. Constuctor"+b);
	}
}


class SuperPosibility1 
{
	public static void main(String[] args) 
	{
		Dc ob = new Dc();
	}
}
