package JavaCool303;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * @author JiaYin Chen #260690708, Yu Qi Liu #260687081
 *
 */
public class Cool303Container extends JPanel{

	/**
	 * Constructs new Cool303Container
	 */
	public Cool303Container(){
		super();
	}
	
	public Cool303Container(LayoutManager layout){
		super(layout);
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
