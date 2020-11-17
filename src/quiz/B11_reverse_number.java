package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// 정수 하나 입력받고
	// 그 정수를 일의 자리부터 순서대로 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이건 문자열
		/*System.out.print("정수 입력 >");
		String num = sc.nextLine();
		
		int i=1;
		while(i<=num.length()) {
			System.out.print(num.charAt(num.length()-i));
			i++;
		}*/
		
		//이건 정수로
		
		System.out.print("정수 입력 >");
		int num = sc.nextInt(); // .nextInt(다른 진법 사용시 여기에 진법 넣으면됨 예:16);
		int i=10;
		//int reversed =0; 이건 거꾸로된거 저장하는 값
		while(true) {
			System.out.print(num%10);//그리고 %랑 밑/기 할때 해당 진수 넣어주기 예: 10대신 16
			//reversed +=num %10;
			num /=10;
			
			if(num <=0) {
				break;
			}
			//reversed *=10;
		}

	}

}
