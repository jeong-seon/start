package day05.ex;

/*
	문제 14 ]	(반복문)
		다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
		
		1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
		2. 첫번째 숫자(a) 가 마지막숫자(d) 보다 2 큼
		3. 두번째 숫자(b) 가 세번째숫자(c) 보다 크다.
		4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456 이 된다.
 */
public class Ex14 {

	public static void main(String[] args) {
		// 반복문으로 처리
		for (int i = 0 ; i <= 9999 ; i++) {
			int d = i % 10;				// 마지막 자리
			int c = (i / 10) % 10;		// 세번째 자리
			int b = (i / 100) % 10;		// 두번째 자리
			int a = (i / 1000) % 10;	// 첫번째 자리
			
			// 1. 모든 자리에 0이 올 수 없으므로 패스
			if ((a == 0) || (b == 0) || (c == 0) || (d == 0)) {
				continue;
			}
			// 2. 첫번째 숫자(a) 가 마지막숫자(d) 보다 2큼
			boolean bool1 = ((a - d) == 2);
			// 3. 두번째 숫자(b) 가 세번째 숫자(c) 보다 크다
			boolean bool2 = (b > c);
			// 4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456 이 된다.
			boolean bool3 = (i + ((d * 1000) + (c * 100) + (b * 10) + (a * 1)) == 16456);
			// 조건을 모두 만족하는 경우 결과 출력
			if (bool1 && bool2 && bool3) {
				System.out.println("조건을 모두 만족하는 숫자 : [" + i +"]");
				break;
			}
		}
	}

}
