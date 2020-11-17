package myobj;

public class Flight {
	int passenger;
	String destination;
	int total_gas;
	int used_gas;
	
	static String f_company;
	
	static int point;
	
	static {
		f_company = "Emirates";
		point = 10;
	}
	
	public Flight(int passenger, int used_gas,String destination) {
		this.passenger = passenger;
		this.used_gas = used_gas;
		this.destination = destination;
		
	}
	
	
	public String board() {
		
		
		
		return "비행완료";
	}
	
	
	
	
}
