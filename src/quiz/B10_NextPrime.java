package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	// 사용자로부터 숫자를 입력받으면
	// 입력받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >");
		int num = sc.nextInt();

		for (int i = num; true; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 1;
				}
			}
			if (count == 0 && i >= num) {
				System.out.println(i);
				break;
			}

		}
		
		
		//선생님 풀이 사진

	}

}
