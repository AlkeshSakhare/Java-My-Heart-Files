/*<applet code = CheckboxAppletThis height = 500 width = 500>
</applet>*/


/*using  this objecet*/
//NOTES : 1
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class CheckboxAppletThis extends Applet  implements ItemListener //---1:here Applet class Always must be Public...and if u want to save the class whch contais Public ,																				//..on that class Name we save our program.So finally we dont write THIS bcoz pointing curent Object
{
Checkbox cb1,cb2;
Label l1,l2,l3;
Button b;

	public void init()
	{

	setSize(300,300);
	FlowLayout f = new FlowLayout();//--1.we must setLayout ...other wise in not Visible
	setLayout(f);
	cb1 = new Checkbox("JAVA");
	cb2 = new Checkbox(".NET");
	l1 = new Label("Select Ur Courese	 :	");
	l2 = new Label("Select Ur Courese	 :	");
	l3 = new Label("");
	b = new Button("EXIT");

	add(l1);	add(cb1);	add(l2); 	add(cb2); 	add(l3); add(b);
	}//init

public void start()
	{
	cb1.addItemListener(this);
	cb2.addItemListener(this);
	setVisible(true);
		}//start

	public  void itemStateChanged(ItemEvent ie)
	{
	
		if(ie.getSource() == cb1)
		{
		if(cb1.getState())
		{
			String s = cb1.getLabel();
			l3.setText("Ur selected Course is	:	"+s);
	
		}
		}//if
	
	if(ie.getSource() == cb2)
	{
			if(cb2.getState())
			{
			String s = cb2.getLabel();
			l3.setText("Ur selected Course is	:	"+s);
			}
	}//if
	}//method
}//class
	
class CheckboxApplet
{
	CheckboxAppletThis ob = new CheckboxAppletThis();
}	
