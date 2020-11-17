import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_BufferedIO {
	
	// # Buffered I/O
	//	- 버퍼를 이용해 읽기/쓰기 성능을 향상시키는 클래스
	//	- 버퍼란? 데이터를 입/출력하기 전에 임시로 저장해두는 배열
	
	// # 버퍼를 이용해야하는 이유
	//	- 버퍼없이 읽기/쓰기를 하게되면 입출력이 너무 자주 일어난다
	
	//ex> java programming을 쓰는경우
	//	- 기본 out put stream으로 한글자씩 쓰면 16번의 출력이 발생한다
	//	- 배열에 저장해놓고 한번에 쓰면 1번의 출력만으로 출력이 끝남
	
	public static void main(String[] args) {
		
		//java.io.BufferedOutputStream =>이게 더 성능 좋음
		//	-생성자에 OutputStream를 요구한다
		//	-OutputStream은 출력할 장소를 선택하는 용도로 사용
		//	-BufferedOutputStream은 성능 업그레이드의 용도로 사용
		
		StringBuilder text = new StringBuilder();
		for(int i=0; i<100000; i++) {
			text.append(i+"ABCDEFG\n");
		}
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			//버퍼의 크기가 1024인 경우 =>1024바이트의 데이터가 가득 찼을때 내보내겠다, close나 flush도 출력한다
			BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
			
			//batch processing(일괄처리)
			byte[] data = new String(text).getBytes();
			for(byte b : data) {
				bout.write(b);
			}
			
			//여러개의 추가 outputstream을 사용하는경우
			//가장 나중에 열었던 순서대로 닫는다
			bout.close();
			fout.close();
			
			System.out.println("파일 출력 끝");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾음");
		}catch (IOException e) {
			System.out.println("쓰기/닫기 도중 뭔가 발생한 에러");
		}
		
		
		// # java.io.BufferedInputStream
		//	- InputStream을 생성자로 요구한다
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin,1024);
			
			// # read()의 기본 오버로딩
			//	-한 바이트를 int값으로 읽어온다
			
			// # read(byte[]) 오버로딩
			//	-전달한 byte[]의 크기만큼 byte채워준다
			//	-전달한 배열중에 몇 byte를 채웠는지 반환한다(len)
			
			// # read(byte[],off,len)
			//	-전달한 byte[]중에서 off부터 len 까지만 데이터를 채워준다
			//	-전달한 배열에 몇 byte를 채웠는지 반환한다
			
			/*
			 * byte[] buff = new byte[1024];
			 * 
			 * int len; int count =0; while((len = bin.read(buff)) != -1) {
			 * System.out.println(new String(buff,0,len));
			 * 
			 * System.out.println(count++ + "번 읽기"); }
			 */
			
			int b;
			while((b = bin.read()) !=-1) {
				System.out.print((char)b);
			}
			
			bin.close();
			fin.close();
		}  catch (FileNotFoundException e) {
			System.out.println("파일을 못찾음");
		}catch (IOException e) {
			System.out.println("쓰기/닫기 도중 뭔가 발생한 에러");
		}
		
		
		
		
		
		
	}

}
