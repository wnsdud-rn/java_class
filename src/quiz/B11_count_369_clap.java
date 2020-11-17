package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// 정수 하나를 입력받고
	// 해당 숫자까지 369게임이 진행된다면 몇번 박수를 쳐야하는가
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 내 풀이
		/*
		 * System.out.print("정수 입력 >"); int num = sc.nextInt(); int i = 1; int total =
		 * 0, a = 0, new_i = 0;
		 * 
		 * while (i <= num) { new_i = i; while (true) { a = new_i % 10; if (a == 3 || a
		 * == 6 || a == 9) { total += 1; } new_i /= 10; if (new_i == 0) { break; } }
		 * i++; } System.out.println(total);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //문자로 인식해서 풀기 int user = 333; int clap =0;
		 * 
		 * for(int k = 1;k<=user;k++) { String check =""+k;
		 * 
		 * int len = check.length();
		 * 
		 * for(int l = 0; l<len;l++) { if(check.charAt(k)=='3' || check.charAt(k)=='6'
		 * || check.charAt(k)=='9') { clap++; } } } System.out.println(clap);
		 * 
		 */

		
		//프로그램 실행 시간 측정
		long start_time = System.currentTimeMillis();
		
		// 선생님 풀이
		int user = 333;
		int clap = 0;

		boolean debug = true;

		for (int i = 1; i <= user; i++) {
			int check = i;

			if (debug)
				System.out.printf(" %d : ", i);

			while (check != 0) {
				int digit = check % 10;

				if (digit % 3 == 0 && digit != 0) {
					clap++;
					if (debug) {
						System.out.print("짝");
					}
				}
				check /= 10;
			}
			if (debug) {
				System.out.println();
			}
		}
		System.out.println(clap + "회");
		
		long end_time = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+(end_time-start_time)+"ms");
		
		
	}

}
