class ConstructorUsingThis 
{
	int a,b;

	ConstructorUsingThis()
	{   
		this(100);
		System.out.println("______________________________________________________________________");
		System.out.println("Defalut cons");
	}

	ConstructorUsingThis(int a)
	{
		this(200,200);
		this.a = a;
		System.out.println("______________________________________________________________________");
		System.out.println("1 param: a	:"+a);
	}
ConstructorUsingThis(int a,int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("______________________________________________________________________");
		System.out.println("2 param: a	:"+a);
		System.out.println("2 param: b	:"+b);
	}
	
	
	ConstructorUsingThis(ConstructorUsingThis T)
	{
	System.out.println("______________________________________________________________________");
	System.out.println("I AM FROM OBJECT PARAMETERIZED CONSTRUCTOR..");
	this.a = T.a;
	this.b = T.b;
	System.out.println("OBJECT PARAMETERIZED CONSTRUCTOR	:a:	"+T.a+"	 b	:"+T.b);
	
	}

	public static void main(String[] args) 
	{
		System.out.println("from Exection logic");
		System.out.println("______________________________________________________________________");
		ConstructorUsingThis ob1 = new ConstructorUsingThis();
		ConstructorUsingThis ob2 = new ConstructorUsingThis(100);
		ConstructorUsingThis ob3 = new ConstructorUsingThis(100,200);
		ConstructorUsingThis ob4 = new ConstructorUsingThis(ob3);

	}
}
