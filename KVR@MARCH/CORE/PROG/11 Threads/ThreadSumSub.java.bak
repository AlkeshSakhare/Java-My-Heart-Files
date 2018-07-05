//sum,sub using both Thread[c]	 , Runnable [i]

import java.io.*;
import java.util.*;

class Thread1 extends Thread
{
	int x,y;
	public void set(int a, int b)
	{
		x = a;
		y = b;
	}

	public void run()
	{
	try
	{
		System.out.println("Sum	:	"+(x+y));
	}
	catch (Exception e)
	{
		
	}
		
	}
}

class Thread2 implements Runnable
{
	int x,y;
	public void set(int a, int b)
	{
		x = a;
		y = b;
	}

	public void run()
	{
	try
	{
		System.out.println("Sub	:	"+(x-y));
	}
	catch (Exception e)
	{
		
	}
		
	}
}


class  ThreadSumSub
{
	public static void main(String[] args) 
	{

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a	:");
			int a = sc.nextInt();

			System.out.println("Enter b	:");
			int b = sc.nextInt();

			Thread1 t1 = new Thread1();
			Thread2 tt = new Thread2();

			t1.set(a,b);
			tt.set(a,b);


			Thread t2 = new Thread(tt);



			t1.start();

			try
			{
				Thread.sleep(3000);
				t1.join();
			}
			catch (Exception e)
			{
			}

			t2.start();
			try
			{
				Thread.sleep(3000);
				t2.join();
			}
			catch (Exception e)
			{
			}

			
	}
}
