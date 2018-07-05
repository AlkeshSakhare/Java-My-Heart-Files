interface i1
{
	void f1();
}

interface i2 extends i1
{
	//public abstact void f1() ---- Logically Presents
	void f2();
}

class c1 implements i2
{
  public void f1()
	{
  	System.out.println("f1():dacred in i1 interface ----:>  Defmds in c1");
	System.out.println("");
    }

 public void f2()
	{
  	System.out.println("f2():dacred in i2 interface ----:>  Defmds in c1");
		System.out.println("");
    }

 void f3()
	{
  	System.out.println("f3()SPECIAL FUNCTION ----:>  Defmds in c1");
    }

}


class InterfaceLevel2 
{
	public static void main(String[] args) 
	{
			Sys