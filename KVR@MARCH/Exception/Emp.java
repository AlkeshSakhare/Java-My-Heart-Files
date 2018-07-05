//Stage2 : Genaral Logic classes

package empl;
import pval.PvalException;
import nval.NvalException;

public class  Emp 
{
	public void salary(String s) throws  PvalException,NvalException,RuntimeException
	{
	int n = Integer.parseInt(s);

	if(n<=0)
		{
	NvalException ne = new NvalException("-    [NEGTIVE]  ve Johnny");
	throw(ne);
	
	}

	if(n>0)
		{
	PvalException pe = new PvalException("+ [POSIVE ]    ve Johnny");
	throw(pe);
	
	}
	
	
	}
	


}
