package quiz;

import java.util.Scanner;

public class B09_printReverse {

	public static void main(String[] args) {
		// 사용자가 문자를 입력하면 그걸 반대로 출력하라
		
		Scanner sc = new Scanner(System.in);
		
		//StringBuilder는 +=대신 append()함수를 통해 문자열을 만든다
		StringBuilder str = new StringBuilder("hello");
		str.append(",world!");
		//다 만들고 난 뒤에 String으로 변환해서 사용하면 된다
		String build_result = str.toString();
		System.out.println(build_result);
		
		System.out.print("문장을 입력하시오 >");
		String word = sc.nextLine();
		
		
		int i;
		
		for(i=1; i<=word.length(); i++) {
			int num = word.length()-i;
			System.out.print(word.charAt(num));
			
		}
		
		
		
		
	}

}
