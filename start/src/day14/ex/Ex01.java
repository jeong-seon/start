package day14.ex;

/*
	문제 1 ]
		원의 정보를 기억할 클래스를 제작하세요.
		가지는 정보는
			반지름, 둘레, 면적
		를 가지고
		기능은 변수에 접근할 수 있는 함수를.
		그리고 반지름이 같으면 같은 원으로 처리해주는 기능의
			equals()
		함수로 오버라이드 하고,
		이 클래스 타입의 변수를 출력하면
		해당 원의 정보를 출력해주는 함수도 오버라이드 하세요. (toString)
		
 */
public class Ex01 {

	public Ex01() {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(10);
		
		String result1 = (c1.equals(c2)) ? "같은" : "다른";
		String result2 = (c1.equals(c3)) ? "같은" : "다른";
		
		System.out.println("c1 과 c2 는 " + result1 + " 원 입니다.");
		System.out.println("c1 과 c3 는 " + result2 + " 원 입니다.");
		System.out.println("=======================================");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
