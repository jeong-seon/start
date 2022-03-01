package day05.ex;

/*
	문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 :	54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지를 출력해서 사용자가 숫자를 알아맞추는 게임.
			
			횟수도 같이 출력되게 하세요.
 */

import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
		// 1 ~ 20 까지의 랜덤한 정수 발생
		int ran = (int)(Math.random() * (20 - 1 + 1) + 1);
		
		System.out.println("랜덤 정수 : " + ran);
		
		// 입력받을 변수 선언
		int input_num;
		
		// 기회 변수 선언
		int count = 0;
		
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 20 사이의 숫자 중 하나의 정수를 맞춰보세요.");
		
		// do ~ while 문 ==> 적어도 한번 실행.
		do {
			System.out.print("정수 입력 : ");
			input_num = sc.nextInt();
			count++;
			if (input_num < ran) {
				System.out.println("랜덤 정수보다 입력한 정수가 더 작습니다. 더 큰 수를 입력하세요.");
			}
			if (input_num > ran) {
				System.out.println("랜덤 정수보다 입력한 정수가 더 큽니다. 더 작은 수를 입력하세요.");				
			}
		} while (input_num != ran);	// 입력받은 정수가 랜덤정수와 비교하여 같지않을때 위 구문 반복
		
		// 결과 출력
		System.out.println("* 정답입니다 ! * 총 시도 횟수는 " + count + " 번 입니다.");
	}
}
