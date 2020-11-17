package myobj.item;


public class Sword {

	// 필드
	//	-공격력
	//	-강화수치
	//	-강화확률 (등급마다 강화 확률이 다름)
	//	-레벨별 공격력 증가폭
	int attack;
	int grade;
	int upgrade_price;
	boolean destroyed;
	
	
	
	
	final static int MAX_GRADE;
	final static int[] UPGRADE_TABLE;
	final static double[] AMP_TABLE;
	
	static {
		MAX_GRADE = 12;
		UPGRADE_TABLE = new int[] {//강화 성공 확률
				100,90,90,70,60,
				30,20,10,5,3,2,1
				};
		AMP_TABLE = new double[] {// 레벨별 공격력 증가량
				1.0,1.02,1.1,1.15,1.25,
				1.5, 2.0, 3, 4, 5, 6
				};
	}
	
	public Sword(int attack) {
		this.attack = attack;
		this.upgrade_price = attack*500;
		this.grade =0;
		this.destroyed = false;
		
		
	}
	
	
	public Sword() {
		this(10);
	}
	
	
	
	
	// 메서드
	//	-강화하기(성공률에 따라 성공 실패가 적용됨)
	//	 ※ 최대 강화 레벨까지 도달하기 까지 걸린 강화 횟수를 출력해보기
	//	-공격(대상에게 공격력 만큼의 데미지를 입힘)
	//	 ※ 공격의 대상이 되는 객체는 HP가 있어야한다
	
	// 인스턴스 메서드를 만들때는 static를 빼야한다
	// static 메서드는 인스턴스 변수를 활용할 수 없다
	
	public boolean upgrade_weapon() {
		int ran = (int)(Math.random() *100+1);
		
		if(ran <= UPGRADE_TABLE[grade]) {
			//강화성공
			grade +=1;
			System.out.printf("강화에 성공하셨습니다 %+d\n",grade);
			return true;
		}else {
			//강화실패
			if(grade>=10) {
			//10강 이상인 경우 실패시 50%확률로 파괴
				ran = (int)(Math.random() *2);
				if(ran==0) {
					System.err.println("무기가 파괴");
					destroyed = true;
				} else {
					System.err.printf("강화 단계 하락 %+d\n",grade);
					grade -=1;
				}
			}
			
			
			return false;
		}
	}
	
	
	// 현재 칼의 데미지를 계산하여 반환한다
	public int damage() {
		return (int)(Math.ceil(attack * AMP_TABLE[grade]));
	}
	
	
	
	
	public static void main(String[] args) {
		Sword basic_sword = new Sword();
		
		System.out.println(basic_sword.attack);
		System.out.println(basic_sword.upgrade_price);
		
		int count =0;
		while(basic_sword.grade != basic_sword.MAX_GRADE) {
			basic_sword.upgrade_weapon();
			count +=1;
			
			if(basic_sword.destroyed) {
				basic_sword = new Sword();
				//break;
			}
		}
		System.out.println("시도횟수 :"+count);
	}
	
}
