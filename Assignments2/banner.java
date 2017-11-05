import java.awt.*;
import java.applet.*;

public class applet1 extends Applet
{
	String str="Applet banner";

	public void init()
	{
		setBackground(Color.black);
		
	}
	public void paint(Graphics g) 
	{
      		g.setColor(Color.blue);
     		g.fillRect(1,1,1490,80);
      		g.setColor(Color.white);
      		g.drawString(str, 600, 40);
   	}

}
