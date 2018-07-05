//AbstractLevel3 :"if any CONCRETE class contains NULL BODY METHODS or USE LESS STATEMET METHODS...it is RECOMMENDED make such classes as ABTRACT CLASSES"

abstract class c1
{
	void empty()
	{
	
	}
}

class c2 extends c1
{
	//abstract	void useles(); ERROR___CLASS MUST BE ABTRACT
	void useless()
	{
	System.out.println("iam Useless...plz make me Abstract ...other wise more cost");
	}
}

class c3 extends c2
{


}



class AbstractLevel3 
{
	public static void main(String[] args) 
	{
		System.out.println("AbstractLevel3 ");
		c3 ob = new c3();
		    ob.useless();
			ob.empty();
	}