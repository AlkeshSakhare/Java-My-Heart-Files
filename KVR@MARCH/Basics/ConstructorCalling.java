class Bc extends Object//mplicitly
{
	Bc() 
	{
	System.out.println("BC def.Constuctor");
	}
}

class IDC extends Bc
{
	IDC()
	{
				//super() --->implictily calls bcoz this constutor is logically presents 
	System.out.println("IDC def.Constuctor");
	}
}

class Dc extends IDC
{
	Dc()
	{
		//super() --->implictily calls bcoz this constutor is logically presents 
	System.out.println("DC def.Constuctor");
	}
}

class ConstructorCalling 
{
	public static void main(String[] args) 
	{
        Dc ob = new Dc();
		
	}
}
