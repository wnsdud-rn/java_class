package myobj.boardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FiveDice {

	private Random ran;
	private List<Integer> dices; // 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts; // 각 숫자가 몇번씩 등장했는지 세어 볼 리스트
	
	private String made;

	private static int NUM_OF_DICE = 5;
	private static int DICE_FACE = 6;

	private final static Set<Set<Integer>> LARGE_CASES;
	private final static Set<Set<Integer>> SMALL_CASES;

	static {
		LARGE_CASES = new HashSet<>();

		for (int i = 1; i <= 2; i++) {
			Set<Integer> large = new HashSet<>(5);
			Collections.addAll(large, i, i + 1, i + 2, i + 3, i + 4);// 1234 2345 3456
			LARGE_CASES.add(large);
		}

		SMALL_CASES = new HashSet<>();

		for (int i = 1; i <= 3; i++) {
			Set<Integer> small = new HashSet<>(4);
			Collections.addAll(small, i, i + 1, i + 2, i + 3);// 1234 2345 3456
			SMALL_CASES.add(small);
		}
	}

	public FiveDice() {
		ran = new Random();
		made = "UNCHECKED";

		// 주사위는 5개 이상으로 늘어나지 않기때문에 컬렉션 용량을 5로 설정
		// ※ ArrayList는 초기 용량이 가득 차게되면 용량을 1.5배씩 증가시킨다
		dices = new ArrayList<>(NUM_OF_DICE);
		counts = new ArrayList<>(DICE_FACE);

		Collections.addAll(dices, 0, 0, 0, 0, 0); // 5개 초기화
		Collections.addAll(counts, 0, 0, 0, 0, 0, 0);
	}

	private void count() {
		for (int i = 0; i < DICE_FACE; i++) {
			int dice_num = i + 1;

			counts.set(i, Collections.frequency(dices, dice_num));
		}

	}

	private String check() {
		// check by count
		if (counts.contains(5)) {
			return "FIVE DICE!!!";
		} else if (counts.contains(4)) {
			return "FOUR DICE!!!";
		} else if (counts.contains(2) || counts.contains(3)) {
			return "FULL HOUSE!!!";
		}

		// check by dice
		for (Set<Integer> ls : LARGE_CASES) {
			if(dices.containsAll(ls)) {
				return "LARGE STRAIGHT!!!";
			}
		}
		
		for (Set<Integer> ss : SMALL_CASES) {
			if(dices.containsAll(ss)) {
				return "SMALL STRAIGHT!!!";
			}
		}
		

		return "NO MATCHES";
	}

	
	public void print() {
		System.out.print(dices + " : ");
		
		if(made.equals("UNCHECKED")) {
			made = check();
		}
		// System.out.println("각 숫자 등장 횟수 :"+counts);
		System.out.println(made);
	}
	
	public void roll() {
		made = "UNCHECKED";
		for (int i = 0; i < NUM_OF_DICE; i++) {
			dices.set(i, ran.nextInt(DICE_FACE) + 1);
		}
		count();
		print();
	}
	
	public void reroll(Set<Integer> rerolls) {
		if(rerolls.size()==0) {
			System.out.println("NOTHING CHANGES");
			return;
		}
		
		made = "UNCHECKED";
		
		for(int i : rerolls) {
			int to_change = ran.nextInt(DICE_FACE)+1;
			dices.set(i-1, to_change);
			System.out.printf("DICE %d HAS CHANGED : %d\n",i,to_change);
		}
		count();
		print();
	}
	
	

	public static void main(String[] args) {
			
		FiveDice dice01 = new FiveDice();

		dice01.roll();
		
		
		
	}
}
