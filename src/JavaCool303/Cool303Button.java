
package JavaCool303;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Cool303Button extends JButton implements ActionListener {
	
	private String label;
	
	/**
	 * Constructs new Cool303Button
	 */
	public Cool303Button(){
		super();
	}
	
	/**
	 * Constructs new Cool303Button with text
	 * @param text text on Cool303Button
	 */
	public Cool303Button(String text){
		super(text);
		label = text;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(label);
	}	

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(getGraphics());
		setBackground(new Color(247, 147, 225));
	}
}
