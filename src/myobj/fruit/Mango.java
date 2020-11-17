package myobj.fruit;

import java.util.Random;

import myobj.Student;

public class Mango implements Comparable<Mango> {
	public int calorie;
	public int sweet;
	public int id;
	
	private static int mango_id=0;
	
	//비교대상 망고를 생성하는 생성자
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}

	public Mango() {
		Random ran = new Random();

		calorie = ran.nextInt(100) + 1;
		sweet = ran.nextInt(10) + 1;
		id = mango_id++;//해당 인스턴스를 유일하게 구분해줄수 있는값
		System.out.printf("%d번 망고가 생성되었습니다.\n",id);
	}

	@Override
	public String toString() {
		return String.format("%06d :%d/%d\n", id,calorie, sweet);
	}

	@Override
	public int hashCode() {
		// 이 객체를 유일하게 구분하려면 어떻게 해야할까요? 를 정의하는곳
		// (기본 동작은 이 인스턴스의 주소값을 해시화 하는 것)
		System.out.println(super.hashCode());
		return id;
	}

	@Override
	public int compareTo(Mango next_mango) {
		int calorie_result = this.calorie - next_mango.calorie;
		return calorie_result == 0 ? this.sweet - next_mango.sweet : calorie_result;

	}

}
