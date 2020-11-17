package quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {
	
	public static Set<Integer> generate(){
		Random ran = new Random();
		Set<Integer> lotto = new HashSet<>();
		
		int count =0;
		//Set은 중복값을 추가하지 않기 때문에 알아서 길이가 늘어나지 않는다
		while(lotto.size()<6) {
			lotto.add(ran.nextInt(45)+1);
			System.out.println(++count + "회 뽑음");
		}
		
		return lotto;
	}

	public static void main(String[] args) {
		// 1부터 45사이의 중복 없는 랜덤 숫자로 6개 이루어진 HashSet을 생성해보세요
		
		/*내 코드 중복 가능성 있음
		 * Random ran = new Random();
		 * 
		 * HashSet<Integer> lotto = new HashSet<>();
		 * 
		 * for (int i = 0; i < 6; i++) { int num = ran.nextInt(45) + 1; lotto.add(num);
		 * }
		 * 
		 * System.out.println(lotto);
		 */
		
		System.out.println(generate());
		
	}

}
