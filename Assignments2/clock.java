import java.awt.*;
import java.applet.*;

public class applet2 extends Applet implements Runnable
{
        int theta,x1,x2,y1,y2;
	double r;
	double sec,min,hour;
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
			}
			sec=sec+6;
			min=min+(6.0/60);
			hour=hour+(30.0/3600);
			repaint();
					
		}		
	}
	public void init()
	{
		sec=270;
		min=270;
		hour=270;
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g) 
	{
      		g.drawOval(50,50,200,200);
		theta=0;
		while(theta<=360)
		{
			r = Math.toRadians(theta);
			x1=(int)(100*Math.cos(r));
			y1=(int)(100*Math.sin(r));	

			x2=(int)(80*Math.cos(r));
			y2=(int)(80*Math.sin(r));
		
			g.drawLine(150+x1,150+y1,150+x2,150+y2);

			theta=theta+30;
		}
		theta=0;
		while(theta<=360)
		{
			r = Math.toRadians(theta);
			x1=(int)(100*Math.cos(r));
			y1=(int)(100*Math.sin(r));	

			x2=(int)(93*Math.cos(r));
			y2=(int)(93*Math.sin(r));
		
			g.drawLine(150+x1,150+y1,150+x2,150+y2);

			theta=theta+6;
		}
		double s = Math.toRadians(sec); //Sec hand line
		int s1 = (int)(75*Math.cos(s));
		int s2 = (int)(75*Math.sin(s));

		double m = Math.toRadians(min);  //Min hand
		int m1 = (int)(77*Math.cos(m));
		int m2 = (int)(77*Math.sin(m));

		double h = Math.toRadians(hour); //Hour hand
		int h1 = (int)(70*Math.cos(h));
		int h2 = (int)(70*Math.sin(h));

		g.drawLine(150,150,150+(s1),150+(s2));
		g.setColor(Color.blue);
		g.drawLine(150,150,150+(m1),150+(m2));
		g.setColor(Color.red);
        	g.drawLine(150,150,150+(h1),150+(h2));
     		
   	}

}
