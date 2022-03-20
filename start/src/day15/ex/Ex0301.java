package day15.ex;
/*
	학생 한명의 정보를 저장할 클래스를 제작하세요.
	정보는
			학생이름, 반, 번호,
			자바, 데이터베이스, 웹, 스프링 점수
			총점, 평균
	를 기억하게 되고
	
	10명의 학생을 TreeSet 에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
*/
import java.util.*;

public class Ex0301 {

	public Ex0301() {
		TreeSet set = new TreeSet();
		int count = 1;
		Student s = new Student();
		ArrayList vec = new ArrayList(set);
		
		vec.add("제니");
		vec.add(1);
		vec.add(30);
		vec.add((int)(Math.random() * 41 + 60));
		vec.add((int)(Math.random() * 41 + 60));
		vec.add((int)(Math.random() * 41 + 60));
		vec.add((int)(Math.random() * 41 + 60));
		vec.add(s.getTotal());
		vec.add(s.getAvg());
		
		System.out.println(set);
		for (int i = 0; i < vec.size(); i++) {
			Object o = vec.get(i);
			
			if (o instanceof String) {
				String name = (String) o;
			} else if (o instanceof Integer) {
				int ban = (int) o;
			} else if (o instanceof Integer) {
				int num = (int) o;
			} else if (o instanceof Integer) {
				int java = (int) o;
			} else if (o instanceof Integer) {
				int db = (int) o;
			}
			
			System.out.println(o);
		}
		
//		ArrayList list = new ArrayList(set);
//		for(Object o : list) {
//			System.out.println(o);
//		}
//		
//		System.out.println(count);
	}

	public static void main(String[] args) {
		new Ex0301();
	}

}
