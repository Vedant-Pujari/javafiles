import java.awt.*;

public class FrameDemo extends Frame
{
  public static void main(String args[])
  {
     Frame F = new Frame("Bhakti's Frame");
F.setSize(200,200);
F.setVisible(true);

MenuBar mbr = new MenuBar();
F.setMenuBar(mbr);

Menu file = new Menu("File");
Menu edit = new Menu("Edit");
Menu view = new Menu("View");

mbr.add(file);
mbr.add(edit);
mbr.add(view);

MenuItem s = new MenuItem("Open");

file.add(s);

      }
}