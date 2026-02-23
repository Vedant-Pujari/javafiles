/*<applet code= "Gra" width=500 height=500></applet>*/

import java.applet.*;
import java.awt.*;

public class Gra extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0; i<20; i++)
		{
			g.drawLine(250,110 + (i*10),350,200);
		}
		for(int i=0; i<20; i++)
		{
			g.drawLine(150,200,250,110 + (i*10));
		}
	}
}