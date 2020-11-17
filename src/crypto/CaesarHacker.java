package crypto;

public class CaesarHacker {
	//암호문과 charset과 알고리즘이 시저 암호 방식임을 알고있따고 가정한 상태로
	//암호문을 이용하여 평문을 추출해보세요
	
	static char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	static String hijacked = "uryyBmhJBEyqi";
	
	
	public static void main(String[] args) {
		//모든 key값을 대입해보면 평문을 쉽게 추측할수있다.
		for(int key = 0; key<charset.length; key++) {
			CaesarCipher ciper = new CaesarCipher(key);
			System.out.println(ciper.decryption(hijacked));
		}
	}
	
	
	
}
