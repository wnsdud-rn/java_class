package myobj.vehicle;

public class Airplane {
	int points;
	int gas;
	int fly_distance;
	int passenger;
	
	
	public Airplane() {
		points = 1000;
		gas = 1000;
		fly_distance =10;
		passenger = 10;
	}
	
	
	
	
	public Airplane(int points, int gas, int fly_distance, int passenger) {
		super();
		this.points = points;
		this.gas = gas;
		this.fly_distance = fly_distance;
		this.passenger = passenger;
	}




	public void board() {
		if(gas==0) {
			System.err.println("비행불가.");
			System.out.printf("현재 남은 연료 %d\n",gas);
			return;
		}
		System.out.println("비행기 이륙");
		this.points +=100;
		this.gas -=500;
		this.fly_distance +=200;
		this.passenger +=50;
		
		System.out.printf("현 비행기 포인트 : %d\n남은 연료 : %d\n비행 거리 : %d\n승객수 : %d\n",
				this.points,this.gas,this.fly_distance,this.passenger);
	}
	
}
