
package JavaCool303;


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
	 * Constructs new named Cool303Button
	 * @param text
	 */
	public Cool303Button(String text){
		super(text);
		label = text;
	}
	
	/**
	 * Prints name of Cool303Button when pressed
	 */
	public void actionPerformed(ActionEvent e){
		System.out.println(label);
	}
	

}
