package quiz;

import java.util.Random;

public class B12_BlackJack {

	public static void main(String[] args) {
		// 다음과 같은 문자열이 있을 때, 문자열을 랜덤 순서로 섞은 후 출력
		String deck = "123456789ABCD"
				+ "123456789ABCD"
				+ "123456789ABCD"
				+ "123456789ABCD"; //문양별로 
		
		Random ran = new Random();
		
		StringBuilder new_deck = new StringBuilder();
		for(int i=0;i<deck.length();i++) {
			char ch = deck.charAt(ran.nextInt(deck.length()));
			new_deck.append(ch);
		}
		System.out.println(new_deck);
		
	}

}
