import java.awt.*;
import java.applet.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class fw extends Applet
{
	Button button = new Button("Write");
   	Label label1 = new Label("Enter the file name:");
   	TextField text = new TextField(20);
   	Label label2 = new Label("Write your text:");
   	TextArea area = new TextArea(20,20);

	public void init()
	{
		add(label1);
		add(text);
		
		add(label2);
		add(area);
		add(button);
		button.addActionListener(new ActionListener () {
         		public void actionPerformed(ActionEvent e) { 
            			new WriteText();
         		}
      		});
	}
	public class WriteText
	{
		WriteText()
		{
			try{
				String str=text.getText();
				if(str==""){
					JOptionPane.showMessageDialog(null, "Please enter the file name!");				
				}
				File f=new File(str);
				if(f.exists())
				{
					BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
					bw.write(area.getText());
					if(f.canWrite())
					{
						JOptionPane.showMessageDialog(null, "Written succesfully to file!");
					}
					else{
				            JOptionPane.showMessageDialog(null, "Cannot be written!");					
					}
					bw.close();				
				}
				else{
					JOptionPane.showMessageDialog(null, "File not present");			
				}
				
			}catch(Exception e){
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Exception!");	
			}
		}

	}
}
