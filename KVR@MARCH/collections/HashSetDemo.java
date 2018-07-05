import java.util.*;


class  HashSetDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("HashSet Started");
		System.out.println("________________________________________________");
		System.out.println("");

		int sum=0;
		HashSet ts = new HashSet();//empty

		System.out.println("HashSet	:	"+ts);
		System.out.println("Size	:	"+ts.size());
		System.out.println("isEmpty	:	"+ts.isEmpty());

		System.out.println("");
		System.out.println("");

		//add elments

		ts.add(new Integer(10));
		ts.add(new Integer(20));
		ts.add(new Integer(30));
		ts.add(new Integer(40));
		ts.add(new Integer(50));
		ts.add(new Integer(30));//not added

		System.out.println("");
		System.out.println("____________After Adding______________________________");
		System.out.println("");


		System.out.println("HashSet	:	"+ts);
		System.out.println("Size	:	"+ts.size());
	

		System.out.println("");
		System.out.println("____________Using Iterator______________________________");
		System.out.println("");

		Iterator itr = ts.iterator(); //[0,10,.......,100]
		while(itr.hasNext())
		{
		Object ob = itr.next();
		Integer i = (Integer) ob;
		int s = i.intValue();
		System.out.println("elements are	:	"+s);
		
		sum =  s+sum;		
		}
System.out.println("Sum 	itrerator	:	"+sum);



	}//main
}//class
