//ctrl + =+,- 글자크기
//ctrl + m : 현재 창 크기 최대/최소화
//Ctrl + z : 방금 한일 취소하기
//Ctrl + y : Ctrl + z 를 다시 되돌림
//shift + home/end 그 줄만 선택
//shift + tab :들여쓰기 거꾸로
//ctrl+/ : 드래그한거 주석처리
//alt + 방향키 : 드래그 한 부분을 옮겨줌
//ctrl+shift+f : 코드를 깔끔하게 만들어줌
/**
문서화 주석 (이클립스가 이 설명을 읽어준다)
 */

//※ public class의 이름은 반드시 파일명(hello.java)과 같아야한다
public class A00_Hello {
//빨간줄에 커서놓고 F2를 누르면 해당에러 정보랑 해결책 보임
	
	//# main() 함수
	//	-프로그램의 시작 지점 ctrl+f11하면 main 찾아서 실행
	public static void main(String[] args) {
		
		//sysout() : ()안에 있는 데이터를 콘솔에 출력
		//이름 뒤에 ()있으면 함수 
		System.out.println("Hello, world!");
		System.out.println("Apple");
		System.out.println("Melon");
		
		System.out.println("┌───────────────────────┐");
		System.out.println();
		System.out.println("	1. Start Game");
		System.out.println("	2. Exit");
		System.out.println();
		System.out.println("└───────────────────────┘");
		
		//자바의 데이터들
		//1. ""사이에 적는 것 : 문자열(String) , 문자 여러개
		System.out.println("Hello, world!");
		
		//2. 그냥 숫자 :정수(int)
		System.out.println(123);
		System.out.println(123+3);
		
		//3. 소수 : 실수 (Double, Float)
		System.out.println(123.1234);  //안붙이면  double
		System.out.println(123.1234f); //f 붙이면 float
		
		//4. ''사이에 적는 것 : 문자(Character), 문자 단 하나
		//작은따옴표엔 여러개 넣으면 에러
		System.out.println('ㅁ');
		System.out.println('o');
		
		
		//# 문자가 실제로 가지고 있는 숫자값 보기
		System.out.println("가의 코드값:"+(int)'가');
		//# 코드값으로 문자 출력하기
		System.out.println("44032의 코드값:"+(char)44032);
		
		
		
		
		//※ 다른 타입 + 정수가 가능하다
		//1. 문자열 + 정수는 이어붙인다
		System.out.println("123"+456); //그냥 이어붙임
		System.out.println("문자열 :"+456);
		
		//2. 실수 + 정수는 실수가 된다
		System.out.println(1234.56 + 456);
		
		//3. 문자 + 정수는 ???
		System.out.println('아'+12);
		
		
	}

	
}
