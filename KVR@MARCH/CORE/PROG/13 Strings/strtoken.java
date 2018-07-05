import java.util.*;
class strtoken
{
public static void main(String args[])
{
String s = "my name is SATYA my psyco jaffa lover name is SYAM";
StringTokenizer s1 = new StringTokenizer(s);
System.out.println(s);
System.out.println(s1.countTokens());
System.out.println("TRUE / FALSE:\t\t"+s1.hasMoreTokens());
System.out.println(s1.nextToken());
while(s1.hasMoreTokens())
{
System.out.println(s1.nextToken());
}
}
}