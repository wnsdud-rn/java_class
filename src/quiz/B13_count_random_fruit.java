package quiz;

import java.util.Random;

public class B13_count_random_fruit {

	// 1. 크기 100의 배열에 랜덤 과일 문자열을 저장해보세요
	//	과일 : apple banana orange peach kiwi
	// 2. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해보세요
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		String[] fruit = {"apple", "banana", "orange", "peach", "kiwi"};
		
		String[] new_fruit = new String[100];
		
		for(int i=0; i<100;i++) {
			new_fruit[i] = fruit[(int)(Math.random()*5)];
		}
		//뉴fruit 배열에 저장되어 각 과일이 몇번 등장했는지 모두 세어보세요(여기까진 동일)
		
		/*내 풀이 
		 * int count_a = 0;int count_b = 0;int count_o = 0;int count_p = 0;int count_k = 0;
		
		for(int i=0;i<new_fruit.length;i++) {
			if(new_fruit[i]=="apple") {
				count_a +=1;
			}else if(new_fruit[i]=="banana") {
				count_b +=1;
			}
			else if(new_fruit[i]=="orange") {
				count_o +=1;
			}
			else if(new_fruit[i]=="peach") {
				count_p +=1;
			}
			else if(new_fruit[i]=="kiwi") {
				count_k +=1;
			}
			
		}
		
			
		System.out.printf("apple이 등장한 횟수 %d 번\n",count_a);
		System.out.printf("banana가 등장한 횟수 %d 번\n",count_b);
		System.out.printf("orange가 등장한 횟수 %d 번\n",count_o);
		System.out.printf("peach가 등장한 횟수 %d 번\n",count_p);
		System.out.printf("kiwi가 등장한 횟수 %d 번\n",count_k);*/
			
		
		//선생님 풀이
		int fruit_kind = fruit.length;
		int[] count = new int[5];
		
		for(int i= 0;i<100;i++) {
			
			for(int j=0;j<fruit.length;j++) {
				if(fruit[j].equals(new_fruit[i])) {
					count[j] +=1;
					break;
				}
			}
			
		}
		
		//집계가 끝난 후 count를 출력
		for(int i = 0;i<count.length;i++) {
			System.out.printf("%s\t: %d번\n",fruit[i],count[i]);
		}
		
		
		
		//번외 : 과일 하나만 보고싶다면?
		
		//#enum의시초
		int apple = 0;
		int banana = 1;
		int orange= 2;
		//미리 값을 정해놓으면 해당 이름만 가져다 쓰면되니까 편하다
		
		System.out.println("오렌지 몇번? "+ count[orange]);  
		System.out.println("오렌지 이름: "+ fruit[orange]);

	}

}
