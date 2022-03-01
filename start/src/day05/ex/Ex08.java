package day05.ex;

/*
	문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각 자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환 후 처리하세요.
 */
import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("다섯자리 정수 입력 : ");
		String str = sc.nextLine();
		
		// 문자열로 받아온 str 을 정수값으로 파싱
//		int result = Integer.parseInt(str);
		// 합 변수 선언
		int sum = 0;
		
		// 정수 길이만큼 정수 첫번째 자리부터 차례로 추출 후 sum 에 저장
		// 이 때 문자로 계산되기때문에 숫자 문자값 기준인 '0' 을 빼주면 각 자릿수의 정수값이 추출
		for (int i = 0 ; i < str.length() ; i++) {
			sum = sum + str.charAt(i) - '0';
		}
		
		// 결과 출력
		System.out.println("다섯자리 정수 : [ " + str + " ] " + " 정수의 합 : [ " + sum + " ]");
		
		
	}
}
