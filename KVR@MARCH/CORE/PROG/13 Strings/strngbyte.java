class strngbyte
{
public static void main(String args[])
{
String s1 = new String("Welcome");
System.out.println(s1);

byte b[] = {98,99,100,101,102,103,104,105};//a,b,c.......
String s2 = new String(b);
System.out.println(s2);


String s3 = new String(b,2,6);
System.out.println(s3);


int a =  s1.length();
System.out.println("Lenght  :  \t" +a);


boolean bo;
bo = s1.isEmpty();
System.out.println("isEmpty:\t"+bo);


byte by[] = s1.getBytes();
for(int i=0;i<a;i++)
{
System.out.println("Byte formate :\t"+by[i]);
}
}
}