
public class A02_variable {
	
	// # 변수
	//	- 데이터를 미리 담아놓고 사용할 수 있는 공간
	//	- 변수를 사용하기 위해서는 해당 변수가 어떤 타입의 데이터를 저장할지 미리 정해야 한다(선언)
	//	- 
	
	
	
	
	public static void main(String[] args) {
		//int a : 정수만 들어갈수있는 변수 a선언
		int a;
		//a라는 변수에 10을 넣어놓겠다
		// =의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣어라
		a=10;
		
		// 변수에 담아놓은 값을 자유롭게 활용가능
		System.out.println(a);
		System.out.println(a+10);
		System.out.println(a*3);
		System.out.println(a+a);
		
		//Java에서는 선언하지 않은 변수는 사용불가
		
		//# 변수를 선언하는 여러가지 방법
		int num1; //하나선언가능
		int num2,num3; //여러개 선언 가능
		int num4 =99; //선언과 값대입 동시 가능
		int num5=1, num6=2, num7=3; //여러개도 가능
		
		//값을 한번도 대입하지 않은 변수는 사용불가
		//변수를 선언한 뒤 맨 처음 값을 대입하는 것을 '초기화(initialize)'라고 부른다
		num1=123;
		System.out.println("num1:"+num1);
		System.out.println("num4:"+num4);
		System.out.println("num5:"+num5);
		
		
	}
}
