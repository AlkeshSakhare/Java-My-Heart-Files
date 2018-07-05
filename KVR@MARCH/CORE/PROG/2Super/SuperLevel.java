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

	Dc(iint x)
	{
		int a = x;
		super();
		System.out.println("Dc param	 :	"+);
	}
}


class SuperLevel1 
{
	public static void main(String[] args) 
	{
			Dc ob = new Dc(20);
	}
}
