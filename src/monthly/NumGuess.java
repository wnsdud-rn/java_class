package monthly;
import java.util.Scanner;

public class NumGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int computer_num = (int) (Math.random() * 1001);
		int count = 0;

		while (true) {
			count += 1;
			System.out.print("사용자 >");
			int user_num = sc.nextInt();

			if (user_num == computer_num) {
				System.out.println("정답!");
				System.out.printf("정답 숫자 :%d 시도횟수 :%d", computer_num, count);
				break;
			} else if (user_num > computer_num) {
				System.out.println("DOWN!");
			} else if (user_num < computer_num) {
				System.out.println("UP!");
			}

		}
	}
}
