package crypto;

public class TranspositionCipher extends Cipher{
	// # 전치 암호
	//	- 메세지를 Key값 만큼의 길이로 나눈 뒤 다른 방향으로 읽어서 암호화 하는 방식
	
	// ex>
	
	// plain : Common sense is not so common.
	// key : 8
	
	// 0 1 2 3 4 5 6 7
	//-----------------
	// C o m m o n   s
	// e n s e   i s  
	// n o t   s o   c
	// o m m o n .
	
	//crypto : Cenoonommstmme oo snnio. s s c
	
	//0 1 2 3
	//C e n o 
	// ...
	//  s   X
	//s   c X
	
	
	int key;
	
	public TranspositionCipher(int key) {
		this.key = key;
		
	}
	
	
	
	
	public String encryption(String plain) { 
		
		StringBuilder[] builders = getBuilders(key);
		
		for(int i = 0;i<plain.length();i++) {
			builders[i%key].append(plain.charAt(i)); 
		}
		
		return joinBuilders(builders);
		
	}
	
	
	public String decryption(String crypto) {
		int len = crypto.length();
		
		int columnSize = len %key>0 ? len/ key + 1 : len / key;
		int numOfBlanks = columnSize * key - len;
		int numOfFull = key -numOfBlanks; //=len % key
		
		StringBuilder[] builders = getBuilders(columnSize);
		
		
		for(int column=0;column<columnSize;column++) {
			int crypto_index = column;
			
			//한 줄이 반복될때마다 fullLine인 경우 컬럼만큼 인덱스 증가
			//아닌경우 컬럼-1 만큼 인덱스 증가
			for(int row=0;row<key;row++) {
				builders[column].append(crypto.charAt(crypto_index));
				
				if(row<numOfFull) {
					crypto_index+=columnSize;
				} else {
					crypto_index+=columnSize-1;
				}
				
				//추가한 index가 마지막 column이면서 동시에 마지막 fullLine인 경우
				if(column==columnSize-1 && row == numOfFull-1) {
					break;
				} else if(crypto_index >= len) {
					break;
				}
			}
			
		}
		
		return joinBuilders(builders);
	}
	
	
	
	private String joinBuilders(StringBuilder[] builders) {
		StringBuilder result = new StringBuilder();
		for(StringBuilder builder:builders) { //앞 builder에 builders값들이 차례대로 들어감
			result.append(builder);
		}
		return result.toString();
	}
	
	
	//클래스 내부에서만 사용하는 변수/자원 앞에 붙이면 외부에서 쓸 수 없게됨
	private StringBuilder[] getBuilders(int columnSize) {
		StringBuilder[] builders = new StringBuilder[columnSize];
		
		
		/*잘못된 소스
		 * 	-임시 변수인 builder 에 새로운 인스턴스 를 만들어봤자
		 * 	 중괄호를 벗어나면 사라진다
		 * for(StringBuilder builder:builders) { //앞 builder에 builders값들이 차례대로 들어감
		 * builder = new StringBuilder(); }
		 */
		
		for(int i=0;i<builders.length;i++) {
			builders[i]=new StringBuilder();
		}
			
			return builders;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String crypto = new TranspositionCipher(8).encryption("Common sense is not so common.");
		System.out.println(crypto);
		
		String plain = new TranspositionCipher(8).decryption(crypto);
		System.out.println(plain);
		
		
	}
	
	
	
	
}
