

/**



* Program Description: This program is show how to create Menu
* @Author: Vikas

*/

import java.awt.*;
import javax.swing.*;


public class MenuTest{

	private static JFrame f = null;
	private static JMenuBar mb = null;
	private static JMenu m1 = null;
	private static JMenu m2 = null;
	private static JMenu m3 = null;


	public static void main(String[] args){


		f = new JFrame("MenuBar");
		mb = new JMenuBar();
		f.setJMenuBar(mb);
		f = new JFrame("Menu");
		mb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		m3 = new JMenu("Help");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setJMenuBar(mb);

	}

}
