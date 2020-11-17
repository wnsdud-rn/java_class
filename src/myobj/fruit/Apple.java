package myobj.fruit;

public class Apple {

	int calorie;
	String color;

	public Apple(String color) {
		calorie = 300;
		
		if(!color.equals("red")) {
			throw new InvalidColorException();
		}
	}

	/*위에서  try catch 해줌 =>throw
	 * public Apple eat() { try { if (calorie <= 0) { throw new
	 * NoMoreCalorieException(); } } catch (NoMoreCalorieException e) {
	 * System.out.println(e.getMessage()); return this; }
	 * 
	 * System.out.println("맛있게 잘 먹음"); calorie -= 100; return this; }
	 * 
	 * public static void main(String[] args) { new Apple().eat().eat().eat().eat();
	 * 
	 * "abcd".toUpperCase().toLowerCase(); }
	 */
	
	
	//밑에 main에 책임전가 => throws
	public Apple eat() throws NoMoreCalorieException{
		
			if (calorie <= 0) {
				throw new NoMoreCalorieException();
			}
		

		System.out.println("맛있게 잘 먹음");
		calorie -= 100;
		return this;
	}
	
	public static void main(String[] args) {
		try {
		new Apple("red").eat().eat().eat().eat();
		}catch (NoMoreCalorieException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
