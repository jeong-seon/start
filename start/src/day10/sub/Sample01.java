package day10.sub;

import day10.*;

public class Sample01 {
	private int num1, num2, num3, num4;	// 은닉화
	
	// day10.Test01 의 멤버변수를 읽어서 위 변수에 세팅하는 함수
	public void setNum() {
		// Heap 에 객체 만들고
		Test01 t1 = new Test01();
		
		// no1 의 접근지정자가 private 이기 때문에 안된다.
//		num1 = t1.no1;
		
		// no2 는 같은 패키지 안의 클래스인 경우까지만 접근가능하도록 접근지정자가
		// 생략되었으므로 접근할 수 없다.
//		num2 = t1.no2;
		
		// no3 는 Test01 을 상속받은 클래스이거나 같은 패키지 내의 클래스에서만
		// 사용가능하므로 접근할 수 없다.
//		num3 = t1.no3;
		
		// no4 는 모든 곳에서 사용가능하므로 접근 가능하다.
		num4 = t1.no4;
	}
}
