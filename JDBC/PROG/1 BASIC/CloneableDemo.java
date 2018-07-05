 class CloneInf	implements Cloneable
{

	int a , b;

	CloneInf()
	{
	System.out.println("CloneInf()	: Constructor");
	}


	CloneInf(int x,int y)
	{
		a = x;
		b = y;
	System.out.println("	CloneInf(int x,int y)	: Constructor");

	}

	public void m()
	{
	System.out.println("Method	a, b	:"+a+"  "+b);
	}

	public CloneInf myClone()	throws Exception
	{
	CloneInf temp	=	(CloneInf)super.clone();
	return temp;
	}

}//class

class  CloneableDemo
{
	public static void main(String[] args) 	throws Exception
	{
		CloneInf ob1 = new CloneInf(10,20);

		CloneInf ob2 = ob1.myClone();
		
	System.out.println("Ob1 data");
		ob1.m();

System.out.println("Ob2 data");
		ob2.m();

System.out.println("Ob1 HashCode	:	"+ob1.hashCode());
System.out.println("Ob1 HashCode	:	"+ob2.hashCode());


	}
}
