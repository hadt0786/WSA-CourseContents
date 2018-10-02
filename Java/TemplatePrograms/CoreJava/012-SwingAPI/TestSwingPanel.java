package com.emertxe;
/* Program Description : Program to create Panel using Swing Application and adding slider
 to panel
*Author :Sandhya*/
import java.awt.*;
import javax.swing.*;
public class TestSwingPanel extends JFrame{
     
	TestSwingPanel()
	{
		JSlider  js1 =new JSlider(JSlider.VERTICAL,0,50,50);
		JPanel jp =new JPanel();//Panel is container
		jp.add(js1);//adding slider object to panel
		add(jp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestSwingPanel t1 =new TestSwingPanel();
  t1.pack();
t1.setVisible(true);
		
	}

}
