package com.emertxe;
/* Program Description : Program to create Frame using Swing Application and adding label
inside the Frame 
*Author :Sandhya*/

import javax.swing.*; 

public class TestFrame {
	
	TestFrame()
	{
		JFrame j1 =new JFrame("Swing Application");//creates a new JFrame container
		j1.setSize(270,400);// give the frame initial size
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminates program when user closes application
		JLabel j2 =new JLabel("Swing means powerful GUI and lightweight");//creates label
		j1.add(j2);//add the label 
		j1.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new TestFrame();
	}

}
