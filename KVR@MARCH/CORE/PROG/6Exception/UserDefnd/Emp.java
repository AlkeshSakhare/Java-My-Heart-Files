package org.satya;

import neg.NvalException;
import pos.PvalException;

public class Emp
{

	public void diposit(String s)  throws NvalException,PvalException,NumberFormatException
	{
		int sal = Integer.parseInt(s);

		if(sal<100)
		{
		NvalException ne = new NvalException("Negative Sal");
		throw(ne);
		}
	
	else
		{
		PvalException pe = new PvalException("Positive	Sal");
		throw(pe);
		}
	
	}
}