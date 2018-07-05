import java.awt.*;
import java.awt.event.*;

class TextFieldFrame extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;

	TextFieldFrame()
	{
		FlowLayout f = new FlowLayout();
		setLayout(f);

	setSize(400,400);
	setVisible(true);

	l1 = new Label("1st Number : ");
	l2 = new Label("2nd Number");
	l3 = new Label("Result	:");
	
	t1 = new TextField();
	t2 = new TextField();
	t3 = new TextField();

	b1 = new Button("Sum");
	b2 = new Button("Sub");
	b3 = new Button("Mul");
	b4 = new Button("Exit");

	add(l1);		add(t1);		add(l2);		add(t2);		add(l3);		add(t3);		add(b1);		add(b2);		add(b3);		add(b4);		
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	}//cons

	public void actionPerformed(ActionEvent ae)
	{
		
		//sum
		if(ae.getSource()==b1)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();

			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);

				int i3 = i1+i2;

				String  s3 = String.valueOf(i3);
				t3.setText(s3);
		
		}

		//sub
		if(ae.getSource()==b2)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();

			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);

				int i3 = i1-i2;

				String  s3 = String.valueOf(i3);
				t3.setText(s3);
		
		}

		//mul
		if(ae.getSource()==b3)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();

			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);

				int i3 = i1*i2;

				String  s3 = String.valueOf(i3);
				t3.setText(s3);
		
		}

		if(ae.getSource()==b4)
		{
			System.exit(0);
		}
	
	}

}

class  TextFeildFrameThis
{
	public static void main(String[] args) 
	{
		TextFieldFrame obj = new TextFieldFrame();
	}
}
