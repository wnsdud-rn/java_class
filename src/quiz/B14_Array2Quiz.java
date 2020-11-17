package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = {
				{10,10,10,10},
				{90,50,30,70},
				{800,500},
				{300,300,300}
		};
		
		// 1. numArr의 총합과 평균(소수점 둘째자리)을 구해서 출력해보세요
		
		// 2. numArr의 각 행의 합과 열의 합을 모두 구해서 출력
		// 0행의 합 : 10+10+10+10
		
		/* 열 부분이 안됨
		int total =0;
		int l=0;
		int sum_w=0, sum_h=0; //w-가로 h-세로
		
		for(int i=0;i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length;j++) {
				total +=numArr[i][j];
				l++;
			}
		}
		System.out.println("numArr의 총합은 "+total);
		System.out.printf("numArr의 평균은 %.2f",(float)total/(float)l);
		
		System.out.println();
		for(int i=0;i<numArr.length;i++) {
			System.out.printf("%d행의 합 : ",i);
			for(int j=0;j<numArr[i].length;j++) {
				sum_w	+= numArr[i][j];
				
				
			}
			System.out.println(sum_w);
			sum_w=0;
		}
		
		System.out.println();
		for(int i=0;i<numArr.length;i++) {
			System.out.printf("%d열의 합 : ",i);
			for(int j=0;j<numArr[i].length;j++) {
				
				if(numArr.length <= j) {
					continue;
				}
					sum_h	+= numArr[j][i];
				
				
				
			}
			System.out.println(sum_h);
			sum_h=0;
		}*/
		
		
		
		//선생님 풀이
		int sum =0;
		int item_count=0;
		
		//총합과 평균
		for(int i=0;i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length;j++) {
				sum +=numArr[i][j];
				item_count++;
			}
		}
		System.out.println("numArr의 총합은 "+sum);
		System.out.printf("numArr의 평균은 %.2f\n",sum/(double)item_count);
		
		//행열의 값
		int[] rowSum= new int[numArr.length];
		int[] colSum= new int[4];
		
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];
			}
		}
		System.out.println("행의 합: "+Arrays.toString(rowSum));
		System.out.println("열의 합: "+Arrays.toString(colSum));
		
		
		
		
		
		/*이거 참고해서 위에 열 풀어보기?
		int[] colSum = new int[4];
		
		for(int i=0;i<numArr.length;i++) {
			System.out.printf("%d열의 합 : ",i);
			for(int j=0;j<numArr[i].length;j++) {
				if(!(j<numArr[i].length)) {
					colSum[j] += numArr[i][j];
				}
				
			}*/
			
		
		

	}

}
