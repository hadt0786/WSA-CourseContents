package com.emertxe;

/* Program Description : Program to create Frame using Swing Application and adding ComboBox
inside the Frame 
*Author :Sandhya*/
import javax.swing.*;
public class TestCombo {

	
	TestCombo()
	{
		JFrame  jf1 =new JFrame("Combo Example");
		String city[] ={"Banglore","Mumbai","Kolkata","Delhi"};
		JComboBox jc =new JComboBox(city);
		jf1.add(jc);
		jf1.setSize(300,300);
		jf1.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new TestCombo();
	}

}
