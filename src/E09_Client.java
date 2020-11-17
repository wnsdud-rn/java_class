import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class E09_Client {

	public static void main(String[] args) {
		//E08에 접속하는 프로그램
		
		
		try {
			Socket s = new Socket("localhost",3456); //localhost부분에 접속하고싶은 ip주소 입력
			System.out.println("연결에 성공했습니다.");
			
			PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			//System.out.println("Enter를 누르면 서버로 메세지를 전송합니다");
			//new Scanner(System.in).nextLine();
			out.println("[Client] Hello!");
			out.close();
			s.close();
			System.out.println("메세지를 성공적으로 전송");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
