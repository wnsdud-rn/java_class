package quiz;

import java.util.Scanner;

public class B10_GCD {

	// 두 숫자를 입력받으면 두 숫자의 최대 공약수를 구해보세요

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력 >");
		int num2 = sc.nextInt();

		int small = num1 > num2 ? num2 : num1;
		int gcd = 0;

		for (int i = small; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}

		}

		System.out.println(gcd);

	}

}
