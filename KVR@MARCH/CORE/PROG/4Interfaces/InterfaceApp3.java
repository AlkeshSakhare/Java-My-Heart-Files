interface i1
{
	void f1();
}

interface i2	extends i1
{
	void f2();
}

abstract class C1
{
	void f3()
	{
	
	}
}


abstract class C2 extends C1 implements  i2
{

public void f2()
	{
System.out.println("f2()  : is defiend in C2 Class for 1st time");
  }

 void f3()
	{
System.out.println("f3()  : is Override  in C2 Class from NullBody Method");
  }
}

class C3 extends C2
{

	public void f1()
	{
System.out.println("f1()  : is defiend in C3 Class for 1st time");
   }

 public void f2()
	{
System.out.println("f2()  : is Override  in C3 Class from alreday in C2");
    }

public void f3()
	{
System.out.println("f3()  : is Override  in C3 Class from C2 class");
    }

 void f4()
	{
System.out.println("f4()  :Special in Class C3");
    }
}


class InterfaceApp3 
{
	public static void main(String[] args) 
	{
		System.out.println("Using Inheritance");
		 
			C3 ob = new C3();
			ob.f1();
			ob.f2();
			ob.f3();
			ob.f4();


			System.out.println("Using Dynamic Binding");

			System.out.println("i1 Interface");
		 	i1 ob1 = new C3();
			ob1.f1();
			
			System.out.println("i2 Interface");
		 	i2 ob2 = new C3();
			ob2.f1();
			ob2.f2();		

			System.out.println("C1 Abstract class");
		 	C1 ob3 = new C3();
			ob3.f3();
	
		System.out.println("C2 Abstract class");
		 	C2 ob4 = new C3();
			ob4.f1();
			ob4.f2();					
			ob4.f3();					


	}
}

