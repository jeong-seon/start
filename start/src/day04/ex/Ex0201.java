package day04.ex;

/*
	입력할때, 알파벳만 입력한다고 가정.
	
	1. 알파벳을 입력받아서
	그 문자가 대문자인지 소문자인지를 판별하는 프로그램을 작성.
	
	2. 숫자 또는 알파벳을 입력받아서
	그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성.
 */

import java.util.*;

public class Ex0201 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 문자 입력
		System.out.print("문자 입력 : ");
		
		// 입력받은 문자열 저장
		String str = sc.nextLine();
		
		// 문자열에서 문자 추출
		char ch = str.charAt(0);
		System.out.println("입력된 문자 : " + ch);
		
		// 입력 변수 선언
		String dae = "대문자";
		String so = "소문자";
		
//		// 판별 ( 판별 결과는 변수에 담아서 처리 )
//		String result = ((char)ch <= 'z') ? (so) :
//						((char)ch >= 'a') ? (so) :
//						((char)ch <= 'Z') ? (dae) :
//						((char)ch >= 'A') ? (dae) : ("문자를 잘못 입력!");
						
		// 출력
//		System.out.println("입력된 문자는 " + result + " 입니다.");
		
	}
}
