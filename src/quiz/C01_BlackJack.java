package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_BlackJack {

	// # 블랙잭을 만들자
	
	// 게임순서
	//1.딜러가(컴) 카드를 뽑는다
	//  (컴은 뽑은 카드 합이 16이하면 무조건 뽑고 17이상이면 무조건 멈춤)
	//2.사용자는 카드를 더 뽑을지 멈출지 결정
	//3.사용자가 멈추면 승패 출력
	//4.컴퓨터보다 합이 높거나 정확하게 21이면 승리
	//  컴퓨터 보다 합이 낮거나 21이 넘으면 패배
	
	//첨엔 두장 뽑는다
	//A는 합이 21이 넘을때는 1이 21이하일때는 11이다
	//J Q K는 10에 해당
	//각 카드는 문양별로 한장씩 존재
	
	
	
	//다른 함수에서도 쓸수 있게 함수밖에 변수 선언
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;
	
	public static int[] game_index; //{0,0,0}=딜러,플레이어,덱
	public static int DEALER = 0; //요기랑 같음
	public static int PLAYER = 1;
	//public static int DECK = 2;
	
	
	
	
	// int 면 52%13 = 0-12 스페이드 , 13-25하트,...
	// "CA"-"CK" - 클로버,...
	public static int[] shuffle() {
		int[] deck = new int[52];
		
		for(int i=0; i<deck.length;i++) {
			deck[i]=i;
		}
		
		for(int i=0; i<200;i++) {
			int ran = (int)(Math.random()*51 +1);
			
			int temp = deck[0];
			deck[0]=deck[ran];
			deck[ran]=temp;
		}
		
		return deck;
	}
	
	//카드뽑는메소드
	public static void draw(int drawer) {
		switch(drawer) {
		case 0:
			dealer[game_index[0]++] = deck[game_index[2]++];
			break;
		case 1:
			player[game_index[1]++] = deck[game_index[2]++];
			break;
		}
		
	}
	
	public static String prettyCard(int card) {
		char[] shape = {'♡', '♠','♣','◇'};
		String[] value = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		int s_index = card / 13;
		
		int v_index = card % 13;
		
		return shape[s_index] + value[v_index];
	}
	
	
	
	
	
	
	public static void print_game(int mode) {
		System.out.println("DEALER : ");
		System.out.print("\t");
		for(int i=0;i<game_index[0];i++) {
			if(mode ==0 && i==0) {
				System.out.print("X ");
			} else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		if(mode ==0) {
			System.out.println();}
		else {
		System.out.printf("(%d)\n",check_value(0));}
		
		
		System.out.println("PLAYER : ");
		System.out.print("\t");
		for(int i=0;i<game_index[1];i++) {
			System.out.print(prettyCard(player[i]) + " ");
		}
		System.out.printf("(%d)\n",check_value(1));
	}
	
	
	public static int getSum(int[] values) {
		int sum = 0;
		int ace =0;
		for(int i=0; i<values.length;i++) {
			if(values[i]==0) {
				sum +=11;
				ace +=1;
			} else if(values[i]>=10) {
				sum +=10;
			} else{
				sum += values[i] +1;
			}
			
		}
		
		//A가 한개 이상 존재하면서 합이 21이 넘을때 A를 1로 변경
		while(sum >21 && ace >0) {
			sum -=10;
			ace -=1;
		}
		
		
		return sum;
	}
	
	
	
	public static int check_value(int user) {
		int[] values = new int[game_index[user]];
		
		for(int i=0;i< values.length;i++) {
			values[i] = user == 0 ? dealer[i] % 13 : player[i] % 13;
		}
		
		return getSum(values);
	}
	
	
	
	
	
	
	
	
	public static int game_start() {
		//순서를 섞은 덱을 하나 생성한다
		deck = shuffle();
		
		//진행에 필요한 변수들 초기화
		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];
		
		
		//만들어진 덱으로 게임을 진행한다
		//System.out.println(Arrays.toString(deck)); 요건 만들어진 덱
		
		//카드뽑기를 구현해야함
		draw(0); //딜러 =0
		draw(0);
		draw(1); //플레이어=1
		draw(1);
		
		//System.out.println("딜러 : "+Arrays.toString(dealer));
		//System.out.println("플레이어 : "+Arrays.toString(player));
		
		Scanner console = new Scanner(System.in);
		// # 플레이어의 선택
		int player_value ;
		while((player_value=check_value(1))<21) {
			//# 게임 정보 출력
			print_game(0);
			
			System.out.print("1.hit\t2.stand\n>> "); //여기 바로 옆에 나오게 수정
			int select = console.nextInt();
			
			if(select ==2) {
				break;
			}else if(select ==1) {
				draw(1);
			}
		}
		
		//딜러가 마저 뽑고 모든 정보를 출력한 후 결과를 리턴
		print_game(1);
		int dealer_value;
		
		
		while((dealer_value = check_value(0))<=16) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			draw(0);
			print_game(1);
			dealer_value = check_value(0);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//결과를 산출
		return check_game(dealer_value,player_value);
		
	}
	
	public static int check_game(int d, int p) {
		if(d>21 && p>21) {
			return 0;
		} else if(d==p) {
			return 0;
		} else if(p<=21 && d>21) {
			return p==21 ? 2:1;
		} else if(p<=21 && p>d) {
			return p==21 ? 2:1;
		} else {
			return -1;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		int player_money =10000;
		
		while(player_money>0) {
		int betting =5000;
		player_money -=betting;
		
		int game_result = game_start(); //게임을 하고 나오면 결과가 나옴
		
		System.out.println("=================================");
		StringBuilder msg = new StringBuilder("게임결과 : ");
		
		
		
		switch (game_result) {
		case 1:
			player_money += betting*2;
			msg.append("승리\n");
			break;
		case 2:
			player_money +=(int)(betting*2.5);
			msg.append("21로 승리\n");
			break;
		case 0:
			player_money += betting;
			msg.append("무승부\n");
			break;
		default:
			msg.append("패배\n");
			break;
			
		}
		
		msg.append("현재 잔액 : "+player_money+"원\n");
		System.out.print(msg);
		System.out.println("=================================");
		}
		
		
		
		
		

	}

}
