//Thread appln Scrolling Msg using applets

/*<applet code = "ScrollingThread.class" width=500 height = 500>
</applet>*/

import java.awt.*;
import java.applet.Applet;


public class  ScrollingThread  extends Applet implements Runnable
{
	String msg = "  Welcome to Java   ";
	
	public void init()
	{
			setBackground(Color.BLACK);
			setForeground(Color.RED);

			Thread t1 = new Thread(this);
			t1.start();
	}

	public void start()
	{
	
	
	}

	public void paint(Graphics g)
	{
		Font f = new Font("arial", Font.BOLD, 50);
		g.setFont(f);
		g.drawString(msg,100,100);
	}

	public void run()
	{
	
	try
	{
		while (true)
		{
		char ch = msg.charAt(0);
		System.out.println(ch);

		int n = msg.length();

		msg = msg.substring(1,n);
		System.out.println(msg);

		msg = msg+ch;

		Thread.sleep(1000)	;

		repaint();
	}//while
	}
	catch (Exception e)
	{

	}
	
	}

}
