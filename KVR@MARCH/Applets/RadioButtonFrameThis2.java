//RadioButtonFrameThis2
//Using Object Typecast

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

class RadioButtonFrame extends Frame implements ItemListener,ActionListener
{
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup g1,g2;
	Label l1;
	Button b1;

RadioButtonFrame()
	{
	setSize(300,300);

	FlowLayout f =  new FlowLayout();
	setLayout(f);


	cb1 = new Checkbox("C");
	cb2 = new Checkbox("C++");
	cb3 = new Checkbox("JAVA");
	cb4 = new Checkbox(".NET");
	l1 =  new Label("");
	b1 = new Button("OUT");

	g1 = new CheckboxGroup();
	g2 = new CheckboxGroup();

	cb1.setCheckboxGroup(g1);
	cb2.setCheckboxGroup(g1);
	cb3.setCheckboxGroup(g2);
	cb4.setCheckboxGroup(g2);

	add(cb1); add(cb2); add(cb3); add(cb4);  add(l1); add(b1);

RadioButtonFrameThis2 ob = new RadioButtonFrameThis2();

	cb1.addItemListener(this);
	cb2.addItemListener(this);
	cb3.addItemListener(this);
	cb4.addItemListener(this);
	b1.addActionListener(this);
		setVisible(true);
	
	}//constrtor

	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox cb = (Checkbox)ie.getItemSelectable();

			if(cb.getState())
			{
			l1.setText("Ur Selected Course	:"+cb.getLabel());
			
			}//if
	
	}//itemStateChanaged

	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b1)
		{
	System.exit(0);
	
		}
	}//actionPerformed



}//class A


class RadioButtonFrameThis2
{
	public static void main(String args[])
	{
	RadioButtonFrame o = new RadioButtonFrame();
	
	}
}