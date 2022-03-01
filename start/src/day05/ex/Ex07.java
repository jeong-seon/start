package day05.ex;

/*
	문제 7 ]
		5 자리의 숫자를 입력한 후
		각 자리의 수의 합을 구하는 프로그램을 작성하세요.
		
 */
import java.util.*;
public class Ex07 {
	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력
		System.out.print("5 자리의 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 합 변수 선언
		int sum = 0;
		
		// while 반복문 num 이 0 보다 크면 반복
		while (num > 0) {
			sum = sum + (num % 10);
			// 0 + (정수 % 10) ==> 5자리 정수의 마지막 자릿수 추출 후 sum 에 저장
			
			num = num / 10;
			// num 의 5자리 정수의 마지막 자리 숫자가 버려짐 (12345 ==> 1234)
		}
		
		// 결과 출력
		System.out.println("각 자리의 합을 더한 결과 = " + sum);
	}
}
