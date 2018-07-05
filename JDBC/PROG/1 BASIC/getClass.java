import java.util.*;


class getClass 
{
	public static void main(String[] args) 
	{

		getClass  g = new getClass();
		Date d = new Date();
		String s = new String("satya");

		Object ob = new String("SEE");


		System.out.println("g Class name		:	"+g.getClass());
		System.out.println("d Class name		:	"+d.getClass());
		System.out.println("s Class name		:	"+s.getClass());

		System.out.println("Object ob = new String('SEE');	in the Object is belongs to		:	"+s.getClass()+	"	Class");
	}
}


/*
g Class name		:	class getClass
d Class name		:	class java.util.Date
s Class name		:	class java.lang.String
Object ob = new String('SEE');	in the Object is belongs to		:	class java.lang.String	Class

*/
