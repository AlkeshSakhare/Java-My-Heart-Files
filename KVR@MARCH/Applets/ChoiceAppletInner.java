/*<applet code = ChoiceAppletInner height = 500 width = 500>
</applet>*/



//ChoiceAppletInner 

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class ChoiceAppletInner  extends Applet
{
	Choice c1,c2;
	Label l1,l2;

public void init()
	{
	setSize(300,300);
	setVisible(true);

	c1 = new Choice();
	c2 = new Choice();
	l1 = new Label("Movies List:");
	l2 = new Label("Selected List:");


	c1.add("AMERPET");
	c1.add("ZIL");
	c1.add("NAA");
	c1.add("MAZILI");
	c1.add("RGV");
	c1.add("SAYENTRAM");
	c1.add("BABAI-ABBAI");

	add(l1);   add(c1);  add(l2);  add(c2); 
	}//init

	public void start()
	{
	Inner ob = new Inner();
	c1.addItemListener(ob);	
	}//start

class Inner implements ItemListener
{
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource() == c1)
		{
		String s = c1.getSelectedItem();
		c2.add(s);
		c1.remove(s);
		
		}//if
	
	}//method1

	
}//inner

}//Outer

