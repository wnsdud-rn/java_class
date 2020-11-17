package quiz;

import java.util.Scanner;

public class B10_Prime {

	//사용자로부터 숫자를 입력받으면
	//1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >");
		int num = sc.nextInt();
		
		int prime =0;
		for(int i=2; i<=num; i++) {
			
			for(int j=2 ;j<i; j++) {
				if(i%j==0){
					prime =1;
				}				
			}
			if(prime==0) {
				System.out.println(i);
			}
			prime=0;
				
		}
		
		
		
		//선생님 풀이
		System.out.println("숫자 > ");
		int user = sc.nextInt();
		
		for(int i=2;i<=user;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d는 소수입니다",i);
			}
			
		}
		
		
		
		
		
		
	}

}
