/* <applet code = "japp" width = 500 height = 500></applet> */
import java.awt.*;
import java.applet.*;
public class japp extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(150,150,200,200);
		g.drawOval(100,100,300,300);
	}
}