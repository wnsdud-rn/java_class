package myobj.machine;

public class MicroWave implements Electronics{

	ElectronicSource src;
	String name;
	int power;
	
	
	public MicroWave(String name, int power) {
		this.name = name;
		this.power = power;
	}
	
	@Override
	public void setConnect(ElectronicSource src) {
		this.src = src;
		
	}

	@Override
	public String execute() {
		
		if(src==null) {
			System.out.println("아직 연결된 전력이 없습니다");
			return null;
		}
		
		cook();
		cook();
		cook();
		cook();
		cook();
		return "5번 요리함";
	}
	
	private void cook() {
		//연결된 전력원의 전력을 소비함
		src.consume(power);
	}

	
	

}

