package day05.ex;
/*
	문제 15 ]
		구구단을 다음 형식으로 출력하세요.
		
		2 x 1 = 2		3 x 1 = 3		4 x 1 = 4		5 x 1 = 5
		2 x 2 = 4		3 x 2 = 6		4 x 2 = 8		5 x 2 = 10
		2 x 3 = 6		3 x 3 = 9		4 x 3 = 12		5 x 3 = 15
		...
		2 x 9 = 18		3 x 9 = 27		4 x 9 = 36		5 x 9 = 45
		
		6 x 1 = 2		7 x 1 = 7		8 x 1 = 8		9 x 1 = 9
		6 x 2 = 12		7 x 2 = 14		8 x 2 = 16		9 x 2 = 18
		6 x 3 = 18		7 x 3 = 21		8 x 3 = 24		9 x 3 = 27
		...
		6 x 9 = 54		7 x 9 = 63		8 x 9 = 72		9 x 9 = 81
 */
public class Ex15 {
	public static void main(String[] args) {
		// 곱할 수
		for (int i = 1 ; i <= 9 ; i++) {
		// x단
			for (int j = 2 ; j <= 5 ; j++) {
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1 ; i <= 9 ; i++) {
			for (int j = 6 ; j <= 9 ; j++) {
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
