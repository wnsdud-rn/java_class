package quiz;

public class B11_whileQuiz {

	// while문을 이용하여

	// 1. 1부터 100까지의 3의 배수의 총합을 구해보세요
	// 2. 200부터 1까지ㅡ이 출력을 해보세요
	// 3. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구해보세요

	public static void main(String[] args) {
		
		// 1.
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		// 2.
		int j = 200;
		while (j >= 1) {
			System.out.print(j + " ");
			j--;
		}
		System.out.println();
		
		// 3.
		int k = 1;
		int sum2=0;
		while (k <=200) {
			if (k % 2 != 0 && k % 3 != 0) {
				sum2 += k;
			}
			k++;
		}
		System.out.println(sum2);

	}

}
