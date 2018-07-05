//Write a JAVA program which illustrates the concept of default constructor, parameterized  constructor and overloaded constructor?

class A
{

	int a,b;

	A()
	{
		System.out.println("From - Default Contr");
		a = 10;
		b =	10;
		System.out.println("From - Default Contr		A	:	"+a+"		B	:	"+b);
	}


	A(int a)
	{
		System.out.println("From - 1 Param Contr");
		this.a = a;
		this.b =	10;
		System.out.println("From - 1 param Contr		A	:	"+a+"		B	:	"+b);
	}


	A(int a, int b)
	{
		System.out.println("From - 2 Param Contr");
		this.a = a;
		this.b =	b;
		System.out.println("From - 2 param Contr		A	:	"+a+"		B	:	"+b);
	}

	A(A  aa)
	{
		System.out.println("From - Obj. Param Contr");
		this.a = aa.a;
		this.b =	aa.b;
		System.out.println("From - Obj. param Contr		A	:	"+a+"		B	:	"+b);
	}


}





class  ConstructorAll
{
	public static void main(String[] args) 
	{
		System.out.println("FRom Main()");
		A ob1 = new A();
		A ob2 = new A(100);
		A ob3 = new A(200,200);
		A ob4 = new A(ob3);
	}
}
/*
D:\study\BOOKS LIBRARY\PROGRAMMING\JAVA\MyJava\CORE\PROG\1Constructors, This>javac ConstructorAll.java

D:\study\BOOKS LIBRARY\PROGRAMMING\JAVA\MyJava\CORE\PROG\1Constructors, This>java  ConstructorAll
FRom Main()
From - Default Contr
From - Default Contr            A       :       10              B       :       10
From - 1 Param Contr
From - 1 param Contr            A       :       100             B       :       10
From - 2 Param Contr
From - 2 param Contr            A       :       200             B       :       200
From - Obj. Param Contr
From - Obj. param Contr         A       :       200             B       :       200

*/
