import java.awt.*;
import  java.awt.event.*;

class CheckboxFrame extends Frame implements ItemListener
{

	Label l1, l2, l3;
	Checkbox c1;

CheckboxFrame()
	{

	setSize(500,500);
	setVisible(true);
		FlowLayout f = new FlowLayout();
		setLayout(f);

	l1 = new Label("Select ur Course: ");
	l2 = new Label("Selected Course is  : ");
	l3 = new Label();

	c1 = new Checkbox("java");

	add(l1);
	add(c1);
	add(l2);
	add(l3);

	c1.addItemListener(this);
	
	}//cons

public void itemStateChanged(ItemEvent i)
	{
		if(i.getSource()==c1)
		{
			if(c1.getState())
			{
				String s1 = c1.getLabel();
				l3.setText(s1);
			}
	}

}//method

}//class


public class CheckboxFrameThis
{
	public static void main(String args[])
	{
	CheckboxFrame ob = new CheckboxFrame();
	}
}