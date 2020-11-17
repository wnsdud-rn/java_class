package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	// 입력받은 문자열에 숫자만 포함되어 있으면 결과에 1을 저장
	// 다른 문자가 포함되어 있다면 0을 저장하여 출력
	// ※ 단 문자열이 비어있을때는 결과가 2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 >");
		String str = sc.nextLine();
		int result =1;
		
		// # 문자열이 이상한경우 3가지
		//  null
		// -str의 값이 ""  이거랑 밑에꺼랑 같은거
		// -str의 길이가 0인경우 <str.length()==0>
		
		if(str == null || str.equals("")) {
			result =2;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9')) {
				result =0;	
			} 
			
		}
		System.out.println(result);
			
			
		
	}

}
