import java.awt.*;
import java.awt.event.*;

class Button1 extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l1;

	Button1()
	{
		setTitle("ButtonDemo");	
		setSize(300,300);

			b1 = new Button("OK");
			b2 = new Button("EXIT");
			b3 = new Button("HELP");
			b4 = new Button("CANCEL");

			l1 = new Label();
			l1.setAlignment(Label.CENTER);


			add(b1,"North");
			add(b4,"South");
			add(b2,"East");
			add(b3,"West");
			add(l1);


			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);

		setVisible(true);
		
	}//cons

	public void actionPerformed(ActionEvent ae)
	{
	
	if(ae.getSource()==b1)
		{
			String s1 = b1.getLabel();
			l1.setText(s1);
		}

		if(ae.getSource()==b2)
		{
			System.exit(0);
		}

		if(ae.getSource()==b3)
		{
			String s1 = b3.getLabel();
			l1.setText(s1);
		}
	
	if(ae.getSource()==b4)
		{
			String s1 = b4.getLabel();
			l1.setText(s1);
		}
		
	}//method
}//class

public class ButtonFrame
{
	public static void main(String args[])
	{
	Button1 b = new Button1();
	}
}
