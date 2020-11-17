package myobj.machine;


public class Main {
	public static void main(String[] args) {
		
		//main에서 인터페이스만 활용한 코드를 작성한다면 
		//사용하는 클래스를 다른 클래스로 간단하게 교체할 수 있다
		ElectronicSource test_battery = new ElectronicSource() {
			
			@Override
			public void consume(int power) {
				System.out.printf("배터리에서 %d만큼의 전력를 소비했습니다\n",power);
				
			}
		};
		
		
		
		
		
		
		Electronics a = new MicroWave("전자랜지",60);
		//Electronics a = new Cleaner();
		
		a.setConnect(test_battery);
		System.out.println(a.execute());
		
	}

}
