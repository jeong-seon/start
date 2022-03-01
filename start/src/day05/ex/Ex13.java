package day05.ex;

/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :	두 수의 약수중 제일 큰수.
						두 수를 나눌 수 있는 수중 제일 큰 수.
						
		extra ]
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
 */
public class Ex13 {

	public static void main(String[] args) {
		// 랜덤수 발생
		int num1 = (int)(Math.random() * (30 -1 + 1) + 1);
		int num2 = (int)(Math.random() * (30 -1 + 1) + 1);
		
		// 계산을위해 필요한 변수
		int max = 0;
		int min = 0;
		int result1 = 0;
		int result2 = 0;
		
		// 최대공약수
		if (num1 <= num2) {
			min = num1;
		} else {
			min = num2;
		}
		for (int i = 1 ; i <= min ; i++) {
			if ((num1 % i) == 0 && (num2 % i) == 0) {
				result1 = i;
			}
		}
		
		// 최소공배수
		if (num1 <= num2) {
			max = num2;
		} else {
			max = num1;
		}
		
		for (int i = max ; i >= max ; i++) {
			if ((i % num1) == 0 && (i % num2) == 0) {
				result2 = i;
				break;
			}
		}
		
		// 결과 출력
		System.out.println("첫번째 정수 : [" + num1 + "]\t두번째 정수 : [" + num2 + "]");
		System.out.println("두 수의 최대공약수 : " + result1);
		System.out.println("두 수의 최소공배수 : " + result2);
	}

}
