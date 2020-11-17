package quiz;

public class B02_conditionQuiz01 {

	/*
		[ 알맞은 비교연산을 만들어보세요 ]
	    
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true		
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true	
		5. int형 변수 d와 e의 차이가 30일 때 true	
		6. int형 변수 year가 400으로 나누어 떨어지면 true 
		   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		7. 민수가 철수보다 2살 많으면 true
		8. 민수가 철수보다 생일이 3달 빠르면 true  
		9. boolean형 변수 powerOn이 false일 때 true
		10. 문자열 참조변수 str이 "yes"일 때 true
		11. 삼각형 A가 직각삼각형이면 true
	 */
	
	
	
	public static void main(String[] args) {
		
		int 	a=15,
				b=2,
				c=7,
				d=60, e=30,
				hour=24,
				year=240, 
				m_age=10,
				c_age=8,
				m_birth=1,
				c_birth=4,
				t_a=4, t_b=5, t_c=3;
		boolean powerOn = false;
		String str ="yes";
		
		//1.
		System.out.println(10<a && a<20);
		//2.
		System.out.println(b%2==0);
		//3.
		System.out.println(c%7==0);
		//4.
		System.out.println(!(0>hour || hour>=24) && hour>=12);
		//5.
		System.out.println(d-e==30 || d-e==-30); //System.out.println(Math.abs(d-e)==30);
		//6.
		System.out.println((year%400==0) || ((year%4==0) && !(year%100==0)));
		//7.
		System.out.println(m_age==c_age+2);
		//8.
		System.out.println(c_birth-m_birth==3);
		//9.
		System.out.println(!powerOn);
		//10.
		// 소문자로 시작하는 타입 - 값을 저장한다
		// 대문자로 시작하는 타입 - 주소를 저장한다 (참조형)
		System.out.println(str=="yes"); //System.out.println(str.equals("yes"));
		//11.
		System.out.println((t_a*t_a)+(t_b*t_b)==(t_c*t_c) || (t_a*t_a)+(t_c*t_c)==(t_b*t_b) || (t_b*t_b)+(t_c*t_c)==(t_a*t_a));
		
		

	}

}
