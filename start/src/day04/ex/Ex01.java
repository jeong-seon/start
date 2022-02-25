package day04.ex;

/*
	문제 1 ]
		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요.

*/
public class Ex01 {
	public static void main(String[] args) {
		// 랜덤수 발생
		int num1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int num2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int num3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 숫자 판별
		int result = (num1 < num2) ? ((num2 < num3) ? (num3) : (num2)) : (num1);
		
		// 가장 큰 수 출력
		System.out.println("3개의 숫자 중 가장 큰 수 : " + result);
	}
}
