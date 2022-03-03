package day05.ex;
/*
	문제 3 ]
		문자열을 입력받아서
		문자를 한 글자씩 추출해서 출력하세요.
		
		참고 ] 
			문자열의 길이를 알아내는 방법
				int 변수 = 문자열.length()
 */

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 문자열 길이
		int len = str.length();
		System.out.println("입력된 문자열의 길이 : " + len);
		
		// 문자열 데이터 첫번째부터 추출해서 결과 출력 (반복)
		for (int i = 0 ; i < len ; i++) {
			System.out.println((i + 1) + " 번째 데이터 : " + str.charAt(i));
		}
	}
}
