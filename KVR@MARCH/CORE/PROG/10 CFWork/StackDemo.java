import java.util.*;



class StackDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("");

		Stack s = new Stack();//    s----> [        ]

		System.out.println("Empty	:	"+s.empty());
		System.out.println("Size	:		"+s.size());
		System.out.println("Capacity:	"+s.capacity());
		System.out.println("Stack	:	"+s);

		//add elemtnts to stack

		s.push(new Integer(10));
		s.push(new Integer(20));
		s.push(new Integer(30));
		s.push(new Integer(40));
		s.push(new Integer(50));
		System.out.println("--------------------------After Adding -------------------------------------------------");
		System.out.println("Empty	:	"+s.empty());
		System.out.println("Size	:		"+s.size());
		System.out.println("Capacity:	"+s.capacity());
		System.out.println("Stack	:	"+s);

		//removing elemtns
	System.out.println("--------------------------After Removing -------------------------------------------------");
		s.pop();
		System.out.println("Stack	:	"+s);

		System.out.println("--------------------------Search -------------------------------------------------");

		System.out.println("PICK up Top element	 :	"+s.peek());

		int res = 	s.search( new Integer(10));
		System.out.println("Searched elemt at	 :	"+res);

		 res = 	s.search( new Integer(100));
		System.out.println("Searched elemt at	 :	"+res);
	}
}
