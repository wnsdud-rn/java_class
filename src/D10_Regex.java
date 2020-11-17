import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	// # 정규표현식(Regular Expression)
	//	- 문자열의 패턴을 표현하는 방식
	//	- 해당 패턴과 일치하는 문자열을 검색할 수 있다
	
	// # Pattern 클래스
	//	-정규표현식을 다루는 클래스
	
	// # Matcher 클래스
	//	-패턴을 이용하여 대상 문자열을 검색할 때  사용하는 클래스
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		//[]: 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의한다
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		
		// # [] 내부에 정의할 수 있는것들
		//1. abc : a or b or c
		//2. ^abc: abc제외한 모두를 허용
		//3. a-z : a부터z까지 허용
		//4. && :교집합 a-d && c-f 는 교집합으로 cd밖에 안됨 (잘 안쓴다)
		
		// # 여러 문자를 간단하게 표현하는것들
		//1. .  : 모든것을 허용  ※[]밖에 써야한다!!!!
		//2. \d :해당 자리에 숫자들을 허용
		//3. \D :해당 자리에 숫자를 제외한 모든것을 허용
		//4. \s :해당 자리에 공백을 허용 [\t \n \r... 등의 모든 공백들]
		//5. \S :해당 자리에 공백을 제외한 모든것을 허용
		//6. \w :일반적인 문자들을 허용 [a-zA-Z_0-9]
		//7. \W :일반적인 문자들을 제외한 모든것을 허용
		System.out.println(Pattern.matches("s.eep", "sleep"));
		System.out.println(Pattern.matches("s\\deep", "s1eep"));
		
		//#해당 패턴이 적용될 문자의 개수를 정의하는 방법
		//	1. Ex{n} : 앞에 있는 패턴이 n글자 일치해야한다
		//	2. Ex{n, m} : 앞에 있는 패턴이 최소n글자 최대m글자 일치해야 함
		//  3. Ex{n, } : 앞에 있는 패턴이 최소n글자 이상 일치해야 함 
		//  4. Ex? : 0번 혹은 단1번
		//  5. Ex+ : 최소 1번 이상
		//	6. Ex* : 0번 혹은 여러번
		System.out.println(Pattern.matches("....[\\d]{4}", "s1ee1234"));
		System.out.println(Pattern.matches("[\\w가-힣]{2,12}", "segsgsd"));
		//?
		System.out.println(Pattern.matches("[@]?.*", "@6654"));
		
		
		String email = "abc@gmail.com";
		System.out.println("이메일 패턴 : "+ Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-z.]+", email));
		
		
		// # Pattern.matches(regex,str)
		//	- 전달한 문자열이 정규표현식과 일치하면 true
		
		// # Pattern.compile(regex)
		//	- 전달한 정규표현식을 이용해 생성한 인스턴스를 반환한다
		Pattern split_regex = Pattern.compile("/");
		
		// # 생성된 Pattern 인스턴스로 split하기
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # 생성된 Pattern 인스턴스로 matcher 생성하기
		
		// # java.util.regex.Matcher
		//	- 문자열을 처음부터 끝까지 검사하면서 해당 정규표현식과 일치하는 인덱스를 찾은 결과
		
		Pattern fruit_regex = Pattern.compile("[a-zA-z[^/]]+");//이 정규표현식으로
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");//여기서 찾음
		
		//find : 정규표현식을 통해 찾은 것이 있으면 true
		while(matcher.find()) {
			System.out.println("찾은 것 : " +matcher.group());
			System.out.println(matcher.start()+"to"+matcher.end());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String str = "abc@naver.com";
		 * 
		 * if(str.contains("@") && str.contains(".")) { System.out.println("이메일"); }else
		 * { System.out.println("이메일 아님"); }
		 */
		
//		int indexOfAt = str.indexOf('@');
//		System.out.println(indexOfAt);
		
	}
}
