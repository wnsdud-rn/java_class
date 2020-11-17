package myobj.monster;

import myobj.item.Gun;
import myobj.item.Sword;
import myobj.item.Weapon;

public class Monster {
	public String name;
	public int hp;
	
	
	
	
	public Monster() {
		name="연습용 허수아비";
		hp=99999;
	}
	
	public void attack(Sword sword) {
		int dmg = sword.damage();
		hp -=dmg;
		System.out.printf("%s에게 %d의 데미지!\n",name,dmg);
		System.out.printf("%s의 남은 체력 : %d\n",name,hp);
		
	}
	
	//weapon타입으로 업캐스팅된 Gun인스턴스는
	//  damage()를 사용할 때 Gun의 damage()를 사용한다
	public void attacked(Weapon weapon) {
		int dmg = weapon.damage();
		hp -=dmg;
		System.out.printf("%s에게 %d의 데미지!\n",name,dmg);
		System.out.printf("%s의 남은 체력 : %d\n",name,hp);
	}
	
	
	public static void main(String[] args) {
		Sword steel_sword = new Sword(30);
		
		Monster mon = new Monster();
		
		mon.attack(steel_sword);
		
		for(int i=0;i<10;i++) {
			steel_sword.upgrade_weapon();
		}
		
		//mon.attack(steel_sword); //이거 weapon에 넣어서 하면 같이 쓸수있음
		mon.attacked(new Gun());
		mon.attacked(new Weapon(10));
	}
	
}


