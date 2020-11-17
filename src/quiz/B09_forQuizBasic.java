package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	// 사용자가 숫자를 입력했을 때
	// 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
	// 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고
	//	  총 몇 개 인지도 출력하기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.
		int i, sum=0;
		System.out.print("정수를 하나 입력하시오 >");
		int num = sc.nextInt();
		
		if(num<=10) {
			for(i=num; i<=10; i++) {
				sum +=i;
			}
			System.out.printf("10부터 %d까지의 총 합은"+sum+"입니다.\n",num);
		} else {
			for(i=10; i<=num; i++) {
				sum +=i;
			}
			System.out.printf("10부터 %d까지의 총 합은"+sum+"입니다.\n",num);
		}
		
		//2.
		
		
		System.out.print("정수를 하나 입력하시오 >");
		int num2 = sc.nextInt();
		int total = 0;
		
		if(num2<=1) {
			for(i=1; i>=num2 ; i--) {
				if(i%3==0) {
					System.out.print(i+" ");
					total+=1;
				}
			}
			System.out.println();
			System.out.printf("1부터 %d까지의 3의 배수의 갯수는 "+total+"개",num2);
		} else {
			for(i=1; i<num2 ; i++) {
				if(i%3==0) {
					System.out.print(i+" ");
					total+=1;
				}
			}
			System.out.println();
			System.out.printf("1부터 %d까지의 3의 배수의 갯수는 "+total+"개",num2);
		}
		

	}

}
