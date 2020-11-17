package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	// 1.최소값과 최대값을 매개면수로 받으면, 그 사이의 모든 값을 포함하는 int배열을 생성해서 반환하는 range함수
	//	(최소값 이상, 최대값 미만)
	
	//2. 최대값을 매개변수로 전달 받으면, 0부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는 range2 함수를 만들어보세요
	
	//3. 문자열 배열을 전달 받으면, 해당 배열에 모두/를 이어붙이는 join함수를 만들어보세요
	//	ex: {"apple","banana","orange"}
	//    -> "apple/banana/orange
	
	//4. 문자열 타입의 숫자(num), 원래진법(base_from), 바꾸려는 진법(base_to)를 전달받으면
	//	base from의 진법이었던 num을 base to진법의 문자열로 변환하여 반환하는 함수를 만들어보세요
	//  ※ 만약, 진법이 잘못된 경우 null을 반환합니다.
	// 	  변환할 수 있는 최대 진법은 36 진법이고, 최소 진법은 2입니다. 
	
	
	//1.
	public static int[] range(int min, int max) { // 2 5 = 234  012 3개
		
		int[] total = new int[max-min];
		
		for(int i=0; i< total.length; i++) {
				total[i]=min;
				min++;
				//혹은 total[i]=min+i;
		}
		return total;
	}
	
	//2.
	public static int[] range(int max) {
		int[] all = new int[max];
		
		for(int i=0; i< max; i++) {
				all[i]=i;
		}
		return all;
	}
	
	
	//3.
	/*public static StringBuilder join(String[] fruits) {
		StringBuilder a = new StringBuilder();
		
		for(int i=0;i<fruits.length;i++) {
			if(i==fruits.length-1) {
				a.append(fruits[i]);
			}else {
				a.append(fruits[i]+"/");
			}
		}
		
		return a;
	}*/
	
	//선생님 풀이
	public static String join(String[] fruits,String sep) {//sep로 나누는 문자를 직접 지정
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<fruits.length;i++) {
			if(i==fruits.length-1) {
				result.append(fruits[i]);
			}else {
				result.append(fruits[i]+sep);
			}
		}
		return result.toString();
	}
	
	
	
	
	
	
	//4.
	public static char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static char getSymbol(int value) {
		return digits[value];
	}
	
	
	public static int getValue(char digit) {
		for(int i=0;i<digits.length;i++) {
			if(digits[i]==digit) {
				return i;
			}
		}
		return -1; //36진법을 넘었으니 값이 없다
	}
	
	
	
	public static String convert_base(String num,int base_from,int base_to) { //숫자 .숫자의 진법. 바꿀진법
		num = num.toUpperCase();
		
		if(base_from < 2 || base_from > 36 || base_to < 2 || base_to > 36) {
			System.err.println("RadixError : 사용가능한 진법은 2부터 36입니다");
			return null;
		}
		
		
		int pow = num.length()-1;
		long real_value =0;
		
		
		for(int i=pow;i>-1;i--) {
			char digit = num.charAt(pow-i);
			int value = getValue(digit);
			
			//8진법인데 8이상의 숫자가 있으면 에서
			if(value >=base_from) {
				System.err.println("base_from 이상의 문자열이 있습니다.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("\t실제 값: "+value);
			System.out.println("\t"+Math.pow(base_from, i)+"의 자리");
			
			real_value +=value*Math.pow(base_from, i);
		}
		
		
		System.out.println("문자열 \""+num+"\"의 값은 실제로 "+real_value+"입니다.");
		
		StringBuilder result = new StringBuilder();
		while(real_value>0) {
			result.append(getSymbol((int)(real_value%base_to)));
			real_value /=base_to;
		}
		
		return result.reverse().toString();
	}
	
	
	
	
	
	public static void main(String[] args) {
		//1.
		int[] total = range(1,5);
		System.out.println(Arrays.toString(total));
		
		
		//2.
		/*이건 range2로 이름이 다른 함수로 만들때 밑엔 같은이름으로...
		int[] total2 =range2(5);
		System.out.println(Arrays.toString(total2));*/
		
		// # 함수의 오버로딩
		// -같은 함수 이름으로 다양한 형태의 함수를 정의할 수 있다
		// -다른 형태의 함수로 인정받기 위해서는 매개변수의 개수 혹은 타입이 달라야한다 
		//		(예: int min만 있는건 갯수와 타입겹쳐 안됨/ char min은 갯수는같으나 타입이 다르니 ok)
		System.out.println(Arrays.toString(range(33,36)));
		System.out.println(Arrays.toString(range(10)));
		//#println은 다양한 매개변수 타입을 받을 수 있도록 오버로딩 되어있다.
		
		
		
		//3.
		System.out.println("----------------------------");
		String[] fruits = {"apple","banana","orange"};
		//System.out.println(join(fruits)); 이건 내코드용
		System.out.println(join(fruits,"/"));
		
		//4.
		System.out.println("----------------------------");
		System.out.println(convert_base("123",10,2));
		System.out.println(convert_base("abcdef",16,32));
		System.out.println(convert_base("123456",10,10));
		

	}

}
