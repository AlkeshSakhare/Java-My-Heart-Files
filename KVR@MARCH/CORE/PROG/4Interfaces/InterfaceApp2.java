interface i1
{
	void f1();
}

interface i2 extends i1
{
	void f2();
}


class C1 implements i2
{
	public	void f1()
	{
		System.out.println("f1() defiend");
	}


	public	void f2()
	{
		System.out.println("f2() defiend");
	}


	public	void f3()
	{
		System.out.println("f3() -Special.......-defiend");
	}

}


class InterfaceApp2 
{
	public static void main(String[] args) 
	{
		System.out.println("Using Inheritance");

		C1 ob = new C1();
		ob.f1();
		ob.f2();
		ob.f3();

		System.out.println("Using Dynamic Binding");
		System.out.println("i1 interface................");
		i1 ob1 = new C1();
		ob1.f1();
		//ob1.f2();
		//ob1.f3();

		System.out.println("i1 interface................");
		i2 ob2 = new C1();
		ob2.f1();
		ob2.f2();
		//ob2.f3();

	}
}
