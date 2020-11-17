package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {

	// 점수 입력 -> 등급 출력
	// 90점 이상 : A등급
	// 80점 이상 : B등급
	// 70점 이상 : C등급
	// 60점 이상 : D등급
	// 그 외	   : F등급
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >");
		double score = sc.nextDouble();
		
		if(score > 100 || score < 0) {
			System.out.println("0~100점 사이의 점수를 입력하세요");
			
			//return; main()을 끝낸다
			System.exit(0); //프로그램을 종료합니다
		}
		
		if(score / 10 >= 9) {
			System.out.println("A등급 입니다.");
		} else if(score / 10 >= 8) {
			System.out.println("B등급 입니다.");
		} else if(score / 10 >= 7) {
			System.out.println("C등급 입니다.");
		} else if(score / 10 >= 6) {
			System.out.println("D등급 입니다.");
		}
		else if(score/10 < 6) {
			System.out.println("F등급 입니다.");
		}
		
		

	}

}
