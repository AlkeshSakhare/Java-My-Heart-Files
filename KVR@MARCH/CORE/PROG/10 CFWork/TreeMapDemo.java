import java.util.*;

class TreeMapDemo 
{
	public static void main(String[] args) 
	{

		TreeMap hm = new TreeMap();

		System.out.println("Data	:	  "+hm);
		
		hm.put(new Integer(5), new Float(1.5));
		hm.put(new Integer(2), new Float(2.5));
		hm.put(new Integer(1), new Float(2.5));
		hm.put(new Integer(4), new Float(4.5));
		hm.put(new Integer(3), new Float(5.5));

		System.out.println("Data	:	  "+hm);

		System.out.println(" enteySet -> set -> iterator ");

		Set s = hm.entrySet();// {....}
		Iterator i = s.iterator();

		while(i.hasNext())
		{
		
		Map.Entry mobj = (Map.Entry) i.next();  //[1 = 1.5]

		Object kobj = mobj.getKey();
		Object vobj = mobj.getValue();

		Integer i1 = (Integer) kobj;
		int i2 = i1.intValue();
		
		Float f1 = (Float) vobj;
		float f2 = f1.floatValue();

		System.out.println("Key	:	  "+i2);
		System.out.println("Value	: 	  "+f2);
		System.out.println("  ");
		}


System.out.println(" enteySet -> set -> toArray ");

		Set s1 = hm.entrySet();// {....}
		Object ob[] = s.toArray();

	for(int ij = 0;ij<ob.length;ij++)
		{
		
		Map.Entry mobj = (Map.Entry) ob[ij];  //[1 = 1.5]

		Object kobj = mobj.getKey();
		Object vobj = mobj.getValue();

		Integer i1 = (Integer) kobj;
		int i2 = i1.intValue();
		
		Float f1 = (Float) vobj;
		float f2 = f1.floatValue();

		System.out.println("Key	:	  "+i2);
		System.out.println("Value	: 	  "+f2);
		System.out.println("  ");
		}


System.out.println(" keySet -> set -> iterator ");

		Set s2 = hm.keySet();// {....}
		Iterator i0 = s.iterator();

		while(i0.hasNext())
		{
		
		Map.Entry mobj = (Map.Entry) i0.next();  //[1 = 1.5]

		Object kobj = mobj.getKey();
		Integer i1 = (Integer) kobj;
		int i2 = i1.intValue();

		Object vobj = hm.get(kobj);
		Float f1 = (Float) vobj;
		float f2 = f1.floatValue();

		System.out.println("Key	:	  "+i2);
		System.out.println("Value	: 	  "+f2);
		System.out.println("  ");
		}




		System.out.println("  ");
	}
}

