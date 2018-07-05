class A
{
  void show()
   {
      System.out.println("show");
   }
}

class Outer
{
   A ob = new A()
    {
  	void print()
   	{
      	System.out.println("print");
   	}
    };
}