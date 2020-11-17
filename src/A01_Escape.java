
public class A01_Escape {

	public static void main(String[] args) {
		
		//# Escape 문자
		//	- 특수한 기능을 가진 문자
		//	- 그냥 출력하려고 하면 문제가 생기는 문자들
		//	- 앞에 \(역 슬래쉬)가 붙은 문자는 Escape 문자로 간주한다
		//	- 두 문자가 합쳐져 하나의 문자로 인식된다
		
		// \n: 줄바꿈
		System.out.println("안녕하세요! \n반갑습니다.");
		
		// \t: tab키 기능
		System.out.println("안녕하세요! \t반갑습니다.");
		System.out.println("이름\t혈액형\t최근헌헐여부");
		System.out.println("홍길동\tA형\tYES"); //줄맞춤이 가능
		
		// \\:그냥 역슬래쉬를 출력하고싶을때 사용
		System.out.println("\\");
		System.out.println("C:\\Program Files\\Java\\jdk");
		
		// \":그냥 큰따옴표를 출력하고싶을때 사용
		System.out.println("저녁은 \"지옥\"에서 먹는다");
		
		// \':그냥 작은따옴표를 출력하고싶을때 사용
		System.out.println("아침을 \'든든\'하게 먹어둬라");
		
	}

}
