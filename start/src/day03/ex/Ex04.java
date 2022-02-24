package day03.ex;

/*
	문제 4 ]
		1년은 365.2426일 입니다.
		이것은 과연 몇일 몇시간 몇분 몇초인지
		계산하고 출력하세요.
		
		Hint ]
			365.2426일은 단위가 일 단위이다.
			하루는 24시간이다.
			따라서 0.5일은 12시간을 의미한다.
 */

public class Ex04 {
	public static void main(String[] args) {
		
		// 1년 = 365.2426일
		double year = 365.2426;

		// 1년의 일 환산값
		double day = year / 1;
		
		// 365일을 제외한 0.2426일의 초 환산값 = 20960초
		double time = 0.2426 * 60 * 60 * 24;
		
		// 1년의 시간 결과
		double hour = time / (60 * 60);
		
		// 1년의 분 결과
		double minute = time / 60 % 60;
		
		// 1년의 초 결과
		double second = time % 60;
		
		// 출력
		System.out.println("1년은 365.2426일 이다.");
		System.out.println((int)day + "일 " + (int)hour + "시간 " + (int)minute + "분 " + (int)second + "초 입니다.");

	}
}
