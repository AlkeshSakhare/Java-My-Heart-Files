class Bc
{
	int a,b;
	void op(int x,int y)
	{

		a=x;
		b=y;
		int c = a+b;
		System.out.println("SUM at Bc	:	"+c);	
	}
}


class iBc extends Bc
{
	int a,b;
	void op(int x,int y)
	{

		super.op(x,y);
		a=x;
		b=y;
		int c = a - b;
		System.out.println("MINUS at iBc	:	"+c);	
	}
}

class Dc  extends iBc
{
	int a,b;
	void op(int x,int y)
	{
		super.op(x,y);
		a=x;
		b=y;
		int c = a*b;
		System.out.println("Mul at Dc	:	"+c);	
	}
}






class SuperAtMethodOverride 
{
	public static void main(String[] args) 
	{
		System.out.println("Started..........");

		Dc ob = new Dc();

		ob.op(10,20);
	}
}

/*

D:\study\BOOKS LIBRARY\PROGRAMMING\JAVA\MyJava\CORE\PROG\2Super>java SuperAtMethodOverride
Started..........
SUM at Bc       :       30
MINUS at iBc    :       -10
Mul at Dc       :       200

D:\study\BOOKS LIBRARY\PROGRAMMING\JAVA\MyJava\CORE\PROG\2Super>
*/