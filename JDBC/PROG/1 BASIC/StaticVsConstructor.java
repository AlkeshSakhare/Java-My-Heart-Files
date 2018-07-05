//Prog:1

//Static	:	for Class One time Exceuction
//Const	:	if no of Objects are 4, then Class will Exceute 4 times


class Demo
{
	static
	{
		System.out.println("Static  block	: Demo");
	}

	Demo()
	{
			System.out.println("Demo	 :	Constructor");
	
	}

} //demo



class StaticVsConstructor 
{

static
	{
		System.out.println("Static  block	: 2");
	}


	public static void main(String[] args) 
	{

		Demo d1 = new Demo();
		Demo d2 = new Demo();

		
	}
}


/*
Static  block	: 2
Static  block	: Demo
Demo	 :	Constructor
Demo	 :	Constructor

*/