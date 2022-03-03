package day05.ex;

/*
	문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 ...  했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
		
		힌트 ]
		
			1 + (-2) + 3 + (-4) + ...
			
			no * -1
 */
public class Ex09 {

	public static void main(String[] args) {
		// 변수 선언
		int num = 0;
		int sum = 0;
		
		// 무한 반복
		while (true) {
			num++;					// num 을 1씩 증가
			if (num % 2 == 0) {		// num 이 짝수인 경우 -
				sum = sum - num;
			} else {
				sum = sum + num;	// num 이 홀수인 경우 +
			}
			if (sum > 100) {
				break;
				// sum 이 100이 넘어갈 때 반복문 종료
			}
		}
		
		// 결과 출력
		System.out.println("계산결과 : sum = [ " + sum + " ] " + "num = [ " + num + " ] ");
	}

}
