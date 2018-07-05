/*

STATE   |  CAPITAL													1.pass the state at CMD promt & Disply CAPITAL
_________________				
A.P			  |   HYD															2.If no STATE is found Display	:	"NO IDEA"
KAR			  |	BANG
TM			  |	CHENNI													3.Data Not enterd Disply				:	"Plz Enter State....!!"	
MH			  |	MUMBAI
_________________

*/

import java.util.*;


class HashtableDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("");

		Hashtable hs = new Hashtable(); // hs -------> [   ,  ]

		//add elemets
		hs.put("AP","HYD");
		hs.put("KAR","BANG");
		hs.put("TM","CHENNAI");
		hs.put("MH","MUMBAI");


		//Display Table

		Enumeration  e = hs.keys();   //hs ----> [AP:HYD		KAR:BANG		TM:CHE		MH:MUM]

		while(e.hasMoreElements())
		{
		Object kobj	 =	 e.nextElement();
		Object vobj = hs.get(kobj);

		System.out.println(kobj+"		:		"+vobj);

		}

		//Enter state

		
		if(args.length==0)
		{
				System.out.println("----------------------------");
				System.out.println("PLZ  ENTER THE STATE");
		
		}

	else
		{
		String s1 = args[0];

		String state = s1.toUpperCase();

		Object cap = hs.get(state);

		if(cap!= null)
		{
							System.out.println("----------------------------");
				System.out.println(cap+"	is Captal of	 "+state);
		}
		else
		{
							System.out.println("----------------------------");
				System.out.println("NO IDEA");
		}
		
		}//else

	}//main
}//class
