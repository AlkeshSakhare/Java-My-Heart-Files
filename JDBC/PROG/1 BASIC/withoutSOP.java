import java.io.*;


class withoutSOP 
{
	public static void main(String[] args)  throws Exception
	{

		PrintStream pw = new PrintStream(System.out); //to conver One Object of one type nto anthoer Objecet
		pw.println("USING	:	printwiter");

		Console con = System.console();
		con.printf("%s", "USING	:	Console con = System.console();");

	}
}
