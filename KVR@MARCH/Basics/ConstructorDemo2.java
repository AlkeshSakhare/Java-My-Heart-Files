//ChoiceFrameInner

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

class ChoiceFrame extends Frame
{
	Choice c1,c2;
	Label l1,l2;
	Button b1;

ChoiceFrame()
	{
	setSize(300,300);
	setVisible(true);

	FlowLayout f = new FlowLayout();
	setLayout(f);

	c1 = new Choice();
	c2 = new Choice();
	l1 = new Label("Movies List:");
	l2 = new Label("Selected List:");
	b1 = new Button("GO");

	c1.add("AMERPET");
	c1.add("ZIL");
	c1.add("NAA");
	c1.add("MAZILI");
	c1.add("RGV");
	c1.add("SAYENTRAM");
	c1.add("BABAI-ABBAI");

	add(l1);   add(c1);  add(l2);  add(c2); add(b1);

	Inner ob = new Inner();
	c1.addItemListener(ob);
	b1.add