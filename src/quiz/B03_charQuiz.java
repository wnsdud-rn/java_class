package quiz;

public class B03_charQuiz {

	/*
	 	[알맞은 조건식을 만들어보세요]
	 	
	 	1. char형 변수 a가 'q' 또는 'Q'일때 true
	 	2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	3. char형 변수 c가 문자('0' ~ '9')일 때 true
	 	4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	5. char형 변수 e가 한글일 때 true
	 	6. char형 변수 f가 일본어일 때 true
	 	
	 	
	 */
	
	
	
	
	
	public static void main(String[] args) {
		char a = 'q',
		     b = '1',
		     c = '0',
		     d = 'a',
		     e = '히',
		     f = 'ア';
		//1.
		System.out.println(a=='q' || a=='Q');
		//2.
		System.out.println(!(b==32 || b==9)); //System.out.println(!(b=='\t' || b==' '));
		//3.
		System.out.println((c>='0' && c<='9'));
		//4.
		System.out.println((d>='a' && d<='z') || (d>='A' && d<='Z'));
		//5.
		//http://www.unicode.org/charts/ 들어가서 Hangeul쳐서 더 정확히 가능
		System.out.println(e>='ㄱ' && e<='ㅎ' || e>='가' && e<='하' || e>='ㅏ' && e<='ㅣ');
		//6.
		System.out.println(f>='ぁ' && f<='ゟ' || f>='ア' && f<='ヴ');
		System.out.println(f>=0x3041&& f<=0x309F || f>=0x30A0 && f<=0x30FF);
	}

}
