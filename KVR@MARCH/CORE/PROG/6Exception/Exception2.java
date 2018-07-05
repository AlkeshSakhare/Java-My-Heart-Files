class Exception2 
{
	public static void main(String[] args) 
	{
try
{

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;

		c= a/b;

		System.out.println("Output.....:	"+c);

		}

catch (NullPointerException ae)
{
			System.err.println("NullPointerException");
}

catch (ArrayIndexOutOfBoundsException ae)
{
			System.err.println("ArrayIndexOutOfBoundsException");
}

catch (NumberFormatException ae)
{
			System.err.println("NumberFormatExceptionException");
}

catch (ArithmeticException ae)
{
			System.err.println("ArithmeticException");
}

finally
{
		System.out.println("iam from Finally	");

}

}

}







/*


NO INPUT	:
				Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0         at Exception1.main(Exception1.java:6)

java  Exception1 10		0:
				Exception in thread "main" java.lang.ArithmeticException: / by zero        at Exception1.main(Exception1.java:10)

java  Exception1 ab v
				Exception in thread "main" java.lang.NumberFormatException: For input string: "ab"        at java.lang.NumberFormatException.forInputString(Unknown Source)
      





*/