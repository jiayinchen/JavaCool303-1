package JavaCool303;

import javax.swing.JComponent;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory.*;
import javax.swing.border.*;
/**
 * 
 * @author JiaYin Chen #260690708, Yu Qi Liu #260687081
 *
 */
public class Cool303Component extends JComponent {

	ArrayList<Cool303Component> compList=new ArrayList<Cool303Component>();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructor
	 * */
	public Cool303Component(){
		super();
	
	}

	/*
	 * @param Graphics g 
	 * @param int[] color*/
	public void paint(Graphics g, int[] color){
		super.paint(getGraphics());
		setBackground(new Color(color[0], color[1], color[2]));
	}
	public void paintBorder(Graphics g, int[] color){
		super.paintBorder(getGraphics());
		setBackground(new Color(color[0], color[1], color[2]));
	}
	public void setBorder(Border bName){
		super.setBorder(bName);;	
	}
	/*
	 * @param Graphics g 
	 * @param int[] color*/
	public void paintComponent(Graphics g, int[] color){
		super.paintComponent(getGraphics());
		setBackground(new Color(color[0], color[1], color[2]));
	}
	/*
	 * @param Cool303Component comp
	 * */
	public void add(Cool303Component comp){
		this.compList.add(comp);
	}
	/*
	 * @param Cool303Component comp
	 * @returns an array of all the Cool303Components
	 * */
	public Cool303Component[] getComponents(){
		Cool303Component[] ans=new Cool303Component[this.compList.size()];
		int i=0;
		for(Cool303Component c:this.compList){
			ans[i]=c;
			i++;
		}
		return ans; 
	}
	
}
