//Curent Thread names	
//Just Curent Thread name
//Excecution Status of Defalut Thread
//ForeGround Thread name
//PRIORITY		VALUES

	
class  ThreadDemo
{
	public static void main(String[] args) 
	{

			Thread th1 = Thread.currentThread();
			System.out.println("Curent Thread names	:	"+th1);
			System.out.println("Exceution Status	:	"+th1.isAlive());
			System.out.println("Just Thread name	:	"+th1.getName());
			System.out.println("priority	:	"+th1.getPriority());
			System.out.println("");
			th1.setName("SETNAME");
			System.out.println("Set name	:"+th1);
			System.out.println("Changed  name	:"+th1.getName());
			
			System.out.println("");   
			System.out.println("");

			Thread th = new Thread();

			System.out.println("Curent Thread names	:	"+th);
			System.out.println("Exceution Status	:	"+th.isAlive());
			System.out.println("Jsut Thread name	:	"+th.getName());
			System.out.println("priority	:	"+th.getPriority());
			
			System.out.println("");

			th.setName("NEW THREAD");
			System.out.println("Set name	:"+th);
			System.out.println("Set name	:"+th.getName());
			System.out.println("Exceution Status	:	"+th.isAlive());
			

		System.out.println("");

			System.out.println("MAX_PRIORITY		VALUE		:	"+Thread.MAX_PRIORITY);
			System.out.println("NORM_PRIORITY		VALUE		:	"+Thread.NORM_PRIORITY);
			System.out.println("MIN_PRIORITY		VALUE		:	"+Thread.MIN_PRIORITY);

	  ThreadGroup tg = th.getThreadGroup();
	  int ac = th.activeCount();

	  System.out.println("getThreadGroup()	:	"+tg);
			System.out.println("activeCount()			: "+ac);
   System.out.println("is Daemon Thread	:	"+th.isDaemon()); 
    System.out.println(" Get ID	:	"+th.getId()); 

	}
}
