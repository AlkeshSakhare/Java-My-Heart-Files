/*<Frame code = WindowEventDemo  height = 500 width = 500>
</Frame>*/

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

class WindowEventDemo extends Frame
{
	Label l;
	public WindowEventDemo()
	{
		setSize(500,500);
		setVisible(true);

		l = new Label("",CENTER);
		add(l);
		
	wl m1 = new wl();
	addWindowListener(m1);

	
	}//const

  class wl extends WindowAdapter
  {

	public void WindowOpened(WindowEvent e)
	  {
	l.setText("WindowOpend");
	}

		public void WindowActivated(WindowEvent e)
	  {
		l.setText("WindowActivated");
		}

public void WindowIconified(WindowEvent e)
	  {
		l.setText("WindowIconified");
	}

		public void WindowDeactivated(WindowEvent e)
	  {
		l.setText("WindowDeactivated");
		}
public void WindowDeiconified(WindowEvent e)
	  {
		l.setText("Deiconified");
	}

		public void WindowClosing(WindowEvent e)
	  {
		l.setText("WindowClosing");
		}

		public void WindowClosed(WindowEvent e)
	  {
		l.setText("WindowClosed");
		}
			
  }//wl

}//WindowEventDemo

class WindowEvents 
{
	public static void main(String args[])
	{
WindowEventDemo de = new WindowEventDemo();
	}
}
