package com.emertxe;

/* Program Description : Program to create Frame using Swing Application and adding RadioButton
inside the Frame 
*Author :Sandhya*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class TestSwingRadio {

	  TestSwingRadio()
	   {
		   JFrame jf1 =new JFrame("Radio Button example");
		   JRadioButton r1 =new JRadioButton("A)Male");
		   r1.setBounds(50,50,100,30);
		   JRadioButton r2 =new JRadioButton("B)FeMale");
		   r1.setBounds(100,100,100,30);
		 ButtonGroup b1=new ButtonGroup();
		   b1.add(r1);
		   b1.add(r2);
	jf1.add(r1);
	jf1.add(r2);
	jf1.setSize(300,300);
	jf1.setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestSwingRadio();
	}

}
