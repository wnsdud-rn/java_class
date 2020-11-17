import crypto.CaesarCipher;
import dying.Dye;
import dying.DyeBlue;
import dying.DyeRed;

//추상 클래스 :  클래스 내부에 추상 메서드를 지닌 클래스

// # 추상 메서드
	//	-함수의 형태만 정해놓고 자식 클래스에서 오버라이드를 구현하게 만든다
	//	-자식클래스에서 오버라이드 하지 않으면 컴파일 에러가 발생한다
	//	-자식 클래스에 같은 형태의 해당 메서드가 100% 존재하는것을 보장한다
	//	-업캐스팅 했을때 자식 클래스에서 구현된 코드를 사용하게 된다
	
	
public class C06_abstract {

	public static void main(String[] args) {
		//Test
		String color = "Blue";
		
		Dye dye=null;
		
		if(color.equals("Red")) {
			dye = new DyeRed();
		} else if(color.equals("Blue")) {
			dye = new DyeBlue();
		}
		
		dye.dodye("민식");
	}
}

//abstract 클래스오 그것을 상속받는 케이스를 설계 해보세요
//(추상 메서드가 반드시 존재해야 함)