class  WraperDemo 
{

int a,b;

	public static void main(String[] args) 
	{
		String Sint[] = {"10","20"};
		String Sfloat[] = {"10","20.3"};

		int x = Integer.parseInt(Sint[0]);
		int y = (int)Integer.parseInt(Sfloat[0]);
		float z = (float)Float.parseFloat(Sfloat[1]);
		byte l = (byte)Byte.parseByte(Sint[0]);
		short m =(short)Short.parseShort(Sfloat[0]);

		System.out.println("_________________________________________________________________________________");
		System.out.println("int x = Integer.parseInt(Sint[0]);"+x);
		System.out.println("int y = Integer.parseInt(Sfloat[0]);"+y);
		System.out.println("float z = (float)Float.parseFloat(Sfloat[1]);"+z);
		System.out.println("byte l = (byte)Byte.parseByte(Sint[0]);"+l);
		System.out.println("short m =(short)Short.parseShort(Sfloat[0]);"+m);
		System.out.println("_________________________________________________________________________________");
	}
}
