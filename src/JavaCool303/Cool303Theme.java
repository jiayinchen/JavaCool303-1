package JavaCool303;

import java.awt.Color;
import java.awt.Component;

public abstract class Cool303Theme {

	public int[] RGB1;
	public int[] RGB2;
	public int[] RGB3;
	
	/**
	 * Constructs new Cool303Theme
	 */
	public Cool303Theme(){
		RGB1 = new int[]{0,0,0};
		RGB2 = new int[]{0,0,0};
		RGB3 = new int[]{0,0,0};
	}
	
	public void applyTheme(Cool303Box box){
		box.repaint();
	}
	
}
