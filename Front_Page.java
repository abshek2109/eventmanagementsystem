package eventmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
	JFrame f;
	JLabel id,l1;
	JButton b;
	
	Front_Page(){
		f=new JFrame("Event Management System");
		f.setBackground(Color.red);
		f.setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("eventmanagementsystem/icon/front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1200, 700,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(0,150,1360,530);
		f.add(l1);
		
		b=new JButton("CONTINUE");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		
		b.setBounds(500,600,300,70);
		b.addActionListener(this);
		
		
		id = new JLabel();
		id.setBounds(0,0,1360,750);
		id.setLayout(null);
		
		JLabel lid=new JLabel("EVENT MANAGEMENT SYSTEM");
		lid.setBounds(80,30,1500,100);
		lid.setFont(new Font("serif",Font.PLAIN,70));
		id.add(lid);
		
		id.add(b);
		f.add(id);
		
		f.getContentPane().setBackground(Color.WHITE);
		
		
		f.setVisible(true);
		f.setSize(1360,750);
		f.setLocation(200,100);
		
		while(true) {
			lid.setVisible(false);
			try {
				Thread.sleep(500);
				}catch(Exception e){}
			lid.setVisible(true);
			try {
				Thread.sleep(500);
				}catch(Exception e) {}
		
		}	
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b) {
			f.setVisible(false);
			new login();
			
		}
		
	}
	
	public static void main(String[] args) {
		 new Front_Page();
		
	}
}
