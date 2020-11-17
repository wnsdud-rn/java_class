package crypto;

import java.util.Scanner;

public class CryptoMain {
	
	String original;
	int key;
	
	
	public CryptoMain(String original,int key) {
		this.original = original;
		this.key = key;
	}
	
	public String enco(int method) {
		StringBuilder sb = new StringBuilder();
		
		if(method==1) {
			CaesarCipher c1 = new CaesarCipher(key);
			System.out.print("암호화된 메세지 >");
			sb.append(c1.encryption(original));
		} else if(method==2) {
			TranspositionCipher t1 = new TranspositionCipher(key);
			System.out.println("암호화된 메세지 >");
			sb.append(t1.encryption(original));
		}
		
		
		return sb.toString();
		
	}
	
	public String deco(int method) {
		StringBuilder sb = new StringBuilder();
		
		if(method==1) {
			CaesarCipher c1 = new CaesarCipher(key);
			System.out.println("복호화된 메세지 >");
			sb.append(c1.decryption(original));
		} else if(method==2) {
			TranspositionCipher t1 = new TranspositionCipher(key);
			System.out.println("복호화된 메세지 >");
			sb.append(t1.decryption(original));
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// 사용자가 메세지와 키값을 입력하고 원하는 암호 알고리즘으로
		// 암호화 / 복호화 작업을 할 수 있는 프로그램을 만들어보세요
		Scanner sc = new Scanner(System.in);
		System.out.print("메세지 입력 :");
		String original = sc.nextLine();
		System.out.print("키값 입력 :");
		int key = sc.nextInt();
		
		System.out.print("원하는 작업 선택 : 1.암호화 2.복호화 >");
		int ende = sc.nextInt();
		System.out.print("원하는 암호 알고리즘 선택 : 1.시저 암호 2.전치 암호 >");
		int method = sc.nextInt();
		
		
		if(ende ==1) {
			String e1 = new CryptoMain(original,key).enco(method);
			System.out.println(e1);
		}else if(ende==2) {
			String e2 = new CryptoMain(original,key).deco(method);
			System.out.println(e2);
		}
		
		
		
	}
}
