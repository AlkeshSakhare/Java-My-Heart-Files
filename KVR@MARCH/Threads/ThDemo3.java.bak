//sum,sub using both Thread[c]	 , Runnable [i]

class Thdemo1  extends Thread
{
	

	int a,b,c;
	
	public void set(int a, int b)
	{
	this.a	= a;
	this.b	=	b;
	}

	public void run()
	{
	c = a+b;
	System.out.println("Sum	 :	"+c);
	}


}


class Thdemo2 implements Runnable
{
	

	int a,b,c;
	
	public void set(int a, int b)
	{
	this.a	= a;
	this.b	=	b;
	}

	public void run()
	{
	c = a-b;
	System.out.println("Sub	 :	"+c);
	}


}



class ThDemo3 
{
	public static void main(String[] args) 
	{

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);


		System.out.println("");

		Thdemo1 t1 = new Thdemo1();
		Thdemo2 t2 = new Thdemo2();
		
		t1.set(x,y);
		t2.set(x,y);

		Thread t3 = new Thread(t2);
		t1.start();
		
		t3.start();
	}
}
