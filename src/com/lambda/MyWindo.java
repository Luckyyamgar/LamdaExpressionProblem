package com.lambda;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;
import javax.swing.tree.FixedHeightLayoutCache;

public class MyWindo {

	
	public static void main(String[] args) {
		// windo :object of jframe
		JFrame frame =new JFrame("my Windo");
		
		//create button and add i frame
		JButton button=new JButton("click me !!");
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
