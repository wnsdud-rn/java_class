
public class B09_for {

	public static void main(String[] args) {
		// # 반복문
		//	- for, while, do-while(x), for each
		//	- 똑같은 코드를 여러번 반복하고 싶을때 사용한다
		
		/*
		  for(초기값; 조건; 증가값){
		  	가운데 조건이 true인 동안 반복한 명령어를 적는 곳
		  }
		 
		  */
		
		// 1. 가장 기본적인 형태
		//	- 초기값은 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다
		//	증가는 1씩 함
		for(int i=0 ; i<10 ; i++)
		System.out.println("Hello, world!");
		
		// 2. 초기값과 증가값의 수치는 마음대로 변경할 수 있다
		for (int i=10; i<33; i+=2) {
			System.out.println("Hello"+i);
		}
		
		for (int i=9000; i> 0; i-=100) {
			System.out.println("Minus"+i);
		}
		
		// 3. 초기값과 증가값의 위치를 마음대로 변경할 수 있다
		int num=0;
		for(;num<100;) {
			System.out.println("마음대로"+num);
			++num;
		}
		
		// 4. 내부에 다른 문법도 자유롭게 사용가능
		for(int month=1;month <= 12; month++) {
			switch(month) {
			case 3: case 4: case 5:
				System.out.println("입력하신 달의 계절은 '봄' 입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("입력하신 달의 계절은 '여름' 입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("입력하신 달의 계절은 '가을' 입니다.");
				break;
			case 12: case 1: case 2:
				System.out.println("입력하신 달의 계절은 '겨울' 입니다.");
				break;
			}

		}
		
		// 5. 조건을 비워놓으면 무한반복 한다
		//	(조건에 true를 넣어도 무한반복 한다)
		//	※ break를 이용해 반복문을 탈출할 수 있다
		num =0;
		for(;;) {
			System.out.println(num);
			num++;
			if (num > 2)
			break;
		}

		
		// 6. continue를 이용하면 반복문을 스킵할 수 있다
		for(int i=0;i< 100; ++i) {
			System.out.printf("%-3d",i);
			
			if(i%10!=9)
				continue; //여기서 밑으로 안내려가고 다시 올라감 <조건없이 continue만 있으면 밑으로 못내려감>
			
			System.out.println();
		}
		
		// 7. 반복문으로 총합 구하기
		//	(1) 총합을 저장할 변수를 선언하고 0으로 초기화 한다
		//	(2) 반복문을 통해 해당 변수에 값을 누적시킨다
		int sum=0;
		
		for(int i=80; i<=333; i++) {
			
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
		
		
		
	}

}
