package day05.ex;

/*
	문제 10 ]
		주사위 2개를 던질 경우 눈의 합이 6 이 되는 경우를 모두 출력하세요.
 */
public class Ex10 {

	public static void main(String[] args) {
		// 첫번째 주사위 경우의 수
		for (int i = 1 ; i <= 6 ; i++) {
			
		// 두번째 주사위 경우의 수
			for (int j = 1 ; j <= 6 ; j++) {
				
		// 주사위 2개 합이 6이 되는 모든 경우
				if ((i + j) == 6) {
					System.out.println("첫번째 주사위 : [" + i + "], " + "두번째 주사위 : [" + j + "]");
				}
			}
		}
	}
}
