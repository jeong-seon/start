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

public class Ex03 {
	String[] name;
	int[] ban, num, java, db, web, spr, total;
	double[] avg;
	
	public Ex03() {
		setData();
		Student[] stud = new Student[10];
		stud = getStudent();
		
		int count = 1;
		
		TreeSet set = new TreeSet();
		
		for (int i = 0; i < stud.length; i++) {
			set.add(stud[i]);
			
			
			if (set.size() == 10) {
				break;
			}
			count++;
		}
		
		ArrayList list = new ArrayList(set);
		for (Object o : list) {
			System.out.println(o);
		}
//		System.out.println();
		System.out.println("Count : " + count);
	
	}
	public Student[] getStudent() {
		Student[] stud = new Student[10];
		
		for (int i = 0; i < stud.length; i++) {
			stud[i] = new Student();
		}
		for (int i = 0; i < stud.length; i++) {
			Student s = stud[i];
			
			s.setName(name[i]);
			s.setBan(ban[i]);
			s.setNum(num[i]);
			s.setJava(java[i]);
			s.setDb(db[i]);
			s.setWeb(web[i]);
			s.setSpr(spr[i]);
			s.setTotal(total[i]);
			s.setAvg(avg[i]);
		}
		
		return stud;
	}
	
	public void setData() {
		name = new String[] {"제니", "리사", "로제", "지수", "둘리", "재석", "석진", "광수", "하하", "종국"};
		ban = new int[10];
		for (int i = 0; i < ban.length; i++) {
			int van = (int)(Math.random() * 9 + 1);
			ban[i] = van;
		}
		num = new int[10];
		loop:
		for (int i = 0; i < num.length; i++) {
			int number = (int)(Math.random() * 30 + 1);
			num[i] = number;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					num[j] = number;
					continue loop;
				}
			}
			
		}
		java = new int[10];
		for (int i = 0; i < java.length; i++) {
			int jv = (int)(Math.random() * 41 + 60);
			java[i] = jv;
		}
		db = new int[10];
		for (int i = 0; i < db.length; i++) {
			int data = (int)(Math.random() * 41 + 60);
			db[i] = data;
		}
		web = new int[10];
		for (int i = 0; i < web.length; i++) {
			int w = (int)(Math.random() * 41 + 60);
			web[i] = w;
		}
		spr = new int[10];
		for (int i = 0; i < spr.length; i++) {
			int spring = (int)(Math.random() * 41 + 60);
			spr[i] = spring;
		}
		total = new int [10];
		for (int i = 0; i < total.length; i++) {
			total[i] = java[i] + db[i] + web[i] + spr[i];
		}
		avg = new double[10];
		for (int i = 0; i < avg.length; i++) {
			avg[i] = total[i] / 4.;
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
