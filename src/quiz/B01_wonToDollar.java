package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

	//한국 돈을 입력하면
	//달러 구매시 얼마를 받게 되는지 계산해주는 프로그램을 만들어보세요
	// 소수 둘째자리까지, 환전 수수료 1.75%
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한화를 입력하세요(원 단위) >");
		int won = sc.nextInt();
		
		//1,138.80
		double dollar = won/1138.80;
		System.out.printf("입력하신 한화 %d￦를 달러로 환전하면 %.2f＄입니다.",won, dollar*0.9825);
		
		

	}

}
