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
		
		double temp = year;
		
		double day = temp / 1;
		
		temp = day % temp;
		
		double time = temp / 24;
		
		System.out.println(day);
		System.out.println(time);
		
		System.out.println(temp);
	}
}
