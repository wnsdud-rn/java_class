package quiz;

import java.util.Scanner;

public class B06_monthToSeason {
	// switch-case문 사용
	// 사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세요 >");
		int month = sc.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("입력하신 달의 계절은 '봄' 입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("입력하신 달의 계절은 '여름' 입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("입력하신 달의 계절은 '가을' 입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("입력하신 달의 계절은 '겨울' 입니다.");
			break;
		default:
			System.out.println("입력하신 달은 존재하지 않습니다.");
		
		
		}

	}

}
