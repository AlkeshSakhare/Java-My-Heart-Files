import java.util.*;

class  ArrayListDemo
{
	public static void main(String[] args) 
	{

//creating linked lst
		ArrayList ll = new ArrayList();

		System.out.println("Data	:	"+ll);
		System.out.println("Size	:	"+ll.size());
		System.out.println("Is Empty	:	"+ll.isEmpty());

	//adding elemets to LiknedList

		ll.add(new Integer(20));
		ll.add(new Integer(30));
		ll.add(new Integer(40));
		ll.add(new Integer(50));

		System.out.println("Data	:	"+ll);
		System.out.println("Size	:	"+ll.size());
		System.out.println("Is Empty	:	"+ll.isEmpty());

		
//retriving data Using Iterator
		System.out.println("retriving data Using Iterator	:	");

		Iterator it = ll.iterator();	//[................]
		while(it.hasNext())
		{
		Object ob = it.next();
		Integer ing = (Integer) ob;
		int v = ing.intValue();

		System.out.println("Values are	:	"+v);
		
		}


//retriving data Using ListIterator in Backword
		System.out.println("retriving data Using ListIterator	Forword :	\n\n\n");

		ListIterator it1 = ll.listIterator();	//[................]

		while(it1.hasNext())
		{
		Object ob = it1.next();
		Integer ing = (Integer) ob;
		int v = ing.intValue();

		System.out.println("Values are	:	"+v);
		}
		
		System.out.println("retriving data Using ListIterator	Backword:	n\n\n");
		
		while(it1.hasPrevious())
		{
		Object ob = it1.previous();
		Integer ing = (Integer) ob;
		int v = ing.intValue();

		System.out.println("Values are	:	"+v);
		
		}

		System.out.println("retriving data Using toArray():	n\n\n");

		Object ob3[] = ll.toArray();// [		]

		for(int i=0;i<ob3.length;i++)
		{
		Integer io = (Integer) ob3[i];
		int ii = io.intValue();	
		System.out.println("Values are	:	"+ii);
		}


		System.out.println("");
	}
}
