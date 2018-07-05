
enum Alpha
{
	a,b,c,d,e;
}


class EnumWithMethod 
{
	
	void m1(Alpha var)
		{
		System.out.println(var);
		}
	
	
	public static void main(String[] args) 
	{
		EnumWithMethod ob =new EnumWithMethod ();
		ob.m1(Alpha.a);
	}

}

/*
OutPut:
------
a
*/


