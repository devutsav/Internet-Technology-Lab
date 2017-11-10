import java.awt.*;
import java.applet.*;
public class imageDisplay extends Applet
{
	Image img;
	public void init()
	{
		img=getImage(getDocumentBase(),"a.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 0,0, this);  

	}

}
