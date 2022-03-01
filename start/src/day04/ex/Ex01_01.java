package day04.ex;

/*
	문제 1 ]
		1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜서
		그 수들 중 가장 큰 수, 중간수, 작은수를 구분해서 출력하는 프로그램을 작성하세요.
		
		단, 3항 연산자를 사용해서 처리하세요.

*/
public class Ex01_01 {
	public static void main(String[] args) {
		// 랜덤한 숫자 3개 발생
		int num1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int num2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int num3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		// 랜덤숫자 출력
		System.out.println("랜덤생성한 첫번째 수 : " + num1);
		System.out.println("랜덤생성한 두번째 수 : " + num2);
		System.out.println("랜덤생성한 세번째 수 : " + num3);
		
		// 숫자 크기 판별
        int big = ((num1 > num2) && (num1 > num3)) ? (num1) :
        			((num3 > num2) ? (num3) : (num2));

        int small = ((num2 > num1)) && (num3 > num1) ? (num1) :
        			((num2 > num3) ? (num3) : (num2));

        int mid = ((num1 > num2)) ? ((num1 > num3) ? ((num2 > num3) ? num2 : num3) : num1) : ((num2 > num3) ? ((num1 > num3) ? num1 : num3) : num2);
		
		// 출력
		System.out.println("가장 큰 수 : " + big + " 입니다.\n" + "중간 수 : " + mid + " 입니다.\n" + "가장 작은 수 : " + small + "입니다.");
	}
}
