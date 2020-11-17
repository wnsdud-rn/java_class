package quiz;

import java.util.Scanner;

public class B01_celToFahr {

	// 사용자로부터 섭씨 온도를 입력받으면
	// 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	// (변환 공식 검색 , 출력은 소수 첫자리까지)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fahr;
		//(섭씨x1.8) + 32
		//섭씨 = c 화씨 =f
		System.out.print("섭씨 온도를 입력하세요 >");
		double cel = sc.nextDouble();//둘이 같음 double cel = new Scanner(System.in).nextDouble()
		
		fahr = (cel*1.8)+32;
		System.out.printf("입력하신 섭씨 %.1f℃를 화씨로 변경하면 %.1f℉입니다.",cel,fahr);
		
		

	}

}
