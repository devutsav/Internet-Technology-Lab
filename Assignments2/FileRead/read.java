import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;

public class read extends Applet
{
	String str;
	public void init()
	{
	}
	public void paint(Graphics g)
	{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("alu.v"));
			Scanner scan=new Scanner(br);
			while(scan.hasNext())
			{
			    str=scan.next();
			    System.out.println(str);

			}
		}
		catch(Exception e){}
		str=str+"";
	}

}
