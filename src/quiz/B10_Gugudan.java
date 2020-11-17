package quiz;

public class B10_Gugudan {

	// 1. 2단 : 2*1=2 2*2=4
	//    3단 : 3*1=3...
	
	//2. 2단 3단 4단
	//  2*1 3*1 4*1
	public static void main(String[] args) {
		//1.
		for(int i=2; i<=9; i++) {
			System.out.printf("%d단 : ",i);
			for(int j=1; j<=9;j++) {
				System.out.printf("%dx%d=%-2d ",i,j,i*j);
			}
			System.out.println();
		}
		
		//2.
		for(int a=2; a<=9; a++) {
			System.out.printf("%d단\t",a);
			}
		System.out.println();
			
		for(int b=1; b<=9; b++) {
			for(int c=2; c<=9; c++) {
				System.out.printf("%dx%d=%d\t",c,b,b*c);
				
			}
			System.out.println();
		}
		
		//2-선생님
		for(int gop = 0; gop <=9; gop++) {
			//줄의 시작
			for(int dan = 2;dan<=9;dan++) {
				if(gop==0) {
					System.out.printf("%d단\t",dan);
				}else {
					System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
			}
			System.out.println();
		}
			
		
		
		

	}

}
