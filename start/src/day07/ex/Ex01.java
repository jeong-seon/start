package day07.ex;

import java.util.Arrays;

/*
	Ex01 ]
		'A' ~ 'J' 까지의 문제를 랜덤하게 100개를 만들고
		각 문자의 출현 횟수를 기억할 배열을 만들어서
		횟수만큼 "*" 로 출력해주는 프로그램을 작성하세요.
		
		예 ]
			
			A [5]	: *****
			B [20]	: ********************
			...
			J [7]	: *******
 */
public class Ex01 {

	public static void main(String[] args) {
		// 배열		
		int[] cntCount = new int[10];

		// 랜덤수 100개
		for (int i = 0; i < 100; i++) {
			char ch = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			cntCount[ch - 'A'] += 1;
		}		
		
		for (int i = 0; i < cntCount.length; i++) {
			System.out.print("\n" + (char)('A' + i) + " [ " + cntCount[i] + " ] : ");
			for(int j = 0; j < cntCount[i]; j++) {		
				System.out.print("*");
			}
		}
	}

}
