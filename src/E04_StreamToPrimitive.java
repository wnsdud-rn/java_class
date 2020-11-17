import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class E04_StreamToPrimitive {

	// # Stream의 데이터를 기본형으로 변환하기
	//	- DataInputStream/DataOutputStream을 사용한다
	//	- 기본타입을 이용해 입/출력을 편하게 구현할 수 있다
	
	public static void main(String[] args) {
		try {
			DataOutputStream dout = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("D:\\java_io\\dataout.txt"),2048));
			// 데이터를 int or byte[]문으로의 변환이 필요없다
			dout.writeInt(123);
			dout.writeBoolean(true);
			dout.writeFloat(123.123f);
			dout.writeDouble(123.123);
			dout.writeLong(1234567L);
			dout.writeUTF("한글입니다");
			
			dout.close();
			System.out.println("파일 출력 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			DataInputStream din = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("D:\\java_io\\dataout.txt")));
			
			//썻던 순서를 잘 기억해서 순서대로 꺼내야 한다
			int data1  = din.readInt();
			boolean data2  = din.readBoolean();
			float data3 = din.readFloat();
			double data4 = din.readDouble();
			long data5 = din.readLong();
			String data6 = din.readUTF();
			
			System.out.println("data 1 :"+data1);
			System.out.println("data 2 :"+data2);
			System.out.println("data 3 :"+data3);
			System.out.println("data 4 :"+data4);
			System.out.println("data 5 :"+data5);
			System.out.println("data 6 :"+data6);
			
			din.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
