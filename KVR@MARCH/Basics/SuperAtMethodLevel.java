class Bc
{
	void disp()
	{
	System.out.println("iam From BaseClass: Disp()");
	}
}

class Dc extends Bc
{
	//--------------------------|
	//super.disp heddin
	//--------------------------|
	//super.disp();  it mst be write in BLOCK  {........super.disp();..........}
	void disp()
	{
		super.disp();
	System.out.println("iam From DerivedClass: Disp()");
	}
}



class SuperAtMethodLevel 
{
	public static void main(String[] args) 
	{
		Dc ob = new Dc();
		ob.disp();
	}
}
