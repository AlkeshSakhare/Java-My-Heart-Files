//Class.forname("Demo")  --> it loads the class ,so Static Block is Exceuted, but t never Creates the Object So....Exception Occured at Constuctor
//so here we given 3 times loading of class , but it is not created Object na...so Class level 1 time exceuction...we given 3 times "Demo" but excute only 1 time


class Demo
{
	static
	{
		System.out.println("Static	:	only im exce...NOT cons.......");
	}

	Demo()
	{
		System.out.println("Contctor	:	I'm Never Exce...");
	}
}




class ClassForName2
 {
	 	
			public  static void main(String arg[])
			{
				 try
				 {
						Class.forName("Demo");
						Class.forName("Demo");
						Class.forName("Demo");

				}catch (Exception e)
				{
		 				System.out.println("An Excepton");
				}
	
			}//statc

}

//Static	:	only im exce...NOT cons.......
//Exception in thread "main" java.lang.NoSuchMethodError: main
