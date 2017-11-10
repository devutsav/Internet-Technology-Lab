import java.awt.*;
import java.applet.*;

public class shape extends Applet
{
      public void paint(Graphics g)
      {
	         g.setColor(Color.blue);
           g.fillRect(60,10,30,80);
           g.setColor(Color.yellow);
           g.fillRoundRect(20,110,600,30,5,5);
           g.setColor(Color.blue);
           g.fillOval(245,25,100,100);
      }
};
