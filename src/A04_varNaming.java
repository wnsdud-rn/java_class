
public class A04_varNaming {
	
	public static void main(String[] args) {
		
		// # 우리가 변수를 사용해야 하는 이유
		//	1. 값을 한번에 변경할 수 있다
		//		-값을 일일이 찾아다니면서 변경할 필요가 없음
		//	2. 값에 의미를 부여해서 가독성을 높임
		int apple_count =45;
		int apple_price =485;
		int apple_gram = 50;
		int apple_calorie =112;
		
		System.out.println("사과의 총 가격은 "+ apple_count * apple_price +"원 입니다.");
		System.out.println("사과의 총 무게는 "+apple_count * apple_gram +"g 입니다.");
		System.out.println("사과의 총 칼로리는 "+apple_count * apple_calorie +"kcal 입니다.");
		
		
		/*
		 	# 변수 작명 규칙 (권장사항)
		 	
		 	(1) 두 단어 이상을 이어붙일때 _를 활용(snake_case)
		 		ex:apple_count
		 		
		 	(2) 두 단어 이상을 이어붙일때 대문자 활용(CamelCase)
		 		ex: appleCount
		 		
		 	(3) 변수명 첫 글자는 소문자를 사용(이유:클래스랑 햇갈릴까봐) <클래스명 첫 글자엔 대문자 씀>
		 	
		 	(4) 프로그램 내에서 값이 변하지 않을 변수는 모두 대문자를 사용
		 		ex: APPLE_PRICE
		 		
		 	(5) 변수 내용 추측가능하게 적절한 단어를 사용하자
		 	
		 	
		 	# 변수의 작명 규칙 (필수)
		 	
		 	(1) 변수명 첫 번째 글자는 숫자가 될 수 없다
		 		ex: 4pple, 1st
		 		
		 	(2) 변수 사이에는 공백을 사용할 수 없다
		 	(3) 특수문자는 _와 $만 사용가능
		 	(4) 이미 자바에서 사용하는 키워드는 변수명으로 사용불가
		 		ex: int, static, public...
 			
		 */
	}

}
