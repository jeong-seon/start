package day04.ex;

/*
	문제 1 ]
		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
		그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
*/
public class Ex01_02 {
	public static void main(String[] args) {
		// 랜덤수 발생
		int num1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int num2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int num3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 숫자 판별
		int result = 0;
		if (num1 > num2 && num1 > num3) {
			result = num1;
		} else if (num2 > num1 && num2 > num3) {
			result = num2;
		} else {
			result = num3;
		}
		// 가장 큰 수 출력
		System.out.println("3개의 숫자 중 가장 큰 수 : " + result);
		
		System.out.println("랜덤발생한 세 정수 \n\t" + num1 + ", " + num2 + ", " + num3 + "\n중 제일 큰 수는 " + result + " 입니다.");
	}
}
