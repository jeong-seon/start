package day14.ex;
/*
	문제 3 ]
		학생 한명의 성적을 관리하는 클래스 Student 를 작성하세요.
		기억할 내용은
			반, 이름, 국어, 영어, 수학, 총점
		을 기억하도록 하고
		필요한 기능(함수)는 필요한 만큼 추가해주세요.
		단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하세요.
		학생 변수를 출력하면 모든 내용이 출력되도록 함수를 오버라이드하세요.
		
 */
public class Ex03 {
	
	public Ex03() {
		Student s1 = new Student("제니", 1);
		Student s2 = new Student("리사", 2);
		Student s3 = new Student("둘리", 3);
		Student s4 = new Student("제니", 1);
		
		String result1 = (s1.equals(s2)) ? "같은 학생이다." : "다른 학생이다.";
		String result2 = (s1.equals(s4)) ? "같은 학생이다." : "다른 학생이다.";
		
		System.out.println("s1 과 s2 는 " + result1);
		System.out.println("s1 과 s4 는 " + result2);
		
		System.out.println("=================");
		System.out.println(s1);
		System.out.println("=================");
		System.out.println(s2);
		System.out.println("=================");
		System.out.println(s3);
		System.out.println("=================");
		System.out.println(s4);
		System.out.println("=================");
	}


	public static void main(String[] args) {
		new Ex03();
	}

}
