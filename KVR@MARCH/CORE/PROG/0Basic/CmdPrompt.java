//Write a JAVA program for printing the data which we pass from command prompt?


class  CmdPrompt
{
	public static void main(String[] args) 
	{

		String a = args[0];
		int b = Integer.parseInt(a);
		System.out.println("a  value	 "+b);
	}
}
