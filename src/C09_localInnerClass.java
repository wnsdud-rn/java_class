
public class C09_localInnerClass {

	// # 지역 내부 클래스
	// -메서드 내부에서도 클래스 사용이 가능하다
	// -메서드 범위를 벗어날 수 없다
	void method() {
		class Apple {
			int size;
			String color;
		}

		Apple a = new Apple();// 젤가까운 위에 있는 애플 참조함
		System.out.println(a.size);
		System.out.println(a.color);
	}

	public static void main(String[] args) {

		String a = "대구";
		String b = "빨간색";

		// 지역 내부 클래스(메서드가 끝나면 클래스도 사라지게 된다)
		class Apple {
			String addr;
			String color;

			public Apple() {
				addr = a;
				color = b;
			}
		}

		Apple apple = new Apple();
		System.out.println(apple.addr);
		System.out.println(apple.color);
	}

}
