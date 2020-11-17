package quiz;

import java.util.Scanner;

public class C12_inputRightThing_t {

	public static int input(String msg) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(msg);
			
			try {
			return sc.nextInt();
			}catch (Exception e) {
				System.err.println("숫자만 입력해주세요!");
				sc.nextLine();//이걸로 비워줌
			}
		}
	}
	
	
	public static void main(String[] args) {
		int value = input("반드시 숫자만 입력 >");
		System.out.println("입력받은 숫자 "+value);
	}
	
}
