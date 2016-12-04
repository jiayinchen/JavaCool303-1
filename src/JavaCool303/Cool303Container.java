package JavaCool303;

import java.awt.Container;
import javax.swing.JTextArea;

/**
 * 
 * @author JiaYin Chen #260690708, Yu Qi Liu #260687081
 *
 */
public class Cool303Container extends Container{

	/**
	 * Constructs new Cool303Container
	 */
	public Cool303Container(){
		super();
	}
	
	/**
	 * Constructs new Cool303Container with a title
	 * @param title title of Cool303Container
	 */
	public Cool303Container(String title){
		JTextArea text = new JTextArea(title);
		add(text,0);
	}
	
}
