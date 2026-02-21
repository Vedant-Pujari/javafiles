import java.applet.Applet;
import java.awt.*;

public class A extends Applet
{
	public void paint(Graphics g)
	{
		int incY=0;
		g.drawString("Table of 5",20,20);
		for(int i=1;i<=10;i++)
		{
			g.drawString("5 x " +i "=" + 5*i,40,40+incY);
			incY=incY+20;
		}
	}
}