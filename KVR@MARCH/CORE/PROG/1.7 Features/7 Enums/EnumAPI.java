enum Alp
{
	a,b,c,d,e;
}

class EnumAPI
{

		
	public static void main(String[] args) 
	{
		EnumAPI ob =new EnumAPI();
		System.out.println(Alp.a.ordinal());
		System.out.println(Alp.b.ordinal());
		System.out.println(Alp.c.ordinal());
		System.out.println(Alp.d.ordinal());
		System.out.println(Alp.e.ordinal());

		Alp w[] = Alp.values();

		for(int i=0;i<w.length;i++)
		{
		System.out.println(w[i]+"	"+w[i].ordinal());
		}

	}
}
