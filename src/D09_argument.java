
public class D09_argument {

	public static void main(String[] args) {
		//Eclipse에서 argument테스트하기
		
		//1.해당 파일 우클릭
		//2.Run and Debug ->edit
		//해당 class의 properties에 run/debug Settings - edit - argument - program arguments에 넣은게 실행된다
		System.out.println("받은 실행 옵션 : "+args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+"번째 프로그램 실행 옵션 :"+args[i]);
		}
		
	}
}
