package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	// 사용자로부터 단어를 하나 입력받고
	// 첫 번째 글자와 마지막 글자가 일치하면 "OK"를 출력
	// 아니면 "NOT OK"를 출력
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 하나 입력하세요 >");
		String word = sc.next();
		
		
		
		if(word.charAt(0)==word.charAt(word.length()-1)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		
		
		

	}

}
