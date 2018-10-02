package com.emertxe;
/* Program Description : Program to create Frame using Swing Application and adding label and two button ok and cancel
inside the Frame 
*Author :Sandhya*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TestButton  {

	TestButton()
	{
		JFrame j1 =new JFrame("Swing Application1");//creates a new JFrame container
		j1.setSize(270,400);// give the frame initial size
		j1.setLayout(new FlowLayout());
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminates program when user closes application
		
		Color c1=new Color(255,0,255);
		j1.setBackground(Color.red);
		
		JButton j3=new JButton("ok");
		j3.setBackground(c1);
		Color c2=new Color(255,0,0);
		
		JButton j4=new JButton("Cancel");
		
		j4.setBackground(c2);
		JLabel l1=new JLabel("press the button"); 
		j1.add(j3);
		j1.add(j4);
		j1.add(l1);
		j1.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new TestButton();
	}

}
