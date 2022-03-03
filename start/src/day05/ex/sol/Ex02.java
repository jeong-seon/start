package day05.ex.sol;
/*
	문제 2 ]
		'A' 부터 문자를 10개 만들어서 출력하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		int i = 0;
		for (i = 0 ; i < 10 ; i++) {
			char ch = 'A';
			System.out.print((char)(ch + i) + " ");
			
		}
		System.out.println();
		System.out.println("### i : " + i);
	}
}
