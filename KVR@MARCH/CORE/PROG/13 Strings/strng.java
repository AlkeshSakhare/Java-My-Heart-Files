class strng
{
public static void main(String args[])
{
String s1 = new String("Welcome");
System.out.println(s1);
char ch[] = {'w','e','l','c','o','m','e'};
String s2 = new String(ch);
System.out.println(s2);
String s3 = new String(ch,2,4);
System.out.println(s3);
}
}