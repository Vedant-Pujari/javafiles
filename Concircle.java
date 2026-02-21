/* <applet code = "Concircle" width = 600 height = 600> </applet> */
import java.awt.*;
import java.applet.*;
public class Concircle extends Applet
{
	public void paint(Graphics g)
	{
		int dia=0;
		for(int i = 0;i < 10; i++)
		{
			if(i%2==0){
				g.fillOval(100+(dia/2),100+(dia/2),500-dia,500-dia);
				dia = dia+100;
				g.setColor(Color.blue);
			}
			else{
				g.fillOval(100+(dia/2),100+(dia/2),500-dia,500-dia);
				dia = dia+100;
				g.setColor(Color.red);
			}
		}
	}
}