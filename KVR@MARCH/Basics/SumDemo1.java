class DataConversions 
{
	public static void main(String[] args) 
	{
		System.out.println("_______________________________________");
		System.out.println("Sting to Fundamental Datatype");
		String s1 = "1000";
		String s2 = "26.70";
		int a= Integer.parseInt(s1);
		float b = Float.parseFloat(s2);
		System.out.println("Integer.parseInt(s1)	:	"+a);
		System.out.println("Float.parseFloat(s2)	:	"+b);
System.out.println("_______________________________________");

		System.out.println(" Fundamental Datatype to Sting");
		String s3 = String.valueOf(a);
		String s4 = String.valueOf(b);
		System.out.println("String.valueOf(c)	:	"+s3+"	Flaot	:	"+s4);
System.out.println("_______________________________________");

		System.out.println(" Fundamental Datatype to Object");
		int i =278;
		float j = 12;
		Integer ob = new Integer(i);
		Float ff = new Float(j);
		System.out.println("Integr ob	 :	"+ob+" float obj	:	"+ff);	
System.out.println("_______________________________________");

		System.out.println(" Object to Fundamental Datatype ");
		int x = ob.intValue();
