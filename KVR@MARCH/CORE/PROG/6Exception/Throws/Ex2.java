//(CALLING FUNCTION)


import ep.Ex1;
class Ex2
{
public static void main (String [] args)
{
try
{
String s1=args [0];
String s2=args [1];
Ex1 eo=new Ex1 ();
eo.div (s1,s2);
}
catch (ArithmeticException Ae)
{
System.out.println ("DONT ENTER ZERO FOR DENOMINATOR");
}
catch (NumberFormatException Nfe)
{
System.out.println ("PASS INTEGER VALUES ONLY");
}
catch (ArrayIndexOutOfBoundsException Aioobe)
{
System.out.println ("PASS VALUES FROM COMMAND PROMPT");
}
}
}