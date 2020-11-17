package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	// 1부터 45 사이의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성
	
	public static void main(String[] args) {
		//Random ran = new Random();
		//이건 중복이 나옴
		/*int[] num = new int[6];
		
		for(int i=0;i<num.length;i++) {
			num[i] = ran.nextInt(45)+1;
			
			System.out.println(num[i]);
		}*/
		
		
		
		//선생님풀이
		int i=0;
		int[] lotto = new int[6];
		while(i !=6) {
			boolean duple =false;
			lotto[i]=(int)(Math.random()*45+1);
			
			//똑같은 값이 있으면 i증가하지 않음
			for(int j=0;j < i;j++) {
				if(lotto[i]==lotto[j]) {
					duple =true;
					break;
				}
			}
			if(!duple) {//중복이 아닐때 i 증가
				i++;
			}
			
		}
		System.out.println(Arrays.toString(lotto));
		
		//배열 순서 섞는건 사진 참조
		
	}

}
