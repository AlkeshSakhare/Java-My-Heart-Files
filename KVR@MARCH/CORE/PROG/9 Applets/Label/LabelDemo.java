import java.awt.*;


class LabelD extends Frame
{
	LabelD()
	{
	
		this.setTitle("LabelDemo");
		this.setSize(300,300);
		
		Label l1 = new Label("OK");
		Label l2 = new Label("EXIT");
		Label l3 = new Label("HELP");		
		Label l4 = new Label("CANCLE");		
		Label l5 = new Label("satya",Label.CENTER);	

		l1.setAlignment(Label.CENTER);
		l4.setAlignment(Label.CENTER);
		l2.setAlignment(Label.LEFT);
		l3.setAlignment(Label.RIGHT);

		add(l1,"North");
		add(l2,"West");
		add(l3,"East");
		add(l4,"South");
		add(l5);

		setVisible(true);
	}

}


 public class LabelDemo
{
	public static void main(String args[])
	{
	LabelD	l = new LabelD();
	}

}