package crypto;


public class CaesarCipher extends Cipher{
	
	 // # 암호란?
	//	- 비밀 메세지를 주고받기 위한 것
	//	- 암호화 (Encryption): 평문(일반메세지)를 암호문(비밀 메세지)로 바꾸는 것
	//	- 복호화 (Decryption): 암호문을 평문으로 되돌리는 것
	//	- 키 (Key): 암호화 복호화에 사용되는 비밀 값
	
	// # 시저(카이사르) 암호
	//	- 알파벳을 키(Key)값 만큼 오른쪽으로 이동시키는 암호 방식
	//	- 암호화 : 평문을 키 값 만큼 오른쪽으로 이동시킨다
	//	- 복호화 : 암호문을 키 값 만큼 왼쪽으로 이동시킨다
	
	//ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcd...
	// * Key값이 3인경우 암호화(+3
	//"Hello, World!" => "Khoorc#Zruog$"
	// * Key값이 3인경우 복호화(-3
	//"Khoorc#Zruog$" => "Hello, World!" 
	
	static char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz".toCharArray();
	int key;
	
	public CaesarCipher(int key) {
		this.key = key%letters.length;
	}
	
	
	//내코드 z넘어가면 동작안됨
	/*
	 * public static String encryption(String plain_text) { // 매개변수로 받은 평문을 암호화 하여
	 * 리턴하는 함수를 구현 StringBuilder sb = new StringBuilder();
	 * 
	 * for(int i=0;i<plain_text.length();i++) { for(int j=0;j<letters.length;j++) {
	 * if(plain_text.charAt(i)==letters[j]) {
	 * 
	 * char new_text = letters[j+key]; sb.append(new_text); }
	 * 
	 * } }
	 * 
	 * return sb.toString(); }
	 * 
	 * public static String decryption(String crypto_text) { // 매개변수로 받은 암호문을 복호화 하여
	 * 리턴하는 함수를 구현 StringBuilder sb = new StringBuilder();
	 * 
	 * for(int i=0;i<crypto_text.length();i++) { for(int j=0;j<letters.length;j++) {
	 * if(crypto_text.charAt(i)==letters[j]) {
	 * 
	 * char new_text = letters[j-key]; sb.append(new_text); }
	 * 
	 * } }
	 * 
	 * return sb.toString(); }
	 */
	
	public int indexOf(char ch) {
		for(int i=0;i<letters.length;i++) {
			if(ch==letters[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public String encryption(String plain_text) { 
		StringBuilder crypto = new StringBuilder();
		
		for(int i=0;i<plain_text.length();i++) {
			char ch = plain_text.charAt(i);
			
			int index = indexOf(ch);
			
			if(index !=-1) {
				//찾은경우 ch를 암호화
				crypto.append(letters[(index+key)%letters.length]);
			}else {
				//못찾은경우 ch유지
				crypto.append(ch);
			}
			
		}
		return crypto.toString();
	}
	
	
	public String decryption(String crypto_text) {
		StringBuilder plain = new StringBuilder();
		
		for(int i=0;i<crypto_text.length();i++) {
			char ch = crypto_text.charAt(i);
			int index = indexOf(ch);
			if(index !=-1) {
				//letters에 있는경우 복호화
				int plain_index = index-key;
				plain_index = plain_index < 0 ? plain_index+letters.length:plain_index;
				
				plain.append(letters[plain_index]);
			}else {
				//letters에 없는 문자는 그대로 유지
				plain.append(ch);
			}
		}
		return plain.toString();
	}
	
	
	public static void main(String[] args) {
		/*
		 * CaesarCipher c1 = new CaesarCipher(3);
		 * 
		 * 
		 * String a = encryption("z"); System.out.println(a);
		 * 
		 * String b = decryption("def$"); System.out.println(b);
		 */
		
		
		String crypto = new CaesarCipher(3).encryption("hello, World!");
		System.out.println(crypto);
		String text = new CaesarCipher(3).decryption(crypto);
		System.out.println(text);
		
		
		
		
		
	}
	
	
} 
