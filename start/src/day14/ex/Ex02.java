package day14.ex;
/*
	문제 2 ]
		사각형의 정보를 기억하는 클래스 Nemo 를 제작하세요.
		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리가 되도록
		equals() 함수를 오버라이드 하세요.
		이 클래스 객체를 출력하면 내용이 출력되도록
		toString() 를 오버라이드 하세요.
 */
public class Ex02 {

	public Ex02() {
		Nemo n1 = new Nemo(10, 20);
		Nemo n2 = new Nemo(5, 10);
		Nemo n3 = new Nemo(10, 20);
		Nemo n4 = new Nemo(20, 10);
		
		String result1 = (n1.equals(n2)) ? "같은" : "다른";
		String result2 = (n1.equals(n3)) ? "같은" : "다른";
		String result3 = (n1.equals(n4)) ? "같은" : "다른";
		
		System.out.println("n1 과 n2 는 " + result1 + " 네모 입니다.");
		System.out.println("n1 과 n3 는 " + result2 + " 네모 입니다.");
		System.out.println("n1 과 n4 는 " + result3 + " 네모 입니다.");
		System.out.println("=============================================");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
