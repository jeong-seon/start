package day05.ex;

/*
	1 ~ 10 까지의 합을 구해서 출력해주는 프로그램을 작성.
	
	힌트 ]
		합은 결과값 변수로 만들어서 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 결과값 변수 만들고
		int hap = 0;
		
		// 반복해서 누적 대입
		for (int i = 0 ; i < 10 ; i++) {
			hap = hap + (i + 1);
		}
		
		// 결과 출력
		System.out.println("1 ~ 10 까지의 합은 " + hap + " 입니다.");
		
		int gop = 1;
		for (int i = 0 ; i < 10 ; i++) {
			gop = gop * (i + 1);
		}
		
		System.out.println("1 ~ 10 까지의 곱은 " + gop + "입니다.");
	}
}
