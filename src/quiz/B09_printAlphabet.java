package quiz;

public class B09_printAlphabet {

	//1. 반복문을 이용하여 A부터 Z까지 출력해보세요
	//2. 반복문을 이용하여 z부터 a까지 출력해보세요
	
	public static void main(String[] args) {
		
		// 1.
		int a='A',z='Z';
		for(int i=a; i<=z;i++) {
			System.out.print((char)i);
		}
		System.out.println("\n");
		
		//혹은 이렇게 직접 넣기 <for문에 int형 말고도 집어넣을 수 있다!>
		for(char ch='A';ch<='Z'; ch++) {
			System.out.print(ch);
		}System.out.println("\n");
		
		//2.
		int l_a='a', l_z='z';
		for(int j=l_z; j>=l_a; j--) {
			System.out.print((char)j);
		}

	}

}
