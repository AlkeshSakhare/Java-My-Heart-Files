import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

 public class AppletClass extends Applet 
{
	Label l;
	Button a,b,c,d,e;

	public void init()
	{
		setTitle("AppletClass Text");
		setSize(300,300);
		a = new Button("NORTH EXIT");
		b = new Button("SOUTH");
		c = new Button("WEST");
		d = new Button("EAST");
		l = new Label("OK",Label.CENTER);
		
		add(a,"North");
		add(b,"South");
		add(c,"East");
		add(d,"West");
		add(l,"Center");
	}//init

public void start()
	{
AppletClass ob = 	new AppletClass();
		a.addActionListener(ob);
		b.addActionListener(ob);
		c.addActionListener(ob);
		d.addActionListener(ob);
	
		//defaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}//Start

public 	class AppletApp1 implements ActionListener
	{

	public void actionPerformed(ActionEvent ae)
	{

	if(ae.getSource() == a) 
		{
			l.setText("NORTH is Clicked");	
						System.exit(0);
		}


	if(ae.getSource() == b) 
		{
			l.setText("SOUTH is Clicked");	
		}
	

	if(ae.getSource() == c) 
		{
			l.setText("WEST is Clicked");	
		}


	if(ae.getSource() == d) 
		{
			l.setText("EAST is Clicked");	
		}

	

	}

}

	

}//class



