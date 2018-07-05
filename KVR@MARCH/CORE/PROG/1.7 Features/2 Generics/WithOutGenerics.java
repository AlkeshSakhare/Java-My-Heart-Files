class list
{
	int a,b;
	void put(int a)
	{
	this.a = a;
	}

	int get()
	{
	return a;
	}
}


class WithOutGenerics 
{
	public static void main(String[] args) 
	{

		list l1 = new list();
		l1.put(10);
		System.out.println(l1.get());
		l1.put("abc");
	}
}
