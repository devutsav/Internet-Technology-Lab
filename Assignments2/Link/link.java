import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

public class link extends Applet implements ActionListener
{
	Button b;

	public void init()
	{
		String i="google";
		b=new Button(i);
		b.addActionListener(this);
		add(b);
	}
	public void actionPerformed(ActionEvent a)
	{
		Button src = (Button)a.getSource();
		String linkto = "https://www."+src.getLabel()+".com";
		AppletContext app = getAppletContext();

		try
		{
			URL url=new URL(linkto);
			app.showDocument(url,"_blank"); //showDocument() will not work in appletviewer
			System.out.println("URL opened succesfully");
		}
		catch(MalformedURLException e)
		{
			System.out.println(e.getMessage());		
		}
	
	}


}
