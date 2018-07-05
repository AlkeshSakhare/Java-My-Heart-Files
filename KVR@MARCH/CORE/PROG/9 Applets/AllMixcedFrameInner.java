import java.awt.*;
import java.awt.event.*;

class F1 extends Frame
{

Label a ,b,c;
Button bt;
TextField u,p;
TextArea add;
Checkbox b1,b2,bc,sc;
CheckboxGroup	g1;
Choice c1;
List l1;

	F1()
	{
		setTitle("ButtonDemo");	
		setSize(300,300);

		FlowLayout fl = new FlowLayout();
		setLayout(fl);

		a = new Label("USERNAME");
		b = new Label("pswd");
		c = new Label("XXXXXX");
		u = new TextField("Name");
		p = new TextField();
		p.setEchoChar('*');
		add = new TextArea(10,10);
		b1 = new Checkbox("male");
		b2 = new Checkbox("female");

		g1 = new CheckboxGroup();

		b1.setCheckboxGroup(g1);
		b2.setCheckboxGroup(g1);

		bc = new Checkbox("Bc");
		sc = new Checkbox("sc");

		c1 = new Choice();

		c1.add("HYD");
		c1.add("VZG");
		c1.add("VIJ");

		l1 = new List(5,true);
		l1.add("C");
		l1.add("C++");
		l1.add("JAVA");

		bt = new Button("OK");

		add(a);
		add(u);
		add(b);
		add(p);
		add(add);  
		add(b1); 
		add(b2);
		add(bc); 
		add(sc);
		add(c1); 
		add(l1);    
		add(c);

		setVisible(true);

		T ob1 = new T();

		u.addTextListener(ob1);


	}//cons


	class T implements  TextListener
	{

			public void textValueChanged(TextEvent te)
			{
				if(te.getSource() == u)
				{
					String s1 = u.getText();
					c.setText(s1);
				}
			
			if(te.getSource() == p)
				{
					String s1 = u.getText();
					c.setText(s1);
				}
			
			
			}

	}



}//clss









public class AllMixcedFrameInner  
{
	public static void main(String[] args) 
	{
		F1 ob = new F1();
	}
}
