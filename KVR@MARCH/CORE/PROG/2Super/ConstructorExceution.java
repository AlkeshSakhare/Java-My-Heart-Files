class Bc
{
	Bc()
	{
		//super();
		System.out.println("Im Base Constror");
	}
}

class iBc	extends Bc
{
	iBc()
	{
		//super();
		System.out.println("Im iBase Constror");
	}
}

class Dc	extends iBc
{
	Dc()
	{
		//super();
		System.out.println("Im Derved Constror");
	}
}






class ConstructorExceution 
{
	public static void main(String[] args) 
	{
		Dc ob = new Dc();
	}
}
