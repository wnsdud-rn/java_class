import java.util.Arrays;

public class C01_function {

	// 함수(function)
	//	- 기능을 미리 정의해두고 나중에 가져다 쓰는것
	//	- 함수 이름 뒤에 ()를 붙여서 함수를 호출하면 함수의 실행 결과가 반환된다
	//	- 나중에 재사용 할 가능성이 있는 기능을 미리 만들어둠으로써 작업의 반복을 줄인다
	
	// ex : 사과의 개수와 바구니의 크기를 전달받으면 필요한 바구니 개수를 알려주는 기능
	public static int appleBasket(int appleNum, int basketSize) {//int는 나중에 돌려줄 값의 타입
		                          //()안에는 넣을값
		int result;
		
		if(appleNum%basketSize==0) {
			result = appleNum/basketSize;
		} else {
			result = (appleNum/basketSize)+1;
		}
		return result; // 함수타입이 int임으로 돌려주는 타입이 int여야한다.
	}
	
	
	// ex : 여러 슈퍼의 사과 가격을 입력받으면 가장 싼 가격을 알려주는 함수
	public static int cheapPrice(int[] prices) {
		int min=0;
		
		for(int i=0; i<prices.length;i++) {
			
			if(i==0) {
				min = prices[i];
			}else {
				min = Math.min(min, prices[i]);
			}
		}
		return min;
	}
	
	
	// ex : 사과들의 평균 가격을 알려주는 함수
	public static double avgPrice(int[] prices) {
		int sum =0;
		
		for(int i=0; i<prices.length;i++) {
			sum +=prices[i];
		}
		return sum / (double)prices.length;
	}
	
	
	// ex : 전달한 사과 가격들을 10000원씩 증가시키느 함수
	public static void raisePrice(int[] prices) {
		for(int i=0; i<prices.length;i++) {
			prices[i] +=10000;
		}
		//return타입이 void인 함수는 아무것도 리턴하지 않는다.
		return; //이것도 아무것도 리턴하지 않음
	}
	
	
	public static void main(String[] args) {
		int count = appleBasket(25,10);
		System.out.println("필요한 바구니 개수 : "+count);
		
		int[] apples = {1000,2000,989,1100,990,};
		System.out.println("제일 싼 사과 가격은 : "+cheapPrice(apples));
		System.out.println("사과 가격의 평균은 : "+avgPrice(apples));
		
		for(int i=0;i<5;i++) { //이건 오만원 증가
			raisePrice(apples);}
		System.out.println(Arrays.toString(apples));

		
		//즉 리턴값이 있으면 println가능 없는건 불가능
		
	}

}
