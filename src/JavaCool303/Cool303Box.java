package JavaCool303;

public class Cool303Box extends Cool303Container{

	/**
	 * Constructs new Cool303Box
	 */
	public Cool303Box(){
		super();
	}
	
	/**
	 * Set a Cool303Theme to Cool303Box and its Cool303Componenets
	 * @param theme Cool303Theme
	 */
	public void setTheme(Cool303Theme theme){
		theme.applyTheme();
	}
	
}
