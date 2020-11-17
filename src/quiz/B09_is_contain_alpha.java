package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
	// 없으면 false를 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean contain_alpha = false;
		char ch;
		
		System.out.print("아무거나 입력 >");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			
			ch = word.charAt(i);
			
			if(ch >='A' && ch <='Z') {
				contain_alpha = true;
			} else if (ch >='a' && ch <='z') {
				contain_alpha = true;
			}
			
		}
		System.out.println(contain_alpha);
		
		
		
		
		

	}

}
