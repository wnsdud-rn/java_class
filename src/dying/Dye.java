package dying;

abstract public class Dye {
	
	String colorName;
	
	public Dye(String color) {
		this.colorName = color;
	}
	
	abstract public String getInfo();
	
	abstract public void dodye(String person);
	
}
