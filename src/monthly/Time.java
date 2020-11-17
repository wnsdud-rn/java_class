package monthly;
import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("24시간제로 입력하세요 (예: 오전9시 = 9 / 오후9시 = 21)");
		System.out.print("시간 입력 >");
		int hour = sc.nextInt();
		System.out.print("분 입력 >");
		int min = sc.nextInt();

		if (hour >= 0 && hour <= 24) {

			if (min >= 0 && min <= 59) {

				if (hour < 9) {
					System.out.println("정상");
				} else if (hour <= 9) {
					if (min <= 10) {
						System.out.println("정상");
					} else {
						System.out.println("지각");
					}
				} else if (hour > 9 && hour < 15) {
					System.out.println("지각");
				} else {
					System.out.println("결석");
				}

			} else {
				System.err.println("에러");
			}

		} else {
			System.err.println("에러");
		}

	}
}
