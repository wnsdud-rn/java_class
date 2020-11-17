package myobj.machine;

public class Cleaner implements Electronics{

	ElectronicSource src;
	int power;
	
	public Cleaner() {
		this.power =30;
	}
	
	@Override
	public void setConnect(ElectronicSource src) {
		this.src = src;
		
	}

	@Override
	public String execute() {
		System.out.println("청소기를 1회 사용");
		src.consume(power);
		return "방이 10만큼 깨끗해짐";
	}

}
