package day05.ex;
/*
	1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.
	
	힌트 ]
		처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/
public class Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1 ; ; i++) {
			sum = sum + i;
			if(sum >= 5000) {
				System.out.println("처음 합이 5000을 초과하는 수 : " + i);
				break;
			}
		}

	}

}
