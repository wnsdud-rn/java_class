package dying;

public class DyeBlue extends Dye {

	public DyeBlue() {
		super("파란색");
	}

	@Override
	public String getInfo() {		
		return colorName;
	}

	@Override
	public void dodye(String person) {
		System.out.printf("%s님의 머리를 %s로 염색했습니다.\n", person, colorName);		
	}
	
	

}
