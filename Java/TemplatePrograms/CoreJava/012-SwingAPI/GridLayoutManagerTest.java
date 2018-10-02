package com.emertxe;

import javax.swing.*;
import java.awt.*;

/**
 * Program Description: The program is to show the implementation of GridLayout
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac GridLayoutManagerTest.java 
 * Execution: java GridLayoutManagerTest 
 * Output:
 */

public class GridLayoutManagerTest {

	private JFrame f;
	private JButton b1, b2, b3, b4, b5;

	public GridLayoutManagerTest() {

		f = new JFrame("Grid Example");
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");

	}

	public void launchFrame() {

		// GridLayout class is inside java.awt package

		f.setLayout(new GridLayout(3, 2));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {

		GridLayoutManagerTest glmt = new GridLayoutManagerTest();
		glmt.launchFrame();

	}

}
