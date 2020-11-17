
public class B03_typeCasting {

	public static void main(String[] args) {
		
		// # 타입 캐스팅
		//	- 타입이 자연스럽게 변하는 경우 (문제가 생길 위험이 없을 때)
		//	- 타입을 강제로 변환시키는 경우 (위험할 때)
		
		// # 타입의 크기
		//	정수 타입: byte(1) < char, short(2) < int(4) < long(8)
		//	실수 타입: float(4) < double(8) 
		
		byte _byte = 10;
		int _int = 20_0000_0000; //숫자 리터럴은 _를 통해 자릿수 표현이 가능하다
		
		// 1. 자연스러운 타입캐스팅
		_int = _byte;
		System.out.println(_int);
		
		// 2. 값이 손상될 수도 있는 타입캐스팅
		// 컴파일러가 경고를 한다
		_int = 2000000001;
		_byte = (byte)_int; //앞에 (byte)붙여주면 빨간줄 없어짐<틀려도 나 바꿀꺼임!>
		System.out.println(_byte); // 그럼 byte의 범위를 돌고 돌아서 1만 나옴
		
		//3. 정수 타입은 더 작은 크기의 실수 타입에도 들어갈 수 있다
		long _long = 200000000000L;
		float _float = _long;
		System.out.println(_float);
		
		_float = 12.123f;
		_long = (long)_float; //소수점 아래가 사라질 수 잇어서 경고
		System.out.println(_long);
		
		// 4. 같은 값이더라도 다르게 해석될 수 있는 타입의 경우에
		//	  타입 캐스팅이 필요하다
		int a = 70;
		System.out.println("a : "+a);
		System.out.println("(char) a : "+(char)a);
		System.out.println("(char) 70 : "+(char)70);
		System.out.println("(int)'F' : "+(int)'F');
		System.out.println("(int)'あ' : "+(int)'あ');
		
		// 같은 70이더라도 어떤 타입이냐에 따라서 해석 방식이 달라진다
		// char타입이라면 문자표(charset)에 따라 해석하게 되고
		// int타입이라면 그대로 숫자로 받아들인다
		
		// ※ 코드표는 외울 필요 없음
		
		// # char타입은 문자코드를 저장하기 편하도록
		//   2byte 양수만 저장하도록 설계되어 있다
		
		// # char타입은 실제로 정수값을 지니고 있기 때문에
		//   연산이 가능하다.
		System.out.println('K'-'A');
		System.out.println((char)('A'+10));
		System.out.println("알파벳은 모두 몇 개? :"+(('Z'-'A')+1)+"개");

	}

}
