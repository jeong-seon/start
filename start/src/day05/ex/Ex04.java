package day05.ex;

/*
	문제 4 ]
		전기요금을 계산해주는 프로그램을 작성하세요.
		
		전기요금표
		
						코드	기본요금	사용요금
			가정용		1		3800		245
			산업용		2		2400		157
			교육용		3		2900		169
			상업용		4		3200		174
			
		전기요금은
			기본요금 + 사용량 * 사용요금
			
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		// 전기요금표 배열
		String[] str1 = {"가정용", "1", "3800", "245"};
		String[] str2 = {"산업용", "2", "2400", "157"};
		String[] str3 = {"교육용", "3", "2900", "169"};		
		String[] str4 = {"상업용", "4", "3200", "174"};
		
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("코드 입력: ");
		String input1 = sc.nextLine();
		System.out.print("사용량 입력: ");
		int input2 = sc.nextInt();
		
		System.out.println("사용자 코드 : " + input1 + ", " + "사용량 : " + input2);
		
		int result = 0;
		
		// 입력받은 코드와 매칭 후 전기요금 계산
		if (input1 == "1") {
			result = 3800 + (input2 * 245);
		} else if (input1 == "2") {
			result = 2400 + (input2 * 157);
		} else if (input1 == "3") {
			result = 2900 + (input2 * 169);
		} else {
			result = 3200 + (input2 * 174);
		}
		
		// 결과 출력
		System.out.println("전기요금 = " + result + " 원 입니다.");
	}
}
