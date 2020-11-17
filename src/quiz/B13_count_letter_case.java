package quiz;

public class B13_count_letter_case {

	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 문자가 몇번 등장 했는지 세어서 출력해보세요
	// (대문자 소문자 숫자)
	public static void main(String[] args) {
		String msg = "The Rain In Spain Stays Mainly In The Plane123";
		
		int[] count_u = new int[26];
		int[] count_l = new int[26];
		int[] count_num = new int[10];
		
		
		for(int i=0;i<msg.length();i++) {
			char ch = msg.charAt(i);
			
			if(ch>='a'&&ch<='z') {
				count_l[ch-'a'] +=1;
			}
			if(ch>='A'&&ch<='Z') {
				count_u[ch-'A'] +=1;
			}
			if(ch>='0'&&ch<='9') {
				count_num[ch-'0'] +=1;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(count_l[i]>0) {
				System.out.printf("%c가 등장한 횟수 %d 번\n",i+'a',count_l[i]);
			}else if(count_u[i]>0) {
				System.out.printf("%c가 등장한 횟수 %d 번\n",i+'A',count_u[i]);
			}
		}
		
		for(int i=0;i<10;i++) {
			if(count_num[i]>0) {
				System.out.printf("%d가 등장한 횟수 %d 번\n",i,count_num[i]);
			}
		}

	}

}
