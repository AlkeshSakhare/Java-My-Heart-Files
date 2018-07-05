package outerpack;

public class  OuterBaseClass
{
	private int pri = 100;
					int	def =  200;
			public int pub = 300;
			protected int pro  = 400;

	public OuterBaseClass()
	{
//	    private int a; //private are not allowed in  constructor
			
				System.out.println("PRIVATE ----:>"+pri);
				System.out.println("DEFAULT ----:>" +def);
				System.out.println("PUBLIC ----:>" +pub);
				System.out.println("PROTECTED ----:>" +pro);
				System.out.println("");
			

	}
}
