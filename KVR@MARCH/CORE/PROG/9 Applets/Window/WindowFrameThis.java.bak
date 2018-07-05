import java.awt.*;
import java.awt.event.*;

class windowDemo extends Frame implements WindowListener
{
	Label l1;
	windowDemo()
	{
	setSize(400,400);
	setVisible(true);

	l1 = new Label("Iam at Normal");
	
	add(l1);

	addWindowListener(this);

	}//cons

	public void windowOpened(WindowEvent w1)
	{
		l1.setText("windowOpened");
	
	}
      public void windowClosing(  WindowEvent w)
	{
			l1.setText(" windowClosing");
	
	}
      public void windowClosed(  WindowEvent w)
	{
			l1.setText("windowClosed");
	
	}
	  public void windowIconified(   WindowEvent w)
	{
			l1.setText("windowIconified");
	
	}
      public void windowDeiconified(   WindowEvent w)
	{
			l1.setText("windowDeiconified");
	
	}
      public void windowActivated(   WindowEvent w)
	{
			l1.setText("windowActivated");
	
	}
      public void windowDeactivated(  WindowEvent w)
	{
	
			l1.setText("windowDeactivated");
	}
}//class



class WindowFrameThis 
{
	public static void main(String[] args) 
	{
		windowDemo d = new windowDemo();
	}
}
