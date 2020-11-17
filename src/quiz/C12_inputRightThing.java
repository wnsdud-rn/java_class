package quiz;

import java.util.Scanner;

public class C12_inputRightThing {
	
	
	public static void main(String[] args) {
		//사용자로부터 int타입의 데이터를 입력받고 출력해보세요
		//잘못된 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야합니다
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 >");
				
			try {
				int data = sc.nextInt();
				System.out.println("정수 :"+data);
				break;
			} catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("정수가 아닙니다!");
			}
		}
		
		
	}
}
