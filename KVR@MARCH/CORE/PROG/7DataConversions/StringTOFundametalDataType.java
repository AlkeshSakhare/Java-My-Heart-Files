class StringTOFundametalDataType
{
	public static void main(String[] args) 
	{
		String s1 = args[0];

		int x = Integer.parseInt(s1);
		float y= Float.parseFloat(s1);
		byte z = Byte.parseByte(s1);

		System.out.println("int x = Integer.parseInt(s1);	:	"+x);
		System.out.println("float y= Float.parseFloat(s1);	:	"+y);
		System.out.println("byte z = Byte.parseByte(s1);	:	"+y);
	}
}
