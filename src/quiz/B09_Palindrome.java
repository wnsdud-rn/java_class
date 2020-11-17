package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	//abba madam 같은 좌우대칭 단어
	// 맞으면 palindrome 아니면 not palindrome 출력
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("단어 입력 >");
		 String word = sc.nextLine();
		 
		 
		boolean is_palindrome =true;
		
			 for(int i = 0; i < word.length()/2; i++) {
				 char ch1 = word.charAt(i);
				 char ch2 = word.charAt(word.length()-1-i);
				 
				 if(ch1 != ch2) {
					 is_palindrome=false;
					 break;
				 }
				 
			 }
			 
			 if(is_palindrome) {
				 System.out.println("palindrome");
			 } else {
				 System.out.println("not palindrome");
			 }
			
		 

	}

}
