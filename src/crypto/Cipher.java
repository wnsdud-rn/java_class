package crypto;
//for Crypto Main_T

//추상 클래스 :  클래스 내부에 추상 메서드를 지닌 클래스
abstract public class Cipher {
	
	//자식 클래스들의 형태를 미리 결정
	//자식 클래스들이 메서드를 오버라이드 하여 사용하게 만든다
	abstract public String encryption(String plain);
	
	abstract public String decryption(String crypto);
}




//이런식으로 오버라이드 사용
class MyAlgo extends Cipher{

	@Override
	public String encryption(String plain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decryption(String crypto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
