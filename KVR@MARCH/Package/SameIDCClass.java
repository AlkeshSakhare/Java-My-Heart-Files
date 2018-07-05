package samepack;


public class  SameIDCClass 
{
	SameBaseClass ob = new SameBaseClass();//contorl searches 4 SameBaseClass() in current directort if find creates Object
			
			public SameIDCClass()
	{
				//System.out.println("PRIVATE ----:>"+pri);
				System.out.println("DEFAULT ----:>" +ob.def);
				System.out.println("PUBLIC ----:>" +ob.pub);
				System.out.println("PROTECTED ----:>" +ob.pro);
				System.out.println("");
			
			}


}
