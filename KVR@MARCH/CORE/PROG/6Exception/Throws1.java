class Throws1
{
	public static void main(String[] args) 
	{
			try
			{
					int a = Integer.parseInt(args[0]);
					System.out.println("U Entred	"+a);
			}

		catch (NumberFormatException ae)
		{
			System.err.println("NumberFormatException");
		}
	}

}