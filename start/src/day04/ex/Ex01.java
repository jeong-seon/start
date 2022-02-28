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
		int result1 = (num1 > num2) ?
						(num1 > num3) ? (num1) : (num3) :
						(num2 > num3) ? (num2) : (num3);
		
		// 가장 큰 수 출력
		System.out.println("3개의 숫자 중 가장 큰 수 : " + result);
		
		System.out.println("입력한 세 정수 \n\t" + num1 + ", " + num2 + ", " + num3 + "\n중 제일 큰 수는 " + result1 + " 입니다.");
		
		/*
			참고 ]
				문자열을 표현할 때 문자열 안에 " 기호를 출력하는 방법
				==>
					\"
					이 때 사용한 \ 를 이스케이프문자 라고 부른다.
			
					많이 사용하는 문자들
					
						\"	- 문자열 내에 " 를 표현한다.
						\n	- 한 줄 내림 기호
						\r	- 캐리지 리턴
						\t	- tab 을 표현
						\b	- backspace
		 */
		
		// 보너스문제 : -100 ~ 100 사이의 정수를 랜덤하게 발생
		int number = (int)(Math.random() * (100 - (-100) + 1) + (-100));
		System.out.println("-100 ~ 100 사이의 랜덤한 정수 : " + number);
	}
}
