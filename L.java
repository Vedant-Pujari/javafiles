import java.applet.*;
import java.awt.*;

/* <applet code="L" width=400 height=200> </applet> */

public class L extends Applet{
    public void init(){
        L l = new L();
        Label l1 = new Label("hi i am Label using Applet");
        add(l1);
	Label l2 = new Label("woah");
	add(l2);
    }
}