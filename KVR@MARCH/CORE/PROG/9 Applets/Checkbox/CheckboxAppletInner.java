//CheckboxAppletInner
/*
<applet code = "CheckboxAppletInner.class"	width= 300		height = 300>
</applet>
*/

import java.awt.*;
import  java.awt.event.*;
import  java.applet.Applet; 

public class CheckboxAppletInner extends Applet 
{

	Label l1, l2, l3;
	Checkbox c1;

	public void init()
	{

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

		Inner i = new Inner();
		c1.addItemListener(i);

		
	}//init

	
	


class Inner implements ItemListener
{
		public  void itemStateChanged(ItemEvent i)
		{
			if(i.getSource()==c1)
			{
				if(c1.getState())
				{
				String s1 = c1.getLabel();
				l3.setText(s1);
				}
			}
	}

}
	
}
