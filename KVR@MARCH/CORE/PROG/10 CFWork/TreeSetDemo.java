import java.util.*;


class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet hs = new TreeSet();

		hs.add(new Integer(50));
		hs.add(new Integer(20));
		hs.add(new Integer(30));
		hs.add(new Integer(10));
		hs.add(new Integer(50));

		System.out.println("Data	:	"+hs);

		System.out.println("Retrivng Data Using Iterator");

		Iterator i = hs.iterator();

		while(i.hasNext())
		{
			Object ob = i.next();
			Integer it = (Integer) ob;

			int io = it.intValue();

			System.out.println("Values are	:	"+io);

		}

	}
}
