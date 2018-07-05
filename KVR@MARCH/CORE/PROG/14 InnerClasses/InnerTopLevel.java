class A
{
	void a()
	{
		System.out.println("method - a()");
	}

	static class B
	{
		void b()
		{
		System.out.println("method - b()");
		}
	}//A
}//b



class InnerTopLevel 
{
	public static void main(String[] args) 
	{
		A ob = new A();

		B.b();
	}
}
