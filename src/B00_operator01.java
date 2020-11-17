
public class B00_operator01 {

	public static void main(String[] args) {
		
		// # 연산자 (operator)
		//	- 계산할 때 사용하는 것
		
		// # 산술 연산자
		int a=10, b=7;
		double c = 7.0;
		
		System.out.printf("a = %d, b = %d 일때\n",a,b);
		
		// 연산의 우선순위는 사칙 연산의 우선순위를 따름
		System.out.println("+ : "+(a+b));
		System.out.println("- : "+(a-b));
		System.out.println("* : "+ a*b);
		
		// ※ 정수끼리 나누면 몫만 나옴
		System.out.println(a/b);
		System.out.println(a/c);
		System.out.println(a/(double)b);
		
		System.out.println(a%b); //나머지
		
		//비트 연산(XOR: 서로 다르면 1) <제곱이 아니다>
		System.out.println(a^b); 
		
		System.out.println("제곱 : "+Math.pow(a, b)); //결과는 double타입
		System.out.println("제곱근 : "+Math.sqrt(2));
		System.out.println("절대값 : "+Math.abs(-20));
		System.out.println("반올림 : "+Math.round(1.23));
		System.out.println("올림 : "+Math.ceil(1.001));
		System.out.println("내림 : "+Math.floor(1.999));
		System.out.println("더 큰수 : "+Math.max(a,b));
		System.out.println("더 작은수 : "+Math.min(a,b));
		
		

	}

}
