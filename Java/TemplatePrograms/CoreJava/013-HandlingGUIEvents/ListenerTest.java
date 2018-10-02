package com.emertxe;

/**
 * Program Description: This program is to show the implementation of Listener interface
 * 
 * Author: Vikas
 * Written: 11/02/2015
 * Last Update: 
 * 
 * Compilation: javac ListenerTest.java
 * Execution: java ListenerTest
 * Output:
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		System.out.println("Action occurred");
		System.out.println("Button’s command is: " + e.getActionCommand());
	}
}

public class ListenerTest {

	private JFrame f;
	private JButton b;

	public ListenerTest() {

		f = new JFrame("Test");
		b = new JButton("Press Me!");
		b.setActionCommand("ButtonPressed");
	}

	public void launchFrame() {

		b.addActionListener(new ButtonHandler());
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {

		ListenerTest lt = new ListenerTest();
		lt.launchFrame();

	}

}
