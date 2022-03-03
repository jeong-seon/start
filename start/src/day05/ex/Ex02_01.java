package day05.ex;
/*
	Ex02_01 ]
		3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
		그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
		단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/

public class Ex02_01 {
	public static void main(String[] args) {
		// 랜덤정수 발생
		int num = (int)(Math.random() * (10 - 3 + 1) + 1);
		System.out.println("영어 단어의 길이 : " + num);

		// 랜덤영어 대문자
		char dae = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		System.out.print("영어 단어 : " + dae);

		// 랜덤영어 소문자
		for (int i = 1 ; i < num ; i++) {
			char soo = (char)(Math.random() * ('z' - 'a' + 1) + 'a');
			System.out.print(soo);
			
		}
	}
}