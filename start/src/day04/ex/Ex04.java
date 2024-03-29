package day04.ex;

/*
	문제 4 ]
		1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서
		이 숫자를 년도로 하는 해는
		윤년인지 평년인지를 판별해서 출력해주는
		프로그램을 작성하세요.
		
		참고 ]
			윤년은 4로 나누어 떨어지고
					100으로 나누어 떨어지면 안되고
					400으로 나누어 떨어지는 해.
 */

public class Ex04 {
	public static void main(String[] args) {
		// 랜덤수 발생
		int year = (int)(Math.random() * (3000 - 1000 + 1) + 1000);
		
		String yoon = "윤년";
		
		String peung = "평년";

		// 윤년인지 평년인지 판별
		String result = (year % 4) != 0 ? (peung) : 
						(year % 100 ) != 0 ? (peung) :
						(year % 400 ) == 0 ? (yoon) : (peung);
		
		// 출력
		System.out.println("년도 : " + year);
		
		System.out.println("이 년도는 [ " + result + " ] 입니다.");
	}
}
