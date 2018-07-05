/*<applet code = RadioButtonAppletInner height = 500 width = 500>
</applet>*/



//RadioButtonAppletInner

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class RadioButtonAppletInner extends Applet //
{
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup g1,g2;
	Label l1;
	

public void init()
	{
	setSize(300,300);

	FlowLayout f =  new FlowLayout();
	setLayout(f);


	cb1 = new Checkbox("C");
	cb2 = new Checkbox("C++");
	cb3 = new Checkbox("JAVA");
	cb4 = new Checkbox(".NET");
	l1 =  new Label("");
	

	g1 = new CheckboxGroup();
	g2 = new CheckboxGroup();

	cb1.setCheckboxGroup(g1);
	cb2.setCheckboxGroup(g1);
	cb3.setCheckboxGroup(g2);
	cb4.setCheckboxGroup(g2);

	add(cb1); add(cb2); add(cb3); add(cb4);  add(l1);

	}//init
	
public void start()
	{
RadioButton ob = new RadioButton();

	cb1.addItemListener(ob);
	cb2.addItemListener(ob);
	cb3.addItemListener(ob);
	cb4.addItemListener(ob);

		setVisible(true);
	}//start
	
class RadioButton implements ItemListener
{

	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox cb = (Checkbox)ie.getItemSelectab