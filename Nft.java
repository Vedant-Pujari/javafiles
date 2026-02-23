import java.awt.*;
import java.applet.*;

/* <applet code="Nft" width=400 height=200> </applet> */

public class Nft extends Applet{
	TextField tf1,tf2;
	public void init(){
		tf1 = new TextField();
		tf2 = new TextField("PWR");
		add(tf1);
		add(tf2);
	}
}