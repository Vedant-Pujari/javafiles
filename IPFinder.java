import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.net.*;

public class IPFinder extends JFrame implements ActionListener{
	JLabel l,l1;
 	JTextField tf,tf1;
 	JButton b1,b2,b3,b4;
 	
	IPFinder(){
 		super("IP Finder Tool - google");
		setLayout(null);
 		l = new JLabel("Enter URL:");
 		l.setBounds(100, 100, 120, 30);
		l1 = new JLabel("Enter ip:");
		l1.setBounds(100,140,120,30);

		tf = new JTextField();
		tf.setBounds(250, 100, 120, 30);
		tf1 = new JTextField();
		tf1.setBounds(250,140,120,30);

		b1 = new JButton("Find IP");
		b1.setBounds(100, 200, 80, 30);
		b1.addActionListener(this);

		b2 = new JButton("Clear");
		b2.setBounds(195,200,80,30);
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				tf1.setText("");
			}
		});

		b4 = new JButton("List");
		b4.setBounds(195,240,80,30);
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"IP addresses of famous websites…….\n" +
						"\n" +
						"1.       Google.com  -  209.85.231.104 \n" +
						"\n" +
						"2.       Microsoft.com –  207.46.170.123\n" +
						"\n" +
						"3.       Yahoo.com - 72.30.2.43\n" +
						"\n" +
						"4.       Facebook.com - 66.220.149.25\n" +
						"\n" +
						"5.       Wikipedia.com - 208.80.152.2\n" +
						"\n" +
						"6.       Dell.com - 143.166.83.38\n" +
						"\n" +
						"7.       Twitter.com - 128.242.245.116");
			}
		});

		b3 = new JButton("Find url");
		b3.setBounds(290,200,80,30);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Ip=tf1.getText();
				try
				{
					InetAddress ia=InetAddress.getByName(Ip);
					String nm=ia.getHostName();
					JOptionPane.showMessageDialog(null,nm);
				}
				catch (UnknownHostException e2){
					JOptionPane.showMessageDialog(null,e2.toString());
					JOptionPane.showMessageDialog(null,"Please input proper IP of website...");
				}
			}
		});

		add(l);
		add(l1);
		add(tf);
		add(tf1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


 	public void actionPerformed(ActionEvent e){

		String url=tf.getText();


			try
			{

				InetAddress ia=InetAddress.getByName(url);
				String ip=ia.getHostAddress();
				JOptionPane.showMessageDialog(this,ip);

			}
			catch (UnknownHostException e1){
				JOptionPane.showMessageDialog(this,e1.toString());
				JOptionPane.showMessageDialog(this,"Try inputing full name of Host...");
			}


	}
	public static void main(String[] args){
		new IPFinder();
	}
} 