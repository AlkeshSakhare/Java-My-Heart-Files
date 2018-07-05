import java.util.*;


class  LinkedListDemo 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		System.out.println("LInkedList Started");
		System.out.println("________________________________________________");
		System.out.println("");


		LinkedList ll = new LinkedList();//empty

		System.out.println("LinkedLst	:	"+ll);
		System.out.println("Size	:	"+ll.size());
		System.out.println("isEmpty	:	"+ll.isEmpty());

		System.out.println("");
		System.out.println("");

		//add elments

		ll.add(new Integer(10));
		ll.add(new Integer(20));
		ll.add(new Integer(30));
		ll.add(new Integer(40));
		ll.add(new Integer(50));

		System.out.println("");
		System.out.println("____________After Adding______________________________");
		System.out.println("");


		System.out.println("LinkedLst	:	"+ll);
		System.out.println("Size	:	"+ll.size());
		System.out.println("isEmpty	:	"+ll.isEmpty());

		ll.addFirst(new Integer(00));
		ll.addLast(new Integer(100));

		System.out.println("");
    		System.out.println("____________After Adding___First____LAST_______________________");
		System.out.println("LinkedLst	:	"+ll);

		System.out.println("");
		System.out.println("____________Using Iterator______________________________");
		System.out.println("");

		Iterator ir = ll.iterator(); //[0,10,.......,100]
		while(ir.hasNext())
		{
		Object ob = ir.next();
		Integer i = (Integer) ob;
		int s = i.intValue();
		System.out.println("elements are	:	"+s);
		
		sum =  s+sum;		
		}
System.out.println("Sum 	irerator	:	"+sum);



		System.out.println("");
		System.out.println("____________Using toArray______________________________");
		System.out.println("");
		
		int sum1 = 0;

		Object  ob1[] = ll.toArray(); //[0,10,.......,100]
		for(int i=0; i<ob1.length;i++)
		{
		
		Integer in = (Integer) ob1[i];
		int s = in.intValue();
		System.out.println("elements are	:	"+s);
		
		sum1 =  s+sum1;		
		}
System.out.println("Sum 	toArray	:	"+sum1);



		System.out.println("");
		System.out.println("____________Using ListIterator___________FORWORD__________");
		System.out.println("");

		int sum2= 0;
		ListIterator li = ll.listIterator(); //[0,10,.......,100]
		while(li.hasNext())
		{
		Object ob = li.next();
		Integer i1 = (Integer) ob;
		int s = i1.intValue();
		System.out.println("elements are	:	"+s);
		
		sum2 =  s+sum2;		
		}
	System.out.println("Sum 	forword	:	"+sum2);


		System.out.println("");
		System.out.println("____________Using ListIterator___________BACKWORD__________");
		System.out.println("");

		int sum3= 0;
		//ListIterator lis = ll.listIterator(); if we take new iterator that points to 0th elemnt..so no prevous so....we use old one
		while(li.hasPrevious())
		{
		Object ob = li.previous();
		Integer i1 = (Integer) ob;
		int s = i1.intValue();
		System.out.println("elements are	:	"+s);
		
		sum3 =  s+sum3;		
		}
System.out.println("Sum 	Backword:	"+sum3);

	}//main
}//class
