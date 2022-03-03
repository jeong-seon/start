package day06.ex;

/*
	문제 1 ]
		3 ~ 100 사이의 정수를 입력받아서
		이 정수가 소수인지 판단하는 프로그램을 작성하세요.
		
		참고 ]
			소수
				1 과 자신으로만 나누어지는 수
				
	보너스 ]	(레이블)
		
		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
				
 */
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		boolean bool = false;
		
		if (num < 3 || num > 100) {
			System.out.println("정수를 정확히 입력해주세요!");
			sc.close();
		}
		
		for (int i = 2 ; i < num ; i++) {
			if (num % i == 0) {
				bool = true;
				break;
			}
		}
		if (bool) {
			System.out.println("[" + num + "] 이 정수는 소수가 아닙니다.");
			
		} else {
			System.out.println("[" + num + "] 이 정수는 소수입니다.");
			
		}
		
		
		System.out.println();
		System.out.println("[3 ~ 100 까지의 소수]");
		int count = 0;
		
		for (int i = 3 ; i <= 100 ; i++) {
			int j;
			loop:
			for (j = 3 ; j <= i ; j++) {
				if (i % j == 0) {
					break loop;
				}
			}
			if (i == j) {
				count += 1;
				System.out.print(i + ", ");
				
			}
		}		
		System.out.println("\n[3 ~ 100 까지 소수의 갯수] : " + count);
	}

}
