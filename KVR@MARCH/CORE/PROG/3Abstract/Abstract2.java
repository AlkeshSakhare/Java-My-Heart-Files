abstract class C1
{
	abstract void f1();
	abstract void f2();

}


abstract class C2 extends C1
{
	
/*
//int f1()   
 f1() in C2 cannot override f1() in C1; attempting to use incompatible return type
found   : int
required: void
        int f1()
		            ^
1 error
*/

void f1()
	{
		System.out.println("f1() defined in C1");	
	}
	abstract void f2();

}

 class C3 extends C2
{
	
void f1()
	{
		super.f1();
		System.out.println("f1() Override in C3");	
	}
 void f2()
	{
		System.out.println("f2() Defind in C3");	
	}

 void f3()
	{
		System.out.println("f3() Defind in C3");	
	}
}



class Abstract2 
{
	public static void main(String[] args) 
	{
		System.out.println("Using Ingeritance");

		C3 ob1 = new C3();
		ob1.f1();
		ob1.f2();
		ob1.f3();

		System.out.println("Using Dynamic Binding		:		C1");

		C1 ob2= new C3();
		ob2.f1();
		ob2.f2();
		//ob2.f3();

	System.out.println("Using Dynamic Binding		:		C2");

C2 ob3= new C3();
		ob3.f1();
		ob3.f2();
		//ob2.f3();


	}
}
