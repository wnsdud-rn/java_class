package myobj;

import java.util.Random;

public class Student implements Comparable<Student>{
	//외부 클래스에서 필드의 직접접근을 허용하지 않는것이 좀 더 객체지향적이다
	//(외부 클래스는 내가 주는것만 사용할 수 있게끔 설계하는것이 이상적이다)
	private int kor,eng,math;
	private int total;
	private double avg;
	private String name;
	
	final static int NUM_OF_SUBJECTS =3;
	static int stu_count =0;
	
	public Student() {
		Random ran = new Random();
		
		kor = ran.nextInt(51)+50;
		eng = ran.nextInt(51)+50;
		math = ran.nextInt(51)+50;
		name = String.format("테스트학생%04d",stu_count++);
		
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return kor+eng+math / (double) NUM_OF_SUBJECTS;
	}
	
	// toString()은 Object클래스의 메서드 이기 때문에
	//	모든 객체가 가지고 있다
	@Override
	public String toString() {
		//이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드
		//원래 동작 : 주소값 출력
		//return super.toString();
		
		//String.format() : printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		//return "["+name +"/" + total + "/" + avg+"]";
		
		return String.format("\n[%s/%d/%d/%d/%d/%.2f]",name,kor,eng,math,getTotal(),getAvg()); //클래스 이름에 점을 찍고 사용하는 메서드는 스태틱
	}

	
	//이 클래스는 크기비교를 이런식으로 하겠다
	//	-양수를 리턴 : 현재 객체가 다음 객체보다 더 큼 (뒤로 가야함)
	//	-음수를 리턴 : 현재 객체가 다음 객체보다 더 작음(앞으로 가야함)
	//	-0을  리턴  : 현재 객체와 다음 객체의 크기가 같음
	@Override
	public int compareTo(Student next_student) {
		
		/*
		 * if(this.math > next_student.math) { //수학 점수가 더 큰 학생이 뒤에 나왔으면 좋겠다 return 1;
		 * }else if(this.math < next_student.math) { //수학 점수가 더 작은 학생이 앞으로 나왔으면 좋겠다
		 * return -1; }else { //수학 점수가 같을땐 냅두겠다 return 0; }
		 */
		
		if(this.eng > next_student.eng) {
			//영어 점수가 더 큰 학생이 뒤에 나왔으면 좋겠다
			return -1;
		}else if(this.eng < next_student.eng) {
			//영어 점수가 더 작은 학생이 앞으로 나왔으면 좋겠다
			return 1;
		}else {
			//영어  점수가 같을땐 냅두겠다
			return 0;
		}
		
	}
	
	
}
