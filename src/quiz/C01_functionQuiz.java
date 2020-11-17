package quiz;

public class C01_functionQuiz {

	// # 다음 함수를 정의해 보세요
	// 1. 전달한 문자가 알파벳이면 true를 반환 아니면 false
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환
	// 3. 숫자를 한 개 전달하면 문자열 짝수입니다 또는 홀수입니다를 반환
	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수(boolean)
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	// factorial : n*n-1...1;
	// 6. 숫자 두개(a,b)를 전달하면 a의 b제곱을 반환하는 함수
	//	(0제곱은 1을 반환, Math.pow금지)
	
	// 1.
	public static boolean alpha(char ch) {
		boolean is_alpha = false;
		
		if(ch>='a' && ch<='z' || ch>='A' && ch <='Z') {
			is_alpha = true;
		}
		return is_alpha;
	}
	/*
	 * return (ch>='a' && ch<='z') || (ch>='A' && ch <='Z'); 
	 */
	
	
	
	
	//2.
	public static boolean three(int num) {
		boolean is_three = false;
		
		if(num%3==0) {
			is_three = true;
		}
		return is_three;
	}
	/*
	 * return num%3==0;
	 */
	
	
	
	
	
	//3.
	public static String e_o(int num) {
		String even = "짝수입니다";
		String odd = "홀수입니다";
		
		if(num%2==0) {
			return even;
		}else {
			return odd;
		}
	}
	/*
	 * return num%2==0 ? "짝수입니다":"홀수입니다";
	 */
	
	
	
	
	//4.
	public static boolean prime(int num) {
		boolean is_prime = true;
		
		if(num==1) {
			is_prime = false;
			return is_prime;
		}
		
		for(int i=2;i<num;i++) {
			for(int j=2;j<=i;j++) {
				if(num%i==0) {
					is_prime = false;
					break;
				}
			}
		}
		
		return is_prime;
	}
	/*
	 * if(num==1)
	 * return false;
	 * 
	 * double squr = Math.squr(num)
	 * for(int i=2;i<=sqrt;i++){
	 * if(num%i==0){
	 * return false;
	 * }
	 * }
	 * return true;
	 */
	
	
	
	//5.
	public static int fact(int num) {
		int result = 1;
		for(int i=num;i>0;i--) {
			result *=i;
		}
		return result;
	}
	//재귀함수 : 자기 사진을 부르는 함수 (성능안좋음 읽기힘듬 머리아픔)
	public static int recursive_factorial(int num) {
		if(num==1)
			return 1;
		
		return num *recursive_factorial(num-1);
	}
	
	
	
	
	
	
	//6.
	public static double square(int a, int b) {
		int result =1;
		
		if(a==0) {
			result = 0;
			return result;
		}
			
	
		for(int i=1;i<=b;i++) {
			result *=a;
		}
		return result;
	}
	//6번도 재귀로 해보자
	public static double recursive_square(int a, int b) {
		if(b==0)
			return 1;
		
		return a* recursive_square(a, b-1);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//1.
		boolean ch = alpha('ㄱ');
		System.out.println("알파벳인가? "+ch);
		
		//2.
		boolean multi_three = three(1);
		System.out.println("3의 배수인가? "+multi_three);
		
		//3.
		String ch2 = e_o(2);
		System.out.println("짝수인가? "+ch2);
		
		//4.
		boolean num = prime(4);
		System.out.println("소수인가? "+num);
		
		//5.
		int n = 5;
		int num2 = fact(n);
		System.out.printf("%d의 팩토리얼은 >"+num2,n);
		System.out.println();
		
		//6.
		int a=2,b=3;
		double num3 = square(a,b);
		System.out.printf("%d의 %d제곱은 >"+num3,a,b);
		System.out.println();
		//재귀
		double num4 = recursive_square(a,b);
		System.out.printf("%d의 %d제곱은 >"+num4,a,b);
		
		

	}

}
