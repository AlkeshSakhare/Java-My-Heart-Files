class list<T>
{
	T a,b;
	void put(T a)
	{
	this.a = a;
	}

	T get()
	{
	return a;
	}
}


class WithGenerics 
{
	public static void main(String[] args) 
	{

		list<Integer> l1 = new list<Integer>();
		l1.put(10);

			list<String> l2 = new list<String>();
		System.out.println(l1.get());
		l2.put("abc");
		System.out.println(l2.get());
	}
}
