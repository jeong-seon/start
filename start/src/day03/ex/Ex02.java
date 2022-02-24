package day03.ex;

/*
	문제 2 ]
		하나의 숫자를 입력받은 후 (원의 반지름)
		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력.
		
		참고 ]
			원의 넓이 : 반지름 * 반지름 * 3.14
			원의 둘레 : 2 * 반지름 * 3.14
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 원의 반지름 길이
		System.out.print("원의 반지름 : ");
		int one = sc.nextInt();
		
		// 원의 넓이
		double one1 = one * one * 3.14;
		System.out.println("원의 넓이 : " + one1 + "cm²");
		
		// 원의 둘레
		double one2 = 2 * one * 3.14;
		System.out.println("원의 둘레 : " + one2 + "cm");
	}
}
