package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// # 31게임
	// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택 (1,2,3)
	// 2. 컴퓨터는 랜덤으로 숫자를 선택
	// 3. 마지막에 31이상의 숫자를 부르는 사람 혹은 컴퓨터가 패배
	
	//예:
	//컴퓨터 >2
	// 현재숫자 :2
	//사람 > 3
	// 현재숫자:5
	// ...
	// 컴퓨터 >3
	// 현재숫자 31 이상
	// 컴퓨터 패배
	
	public static void main(String[] args) {
		//내 코드
		/*
		 * Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int c_num=0,u_num=0;
		int total =0;
		
		int start =(int)ran.nextInt(2);
		
		System.out.println(start);
		
		if(start==0) {
				System.out.println("컴퓨터 시작");
				c_num =ran.nextInt(4);
				System.out.print("컴퓨터 >"+c_num+"\n");
				total +=c_num;
				System.out.println(" 현재숫자 :"+total);
			} else {
				System.out.println("사용자 시작");
				System.out.print("사용자 >");
				u_num = sc.nextInt();
				
				if(u_num>0 && u_num < 4) {
					total += u_num;
					System.out.println(" 현재숫자 :"+total);
				}else {
					System.out.print("1~3사이에 있는 수를 입력하세요 >");
					u_num = sc.nextInt();
					total += u_num;
					System.out.println(" 현재숫자 :"+total);
				}
			}	
			
		
		for(int i=1;i<=31;i++) {
			
			if(start==0) {
				System.out.print("사용자 >");
				u_num = sc.nextInt();
				if(u_num>0 && u_num < 4) {
					total += u_num;
					System.out.println(" 현재숫자 :"+total);
				}else {
					System.out.print("1~3사이에 있는 수를 입력하세요 >");
					u_num = sc.nextInt();
					total += u_num;
					System.out.println(" 현재숫자 :"+total);
				}
				
				c_num =ran.nextInt(4);
				System.out.print("컴퓨터 >"+c_num+"\n");
				total +=c_num;
				System.out.println(" 현재숫자 :"+total);
				
				if(total>=31)
					System.out.println("게임 끝");
					break;
				
			}
			
			if(start==1) {
				c_num =ran.nextInt(4);
				System.out.print("컴퓨터 >"+c_num+"\n");
				total +=c_num;
				System.out.println(" 현재숫자 :"+total);
				
				System.out.print("사용자 >");
				u_num = sc.nextInt();
				if(u_num>0 && u_num < 4) {
					total += u_num;
					System.out.println(" 현재숫자 :"+total);
				}else {
					System.out.print("1~3사이에 있는 수를 입력하세요 >");
					u_num = sc.nextInt();
					total += u_num;
					System.out.println(" 현재숫자 :"+total);
				}
				
				if(total>=31)
					System.out.println("게임 끝");
					break;
				
			}
				
		}*/
			
			
		
		
		
		//선생님 코드
		/* 이건 랜덤하게 진행
		//초기화 부분
		Scanner user = new Scanner(System.in);
		Random ran = new Random();
		
		int game_num=0;
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("%s의 선공\n",computer_turn ? "컴퓨터":"사람");
		
		while (true) {
			//입력부분
			int num;
			
			if(computer_turn) {
				
				
				num = ran.nextInt(3)+1;
				
				
				
				System.out.print("컴퓨터 >"+num+"\n");
				
			} else {
				System.out.print("사람 >");
				num = user.nextInt();
				
				if(num >3 || num<1) {
					System.out.println("\t1~3만 입력가능");
					continue;
				}
			}
			
			//System.out.println("\t방금 고른 숫자 : "+num); 잘 넣었나 확인용
			//처리부분
			game_num +=num;
			
			if(game_num>=31) {
				System.out.println("\t패배 : "+game_num);
				break;
			}
			System.out.println("\t현재 숫자 : "+game_num);
			computer_turn = !computer_turn;
			
		}
		System.out.printf("%s의 승리\n",computer_turn ? "사람": "컴퓨터");	*/
			
			
		
		//이건 컴퓨터가 선공격이면 무조건 이기는 코드
		Scanner user = new Scanner(System.in);
		Random ran = new Random();
		
		int game_num=0;
		
		boolean computer_turn = ran.nextBoolean();
		
		System.out.printf("%s의 선공\n",computer_turn ? "컴퓨터":"사람");
		
		while (true) {
			//입력부분
			int num;
			
			if(computer_turn) {
				
				//컴퓨터가 game_num을 본 후 
				//2,6,10,14,18,22,26,30을 만들면 무조건 이김
				if(game_num%4==0) {//if( gamenum== 0, ||4,|| 8
					num=2;
				} else if(game_num%4==3) {
					num = 3;
				} else if(game_num%4==1) {
					num = 1;
				} else {//여긴 어차피 짐
					num = ran.nextInt(3)+1;
				}
				
				System.out.print("컴퓨터 >"+num+"\n");
				
			} else {
				System.out.print("사람 >");
				num = user.nextInt();
				
				if(num >3 || num<1) {
					System.out.println("\t1~3만 입력가능");
					continue;
				}
			}
			
			//처리부분
			game_num +=num;
			
			if(game_num>=31) {
				System.out.println("\t패배 : "+game_num);
				break;
			}
			System.out.println("\t현재 숫자 : "+game_num);
			computer_turn = !computer_turn;
			
		}
		System.out.printf("%s의 승리\n",computer_turn ? "사람": "컴퓨터");	
			
			
			
			
			
			
			
			
			
			
		
		
		
		

	}

}
