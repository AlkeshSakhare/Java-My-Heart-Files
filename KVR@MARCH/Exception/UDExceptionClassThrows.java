package Ex1;


public class UDExceptionClassThrows  
{
	
public void div(String s1,String s2) throws ArithmeticException,ArrayIndexOutOfBoundsException,NumberFormatException
	{ 
	int x = Integer.parseInt(s1);
	int y = Integer.parseInt(s2);

	int z = x/y;
	System.out.println("DIV	:	"+z);
	}

}
