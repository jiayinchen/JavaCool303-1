package JavaCool303;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class ThemeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		Cool303Container c = new Cool303Container();
		Cool303Box box = new Cool303Box();
		
		// add 20 Cool303Button to box
		for(int i = 0; i < 20; i++){
			box.add(new Cool303Button(String.valueOf(i)));
		}
		
		c.add(box);
		f.add(c);
	}

}
