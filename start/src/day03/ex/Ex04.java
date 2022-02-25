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
		int day = (int)year / 1;

		// 365일을 제외한 나머지 소숫자리
		double temp = 365.2426 % day;
		
		// 365일을 제외한 0.2426일의 초 환산값 = 20960초
		double time = temp * 60 * 60 * 24;
		
		// 1년의 시간 결과
		double hour = time / (60 * 60);
		
		// 1년의 분 결과
		double minute = time / 60 % 60;
		
		// 1년의 초 결과
		double second = time % 60;
		
		// 출력
		System.out.println("1년은 365.2426일 이다.");
		System.out.println((int)day + "일 " + (int)hour + "시간 " + (int)minute + "분 " + (int)second + "초 입니다.");

		// 할 일
		
		// 데이터 변수에 기억
		double total = 365.2426;
		// 누적 계산될 변수 만들고
		double tmp = total;
		// 날 수 구하고 --> 누적 변수에 계산해서 업데이트
		int day1 = (int) tmp;
		tmp = tmp - day1;
		// tmp -= day1;
		
		// 0.2426 을 초로 변환한다.
		// 1 * 24 ==> 하루의 시간
		// 0.5 * 24 ==> 하루의 반나절
		// 0.1 * 24 ==> 0.1일의 시간
		int tsec = (int) (0.2426 * 60 * 60 * 24);
		
		// 시간 구하고 --> 누적 변수에 계산해서 업데이트
		int hour1 = tsec / 60 / 60;
		
		tsec = tsec % (60 * 60);
		// tsec %= 3600;
		
		// 분 구하고 --> 누적 변수에 계산해서 업데이트
		int minute1 = tsec / 60;
		tsec = tsec % 60;
		// 초 구하고
		int sec1 = tsec;
		// 출력하고
		System.out.println("1년 : " + day1 + " 일" + hour1 + " 시간" + minute1 + " 분" + sec1 + " 초 이다.");
		System.out.println("1 년은 " + total + " 일이고");
		System.out.println("이것은 " + day1 + " 일");
		System.out.println("       " + hour1 + " 시간");
		System.out.println("       " + minute1 + " 분");
		System.out.println("       " + sec1 + " 초 이다.");
		
	}
}
