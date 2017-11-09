import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class sound extends Applet implements ActionListener
{
	Button start;
	AudioClip audio;

	public void init()
	{
		start=new Button("Start");
		add(start);	
		start.addActionListener(this);
		audio=getAudioClip(getCodeBase(),"explosion.wav");
	
	}
	public void actionPerformed(ActionEvent a)
	{
		Button src = (Button)a.getSource();
		audio.play();
		
	}

}
