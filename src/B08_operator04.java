
public class B08_operator04 {

	public static void main(String[] args) {
		// # 대입 연산
		//	= : 왼쪽의 변수에 오른쪽의 값을 대입
		int num =10;
		num = num+5;
		
		// # 복합 대입 연산
		//	- 변수에 결과를 누적시키는 연산
		num =10;
		 
		System.out.println(num +=5);//num = num+5
		System.out.println(num -=2);//num = num-2
		System.out.println(num *=5);//num = num*5
		System.out.println(num /=5);//num = num/5
		
		// # 단항 연산
		num=10;
		
		num++; //num = num+1
		System.out.println(num);
		++num; //num = num+1
		System.out.println(num);
		num--; //num = num-1
		System.out.println(num);
		--num; //num = num-1
		System.out.println(num);
		
		//# ++ -- 의 위치에 따라 실행 결과가 달라지기도 함
		int a = 3 , b = 10;
		int result= a++ *b; //;끝나고 더한다
		int result2= ++a *b; //더하고 곱함
		System.out.println(result);
		System.out.println(result2);
	}

}
