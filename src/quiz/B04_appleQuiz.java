package quiz;

import java.util.Scanner;

public class B04_appleQuiz {

	//사과를 10개씩 담을 수 있는 바구니가 있을 때
	//사과의 갯수를 입력받으면 필요한 바구니의 개수를 출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수앞에 final넣으면 수정불가
		
		System.out.print("사과 갯수 입력 >");
		int apple = sc.nextInt();
		
		if(apple%10==0) {
			System.out.printf("필요한 바구니의 갯수는 %d개 입니다.", apple/10);
		} else if(apple%10!=0) {
			System.out.printf("필요한 바구니의 갯수는 %d개 입니다.", (apple/10)+1);
		}
		

	}

}
