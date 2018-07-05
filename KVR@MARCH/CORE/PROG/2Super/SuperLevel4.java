//bc -df	---->   dc df

class Bc
{

	Bc(int x)
	{
				int a = x;
		System.out.println("Bc param"+a);
	}
}

class Dc extends Bc
{

	Dc(int x)
	{
		super(10);
		int a = x;
		System.out.println("Dc param	 :	"+a);
	}
}


class SuperLevel4
{
	public static void main(String[] args) 
	{
			Dc ob = new Dc(20);
	}
}
