package com.emertxe;
/* Program Description : Program to create Menu bar ,Menu and Sub Menu
*Author :Sandhya*/
import javax.swing.*;
import java.awt.event.*;
public class TestSwingMenu {

	JFrame f;
	
	TestSwingMenu()
	{
		f=new JFrame("Menu Bar");
		JMenuBar  m1 =new JMenuBar();
		f.setJMenuBar(m1);
		f=new JFrame("Menu");
		m1=new JMenuBar();
		
	JMenu	m11 =new JMenu("File");
	JMenu	m12 =new JMenu("Edit");
	JMenu	m13 =new JMenu("Help");
	
	     m1.add(m11);
	     m1.add(m12);
	     m1.add(m13);
	     f.setJMenuBar(m1);
	   JMenuItem   mi1  =new JMenuItem("New");
	   JMenuItem   mi2  =new JMenuItem("Open");
	   JMenuItem   mi3  =new JMenuItem("Save");
	   JMenuItem   mi4  =new JMenuItem("Quit");
	   
	   
	   m11.add(mi1);
	   m11.add(mi2);
	   m11.add(mi3);
	   m11.addSeparator();
	   m11.add(mi4);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestSwingMenu();
        
	}

}
