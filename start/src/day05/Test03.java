package day05;

/*
	정수를 입력받아서
	그 숫자가 짝수인지 홀수인지를 판별해서 출력.
	단, 0 인 경우는 0 으로 출력하세요.
	
	if ~ else 구문으로 처리
 */

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.print("정수 입력 : ");
		
		// 입력받아서 변수에 기억
		int no = sc.nextInt();
		
		// 결과 변수 선언
		String result = "";
		
		// 판별
		if (no == 0) {
			// no 가 0 인 경우
			result = "0";
		} else {
			// no 가 0 이 아닌 경우
			if (no % 2 == 0) {
				// 짝수인 경우
				result = "짝수";
			} else {
				// 홀수인 경우
				result = "홀수";
			}
			
		}

		// 결과 출력
		System.out.println("입력한 정수 " + no + " 은 " + result + " 입니다.");
	}

}
