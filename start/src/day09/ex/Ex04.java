package day09.ex;

/*
	문제 4 ]
		1차원 배열에 정수 10개를 입력한 후
		합계와 평균을 구해주는 프로그램을 작성하세요.
		
		배열에 정수를 랜덤하게 채워주는 함수
		합계를 계산해주는 함수
		평균을 계산해주는 함수
		출력 함수
 */

public class Ex04 {

	public Ex04() {
		int[] score = makeInt();
		int sum = intSum(score);
		double avg = intAvg(score);
		toPrint(score, sum, avg);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

	// 배열에 랜덤 정수 입력
	public int[] makeInt() {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			int no = (int)(Math.random() * 100 + 1);
			num[i] = no;
			
		}
		return num;
	}
	// 합계
	public int intSum(int[] no) {

		int sum = 0;
		for (int i = 0; i < no.length; i++) {
			sum += no[i];
		}
		return sum;
	}
	
	// 평균
	public double intAvg(int[] no) {
		double avg = 0;
		
		int sum = intSum(no);
		avg = sum / (double)no.length;
		
		return avg;
	}
	
	// 출력
	public void toPrint(int[] no1, int no2, double no3) {
		
		System.out.print("1 ~ 100 까지의 정수 : ");
		for(int i = 0; i < no1.length; i++) {
			System.out.print(no1[i] + " | ");
			
		}
		System.out.println();
		System.out.println("합계 : " + no2);
		System.out.println("평균 : " + no3);
		
	}
}
