 class  ClassForName3
{
	public static void main(String[] args) throws Exception 
	{
		ClassForName3 ob =new ClassForName3();


		Class c =  Class.forName(args[0]);	 //java.lang.Class so c is still an Obj of 'class' not loaded class
		
		System.out.println("	getName()		:	"+c.getName());
		System.out.println("	getSuperClass()		:	"+c.getSuperclass());
		System.out.println("	isInterface()		:	"+c.isInterface());
		System.out.println("	c.getClass()		:	"+c.getClass());
	}
}

/*
	getName()			:	ClassForName3
	getSuperClass()	:	class java.lang.Object
	isInterface()		:	false
	c.getClass()		:	class 

*/