import java.util.Arrays;
//교재 180p?
public class B13_Array {

	// 배열
	//	-같은 타입의 변수를 한번에 여러개 선언하는 방법
	//	-인덱스를 활용해 해당 번째의 값에 접근할 수 있다
	//	(반복문과 함께 활용하면 매우 편하다)
	//	-배열은 한번 크기가 정해지면 크기 변경 불가능
	//	-배열은 초기화가 자동으로 되어있다 int num=0 안해줘도 됨
	//		(정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null)
	public static void main(String[] args) {
		
		//변수 100개를 쉽게 만드는 방법
		int[] a = new int[100];
		
		a[0]=10;
		a[1]=55;
		//a[100]=99; //100개를 만들었으면 인덱스는 99번까지
		System.out.println(a[0]);
		
		String[] fruits = new String[10];
		System.out.println(fruits[0]); //아직 가르키고 있는 얘가 없다
		
		
		
		// # 배열을 선언하는 방법
		//	1. 타입[] 배열이름 = new 타입[배열크기];
		//	2. 타입[] 배열이름 = {값1, 값2, ...};
		//	3. 타입[] 배열이름 = new 타입[] {값1, 값2, ...};
		
		
		String[] colors = {"red","blue","green","yellow"};
		double[] scores = {9.9, 8.8, 99,'B',123.123f,30000000L}; //다 됨
		boolean[] testResults = new boolean[] {true, false, true, 1>0,1==0}; //비교 연산도 가능
		
		System.out.println(colors[0]);
		
		// # 가끔 함수중에 배열을 요구하는 함수들이 있다.
		// # Arrays.toString(arr) : 전달받은 배열을 보기 좋은 문자열로 반환 /java.util에 잇음
		String result = Arrays.toString(new int[] {1,2,3});
		System.out.println(Arrays.toString(testResults));
		
		
		// # 배열과 반복문 활용하기
		System.out.println("colors 배열의 길이 : "+colors.length);
		
		for(int index = 0; index<colors.length; index++) {
			System.out.printf("%d번째 색깔 : %s\n",index,colors[index]);
		}
		
		
		// # String을 char형 배열로 면환
		String msg = "Hello, world!";
		
		char[] msgArr = msg.toCharArray();
		
		for(int i=0;i< msg.length();i++) {
			System.out.println(msgArr[i]);
		}
		System.out.println();
		
	}

}
