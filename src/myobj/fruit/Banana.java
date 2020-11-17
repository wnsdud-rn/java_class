package myobj.fruit;

public class Banana {
	int size;
	int sweet;
	int calorie;
	String color;
	
	public Banana() {
		size = 30;
		sweet = 5;
		calorie = 40;
		color ="yellow";
	}
	
	
	public Banana(int size, int sweet, int calorie, String color) {
		super();
		this.size = size;
		this.sweet = sweet;
		this.calorie = calorie;
		this.color = color;
	}


	public void cook() {
		System.out.println("믹서기에 넣고 갈기 시작합니다");
		this.size -=20;
		this.color = "갈색";
		System.out.printf("사이즈가 %d로 색이 %s으로 변경되었습니다.\n",this.size,this.color);
	}
}
