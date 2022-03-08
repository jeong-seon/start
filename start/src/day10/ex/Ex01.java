package day10.ex;

/*
	문제 1 ]
		다음 변수를 가지는 Student 클래스를 제작하세요.
		
		String name;
		int ban, no, kor, eng, math;
		
		클래스를 만들고
		
		Ex01 클래스에서
			한명의 데이터를 입력해서 출력하기
			5명의 데이터를 배열로 만들어서 데이터 입력하고 출력
			
		1. 한개의 함수 내에서 처리하기.
		2. 기능별로 분리해서 함수 만들어서 처리.
		
		보너스 ]
			int rank, total;
			double avg;
 */
public class Ex01 {
	// 변수 선언
	String[] name;
	int[] ban, no, kor, eng, math, total, rank;
	double[] avg;
	
	public Ex01() {
		// 멤버변수들 초기화
		setData();
		
		Student[] stud = getStudent();
		
		System.out.println("===============================");
		
		toPrint(stud);
		
	}
	
	// 준비된 데이터를 Student[] 타입의 데이터로 만들어서 반환해주는 함수
	public Student[] getStudent() {
		// Student[] 배열 만들기
		Student[] stud = new Student[5];
		
		// 각 방에 Student 객체들을 채워넣는다.
		for(int i = 0; i < stud.length; i++) {
			stud[i] = new Student();
		}
		
		// 데이터 채우기
		for(int i = 0; i < stud.length; i++) {
			Student s = stud[i];
			
			s.setName(name[i]);
			s.setBan(ban[i]);
			s.setNo(no[i]);
			s.setKor(kor[i]);
			s.setEng(eng[i]);
			s.setMath(math[i]);
			s.setTotal(total[i]);
			s.setRank(rank[i]);
			s.setAvg(avg[i]);
			
		}
		
		
		return stud;
	}
	// 각 데이터를 초기화 시켜주는 함수
	public void setData() {
		name = new String[] {"제니", "리사", "로제", "지수", "둘리"};
		ban = new int[5];
		for(int i = 0; i < ban.length; i++) {
			int van = (int)(Math.random() * 10 + 1);
			ban[i] = van;
		}
		no = new int[5];
		for(int i = 0; i < no.length; i++) {
			int number = (int)(Math.random() * 30 + 1);
			no[i] = number;
		}
		kor = new int[5];
		for(int i = 0; i < kor.length; i++) {
			int score1 = (int)(Math.random() * 41 + 60);
			kor[i] = score1;
		}
		eng = new int[5];
		for(int i = 0; i < eng.length; i++) {
			int score2 = (int)(Math.random() * 41 + 60);
			eng[i] = score2;
		}
		math = new int[5];
		for(int i = 0; i < math.length; i++) {
			int score3 = (int)(Math.random() * 41 + 60);
			math[i] = score3;
		}
		total = new int[5];
		for(int i = 0; i < total.length; i++) {
			total[i] = kor[i] + eng[i] + math[i];
		}
		rank = new int[5];
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < rank.length; j++) {
				if(total[j] > total[i]) {
					rank[i] += 1;
				}
			}
		}
		avg = new double[5];
		for(int i = 0; i < avg.length; i++) {
			avg[i] = total[i] / 3.;
		}
	}
	// 출력
	public void toPrint(Student[] s) {
		for(int i = 0; i < s.length; i++) {
			String name = s[i].getName();
			int ban = s[i].getBan();
			int no = s[i].getNo();
			int kor = s[i].getKor();
			int eng = s[i].getEng();
			int math = s[i].getMath();
			int total = s[i].getTotal();
			int rank = s[i].getRank();
			double avg = s[i].getAvg();
			
			System.out.println("이름      : " + name);
			System.out.println("반        : " + ban);
			System.out.println("번호      : " + no);
			System.out.println("국어 점수 : " + kor);
			System.out.println("영어 점수 : " + eng);
			System.out.println("수학 점수 : " + math);
			System.out.println("과목 총점 : " + total);
			System.out.println("과목 평균 : " + avg);
			System.out.println("석차      : " + rank);
			System.out.println("===============================");
			
		}
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
