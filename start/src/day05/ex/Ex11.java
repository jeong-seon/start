package day05.ex;

/*
	문제 11 ]
		2x + 4y = 10 의 방정식의 결과를 출력하세요.
		단, x, y 는 모두
				0 <= x, y <= 10
		사이의 숫자이다.
		
 */
public class Ex11 {

	public static void main(String[] args) {
		// x 의 경우
		for (int i = 0 ; i <= 10 ; i++) {
			// y 의 경우
			for (int j = 0 ; j <= 10 ; j++) {
				// 2x + 4y 가 10이 되는 경우의 x값과 y값 결과
				if ((2 * i) + (4 * j) == 10) {
					System.out.println("x = [" + i + "], y = [" + j + "]");
				}
			}
		}
	}

}
