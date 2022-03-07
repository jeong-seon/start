package day09.ex;

/*
	문제 2 ]
		반지름 하나를 랜덤하게 입력한 후
		원의 넓이
		원의 둘레
		를 계산해서
		출력하는 프로그램을 작성하세요.
		
		반지름 랜덤하게 만들어주는 함수
		원의 넓이 계산함수, 원의 둘레 계산함수, 출력 함수
		를 각각 만들어서 작성하세요.
 */

public class Ex02 {

	public Ex02() {
		int ban = oneBan();
		double nual = oneNual(ban);
		double dul = oneDul(ban);
		
		toPrint(ban, nual, dul);
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
	
	public int oneBan() {
		int banG = (int)(Math.random() * 10 + 1);
		
		return banG;
	}
	
	public double oneNual(int ban) {
		double result = ban * ban * 3.14;
		return result;
	}

	public double oneDul(int ban) {
		double result = ban * 2 * 3.14;
		return result;
	}
	
	public void toPrint(int no1, double no2, double no3) {
		System.out.println("원의 반지름 : " + no1);
		System.out.println("반지름 : " + no1 + "\t원의 넓이 : " + no2 + "\t원의 둘레 : " + no3);
	}

}
