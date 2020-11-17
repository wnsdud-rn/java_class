package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	//사용자로부터 전화번호만 입력받아보세요
	//전화번호 형태가 아닐경우 에러 메세지를 출력후 다시 입력해야합니다
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String phoneNumber = null;
		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
		while(true) {
			System.out.print("전화번호 입력 (010-xxxx-xxxx)>");
			phoneNumber = sc.nextLine();
			
			if(Pattern.matches(regex, phoneNumber)) {
				System.out.println("전화번호 입력 완료! : "+ phoneNumber);
				break;
			}else {
				System.err.println("전화번호를 올바른 방법으로 입력하세요!\n");
			}
		}
	}
}
