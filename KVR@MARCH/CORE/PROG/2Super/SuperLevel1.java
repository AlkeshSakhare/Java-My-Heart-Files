//bc -df	---->   dc df

class Bc
{

	Bc()
	{
		System.out.println("Bc Default");
	}
}

class Dc extends Bc
{

	Dc()
	{
		super();
		System.out.println("Dc Default");
	}
}


class SuperLevel1 
{
	public static void main(String[] args) 
	{
			Dc ob = new Dc();
	}
}
