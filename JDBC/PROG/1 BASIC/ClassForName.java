//Class.forname("Demo")  --> it loads the class ,so Static Block is Exceuted, but t never Creates the Object So....Exception Occured at Constuctor


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




class ClassForName
 {
	 	
			 static
			{
				 try
				 {
						Class.forName("Demo");
				}catch (Exception e)
				{
		 				System.out.println("An Excepton");
				}
	
			}//statc

}

//Static	:	only im exce...NOT cons.......
//Exception in thread "main" java.lang.NoSuchMethodError: main
