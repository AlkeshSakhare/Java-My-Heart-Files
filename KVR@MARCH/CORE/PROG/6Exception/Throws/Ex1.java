//Write a JAVA program which illustrates the concept of throws keyword?
//(CALLED FUNCTION)


package ep;
public class Ex1
{
public void div (String s1, String s2) throws ArithmeticException, NumberFormatException
{
int n1=Integer.parseInt (s1);
int n2=Integer.parseInt (s2);
int n3=n1/n2;
System.out.println ("DIVISOIN = "+n3);
}
};


