package quiz;

import java.util.Scanner;

public class B09_strupcase {
	//~~~.toUpperCase() toLowerCase()라는 함수가 있다
	
	
	//입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요
	// - 원본이 훼손되지 않고 새로운 문자열이 생성되어야함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 >");
		String str = sc.nextLine();
		
		 
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				ch = (char)(ch-32);
			}
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("원래 문자열 >"+str);
		
		
		///// 선생님 풀이
		/*StringBuilder strb = new StringBuilder();
		
		System.out.println("문장 >");
		String str2 = new Scanner(System.in).nextLine();
		
		for(int i=0;i<str2.length(); i++) {
			char ch2 = str2.charAt(i);
			
			if(ch2 >= 'a' && ch2 <'z') {
				ch2 -=32;
			}
			strb.append(ch2);
		}
		System.out.println(strb);
		*/

	}

}
