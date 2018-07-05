import java.awt.*;
import java.awt.event.*;

class ChoiceFrame extends Frame implements ItemListener
{
		Label l1,l2;
		Choice c1,c2;

		ChoiceFrame()
		{
			FlowLayout f = new FlowLayout();
			setLayout(f);
			setSize(230,200);
			setVisible(true);

			l1 = new Label("Avilable Seats");
			l2 = new Label("Selected Seats");

			c1 = new Choice();
			c2 = new Choice();

			for(int i=1; i<=50;i++)
			{
			String s1 = String.valueOf(i);
			c1.add(s1);
			}

			add(l1);
			add(c1);
			add(l2);
			add(c2);

			c1.addItemListener(this);
		
		}//cons
	

	public void  itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
		String  s1 = c1.getSelectedItem();
		c2.add(s1);
		c1.remove(s1);
		
		}
	
	}
}

class  ChoiceFrameThis
{
	public static void main(String[] args) 
	{
		ChoiceFrame ob = new ChoiceFrame();
	}
}
