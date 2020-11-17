package myobj.machine;

public interface Electronics {

	//전자 기기 인터페이스
	
	//1.모든 전자기기는 전력 공급을 받을 수 있다
	
	//2.모든 전자기기는 콘솔에 한번 출력할때마다 전력 소비량만큼의 전력을 소비한다
	
	//3.모든 전자기기는 실행하고 있는 동작을 콘솔에 출력한다
	
	// 나중에 가져다 쓸때 필요한 정보(메서드)들을 정의한다
	
	void setConnect(ElectronicSource src);
	//Generator getConnectedGenerator();
	
	
	String execute(); //실행
	
	
	
	
	
}




