class ObjectReffenceEquals
{
public static void main(String [] args) {
ObjectReffenceEquals t1 = new ObjectReffenceEquals();
ObjectReffenceEquals t2 = new ObjectReffenceEquals();

System.out.println("t1 :	"+t1);
System.out.println("t2 :	"+t2);


if (!t1.equals(t2))
System.out.println("they're not equal");
if (t1 instanceof Object)
System.out.println("t1's an Object");
}
}