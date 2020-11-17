import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import myobj.Student;
import myobj.comp.StudentComparatorA;

public class D04_Comparator {

	public static void main(String[] args) {
		
		List<String> words = new LinkedList<>();
		
		words.add("airplane");
		words.add("jets");
		words.add("coffee");
		words.add("glasses");
		words.add("oriental");
		
		Collections.sort(words);
		System.out.println(words);
		
		List<Student> group = new LinkedList<>();
		
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		group.add(new Student());
		
		/*
		 * Collections.sort(group); //에러뜸 : 크기 비교의 기준이 필요 =>1.implements Comparable를
		 * Student에 해줌 System.out.println(group);
		 */
		
		//Collections.sort(group, new StudentComparatorA()); =>2.studentcomparactor란걸 myobj에 만들어서 함(default에 있는건 못가져나옴)
		Collections.sort(group, new Comparator<Student>() { //=>3.일회용으로 만들어서  함
			@Override
			public int compare(Student o1, Student o2) {
				return (int)Math.ceil(o1.getAvg()-o2.getAvg());
			}
		});
		System.out.println(group);
		
		
		
	}
}
