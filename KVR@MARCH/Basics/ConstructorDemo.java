class ConstructorDemo3 
{
	int aa,bb;

	ConstructorDemo3(ConstructorDemo3 T)
	{
	System.out.println("______________________________________________________________________");
	System.out.println("I AM FROM OBJECT PARAMETERIZED CONSTRUCTOR..");
	aa = T.aa;
	bb = T.bb;
	System.out.println("OBJECT PARAMETERIZED CONSTRUCTOR	:aa:	"+T.aa+"	 bb	:"+T.bb);
	
	}


	ConstructorDemo3()
	{
		System.out.println("______________________________________________________________________");
		System.out.println("Defalut cons");
	}

	ConstructorDemo3(int a)
	{
		a