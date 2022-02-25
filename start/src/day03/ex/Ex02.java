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
// 이렇게 사용할 클래스의 경로를 지정하면
// java.util 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게된다.
// 이 예제의 경우는 Scanner 를 사용할 예정인데 직접 * 대신 Scanner 로 명시해도 된다.

// 적용 순서는 * 보다는 클래스 이름을 명시하는 방법을 우선 적용시킨다.
// 예 ] java.util.* / java.sql.Date
//		==> Date 사용하게되면 뒤에 있는 java.sql.Date 를 사용하게 된다.

/*
	A	-	abcd.txt
			efg.txt
			
	B	-	abcd.txt
			xyz.txt
 */
public class Ex02 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력받기전에 메세지 출력
		System.out.print("원의 반지름 : ");
		
		// 원의 반지름 길이 입력
		int rad = sc.nextInt();
		
		// 3.14
		double pi = 3.14;
		
		// 원의 넓이 계산 및 출력
		// 숫자데이터의 연산은 항상 큰 데이터타입으로 결과가 나온다.
		double one1 = rad * rad * pi;
		System.out.println("원의 넓이 : " + one1 + "cm²");
		
		// 원의 둘레 계산 및 출력
		double one2 = 2 * rad * pi;
		System.out.println("원의 둘레 : " + one2 + "cm");
		
		/*
			참고 ]
				형변환에서 큰 타입의 데이터를 작은타입으로 변환하면
				남는 부분(소수)은 버린다.
		 */
//		int intone1 = (int) one1;
//		int intone2 = (int) one2;
//		System.out.println(intone1);
//		System.out.println(intone2);		
	}
}
