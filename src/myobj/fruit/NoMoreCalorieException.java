package myobj.fruit;


//Exception 클래스를 상속받으면 반드시 처리해야하는 예외가 된다
public class NoMoreCalorieException extends Exception{

	public NoMoreCalorieException() {
		super("더 이상 먹을 수 없는 사과");
	}
}
