import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;



public class E03_StreamToChar {

	// # Reader / Writer가 붙은 클래스들은
	//	 Stream으로 읽은 데이터를 문자로 변환하는 클래스들이다
	
	// # 프로그래머가 데이터를 문자로 편하게 다루고 싶을 때
	// InputStream/OutputStream을 Reader/Writer클래스로 한번 더 감싸서 사용한다
	
	public static void main(String[] args) {
		
		// # abstract class Reader
		//	- Reader를 상속받아 구현한 클래스들
		//	- BufferedReader, InputStreamReader, FileReader 등등..
		//	- Stream으로 얻은 데이터를 문자로 재구성하여 프로그래머에게 제공한다
		//	- 코드 데이터를 문자로 재구성할시 사용할 charset을 알맞게 설정하지 않으면 글자가 깨진다
		
		try {
			FileReader fr = new FileReader("D:\\java_io\\bufferedout.txt",Charset.forName("UTF-8"));
			
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			java.io.InputStreamReader ir = new java.io.InputStreamReader(fin,"UTF-8");
			
			
			
			//FileReader를 BufferedReader로 업그레이드
			BufferedReader br = new BufferedReader(fr);
			
			//Reader 클래스의 read는 다음 byte가 아니라, 다음 char를 읽는다
			int ch;
			while((ch = br.read()) != -1) {
				System.out.print((char)ch);
			}
			
			fr.close();
			br.close();
			ir.close();
			fin.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		// # abstract class Writer
		//	- 파일에 문자를 저장할 때 charset을 지정할 수 있다
		//	- 프로그래머가 좀 더 편리하게 OutputStream을 이용할 수 있다
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			//outputstream 방식에서 writer 로 변환(byte->char)
			OutputStreamWriter ow = new OutputStreamWriter(fout,"UTF-8");
			
			//outputstream을 writer로 변환하는 과정을 생략하는 클래스 = > 위에 두개 말고 바로 이걸로 시작
			FileWriter fw = new FileWriter("D:\\java_io\\bufferedout.txt",Charset.forName("UTF-8"));
			
			//buffered : 성능 향상
			BufferedWriter bw = new BufferedWriter(ow,4096);
			
			//print: 프로그래머에게 편리한 print메서드들을 이용할수있음
			PrintWriter pw = new PrintWriter(ow);
			
			//콘솔에 출력하던것을 파일에 출력할 수 있다
			for(int i=0;i<10000;i++) {
				pw.printf("[%d/%d %d:%d] - 안녕하세요 반갑습니다\n",1,2,3,4);
			}
			
			pw.close();
			bw.close();
			ow.close();
			fout.close();
			System.out.println("출력끝");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
}
