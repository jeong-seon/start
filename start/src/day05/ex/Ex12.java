package day05.ex;

/*
	문제 12 ]
		5 자리 숫자 하나를 입력받아서
		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
		
		참고 ]
			회문수란?
				첫번째 자리수와 마지막 자리수
				두번째 자리수와 마지막에서 두번째 자리수
				...
				가 동일한 수를 말한다.
 */
import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("5자리 정수 입력 : ");
		int num = sc.nextInt();
		
		// 계산에 쓰일 버릴값 선언
		int temp = num;
		int result = 0;
		
		// temp 가 0 이 아닌 경우 반복
		while (temp != 0) {
			result = result * 10;			// 자릿수 늘리기
			result = result + temp % 10;	// 역순으로 자릿수 구하기
			temp = temp / 10;				// 12345 == > 1234
		}
		
		// 결과 출력
		if (num == result) {
			System.out.println("이 정수는 회문수 입니다.");
		} else System.out.println("이 정수는 회문수가 아닙니다.");
		
		
	}

}
