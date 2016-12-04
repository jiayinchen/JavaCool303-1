package JavaCool303;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ThemeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		Cool303Container c = new Cool303Container();
		c.setVisible(true);
		
		Cool303Box box = new Cool303Box();
		box.setVisible(true);
		
		// add 20 Cool303Button to box
		for(int i = 0; i < 20; i++){
			Cool303Button temp = new Cool303Button(String.valueOf(i));
			temp.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					temp.actionPerformed(e);
				}
			});
			box.add(temp);
		}
		
		new Cool303ThemePastel().applyTheme(box);
		
		c.add(box);
		f.add(c);
	}

}
