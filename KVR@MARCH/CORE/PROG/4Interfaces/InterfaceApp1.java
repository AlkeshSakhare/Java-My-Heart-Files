interface i1
{

	void f1();
}

interface i2
{

	void f2();
}


class C1 implements i1,i2
{

	public void f1()
	{
	System.out.println(" f1 definds ");
	}

	public void f2()
	{
	System.out.println(" f2 defienfd");
	}

	void f3()
	{
	System.out.println(" f3 - Special method");
	}


}



class  InterfaceApp1
{
	public static void main(String[] args) 
	{
		System.out.println("Using Inheritance Process");

			C1 ob = new C1();
			ob.f1();
			ob.f2();
			ob.f3();

		System.out.println("Using Dynamic Binding");

		System.out.println("Using i1 Interface");

		i1 ob1 = new C1();
				ob1.f1();
			//ob1.f2();
			//ob1.f3();

		System.out.println("Using i2 Interface");

		i2 ob2 = new C1();
				// ob2.f1();
				ob2.f2();
			//ob2.f3();




	}
}
