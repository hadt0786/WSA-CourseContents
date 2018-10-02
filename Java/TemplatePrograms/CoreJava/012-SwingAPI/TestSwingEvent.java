package com.emertxe;
/* Program Description : Program to handle event in swing Application 
*Author :Sandhya*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestSwingEvent extends Frame implements ActionListener{

	JLabel j1;
	JFrame j2;
	TestSwingEvent()
	{
		j2=new JFrame("Event Example in Swing");
		j1=new JLabel("Hello");
		 j1.setBounds(30,30,50,50);
		JButton j3 =new JButton("Ok");
		
		j3.setBounds(90,90,50,70);
		j2.add(j1);
		j2.add(j3);
		JButton j4 =new JButton("Cancel");
		 
		 
		 j4.setBounds(90,90,150,70);
		j3.addActionListener(this);
//		j4.addActionListener(this);
		
		
		j2.add(j4);
		j2.setSize(300,300);
		j2.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent a1)
	{
		j1.setText("ok Pressed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestSwingEvent t1= new TestSwingEvent();
	}

}
