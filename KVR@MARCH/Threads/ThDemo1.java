// print  details of Threds

class ThDemo1 extends Thread
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();//t1     <----- 	 [main 5 main]	
		System.out.println("Curent Thread names	:	"+t1);	 //[main 5 main]
		System.out.println("Just Curent Thread name	:	"+t1.getName());	 //main
	
	System.out.println("");
	System.out.println("");

		t1.setName("JAVA TH");
		System.out.println("Modifed Thred					:	"+t1);

		System.out.println("Excecution Status of Defalut Thread		:	" +t1.isAlive());

		//crete a Fore Ground Therd

System.out.println("");
System.out.println("");


		Thread t2 = new Thread();
		System.out.println("ForeGround Thread name	:	"+t2.getName());	 //main

		System.out.println("Excecution Status of ForeGround Thread	:" +t2.isAlive());

		//getPriority Name

		System.out.println("");
		System.out.println("");

		
			System.out.println("MAX_PRIORITY		VALUE		:	"+Thread.MAX_PRIORITY);
			System.out.println("NORM_PRIORITY		VALUE		:	"+Thread.NORM_PRIORITY);
			System.out.println("MIN_PRIORITY		VALUE		:	"+Thread.MIN_PRIORITY);



		System.out.println("");
	}
}
