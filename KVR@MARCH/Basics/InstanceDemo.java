static  class InstanceDemo 
{


//int a ,b;

 int a = 10;
 int b = 20;
		//System.out.println("this from CLASS");

public  void Sum(int x,int y)
	{
	x = this.a;
	y = this.b;
	int sum = x+y;
	System.out.println("this from METHOD()");
	System.out.println("SUM of x,y is		:"+sum);
	}


	public static void main(String[] args) 
	{
		System.out.println("this from MAIN()");
	}
}
