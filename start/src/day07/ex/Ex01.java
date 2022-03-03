package day07.ex;

/*
	Ex01 ]
		'A' ~ 'J' 까지의 문제를 랜덤하게 100개를 만들고
		각 문자의 출현 횟수를 기억할 배열을 만들어서
		횟수만큼 "*" 로 출력해주는 프로그램을 작성하세요.
		
		예 ]
			
			A [5]	: *****
			B [20]	: ********************
			...
			J [7]	: *******
 */
public class Ex01 {

	public static void main(String[] args) {
		int ch = (int)(Math.random() * ('A' - 'J' + 1) + 'J');
		
		System.out.println((char)ch);
	}

}
