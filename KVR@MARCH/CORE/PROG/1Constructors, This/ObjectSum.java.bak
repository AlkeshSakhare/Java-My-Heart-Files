//Write a JAVA program which computes sum of two objects by accepting the data from command prompt?


class Test
{
	int a,b;
		Test ()
		{
		a=b=0;
		}


		Test (int a, int b)
		{
		this.a=a;//1/3
		this.b=b;//2/4
		}


	Test sum (Test T)
	{
		Test ob=new Test ();
		ob.a=this.a+T.a;
		ob.b=this.b+T.b;
		return (ob);
	}

	void display ()
	{
		System.out.println ("VALUE OF a = "+a);
		System.out.println ("VALUE OF b = "+b);
	}
}

 
class  ObjectSum
{
	public static void main (String k[])
	{
	int n1=Integer.parseInt (k[0]);//1
	int n2=Integer.parseInt (k[1]);//2
	int n3=Integer.parseInt (k[2]);//3
	int n4=Integer.parseInt (k[3]);//4


	Test t1=new Test (n1,n2);//1,2
	Test t2=new Test (n3,n4);//3,4
	Test t3=new Test ();
		// t3=t1+t2; invalid statement
t3=t1.sum (t2);


System.out.println ("t1 VALUES ARE AS FOLLOWS...");
t1.display ();
System.out.println ("t2 VALUES ARE AS FOLLOWS...");
t2.display ();
System.out.println ("t3 VALUES ARE AS FOLLOWS...");
t3.display ();
}
}

