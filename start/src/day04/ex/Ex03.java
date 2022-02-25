package day04.ex;

/*
	문제 3 ]
		게시물을 게시판에 출력하는데
		하나의 페이지에 게시물을 15개를 출력할 예정이다.
		게시물 수를 랜덤하게 발생시켜서
		게시판의 페이지가 몇페이지가 필요한지를 계산해서
		출력해주는 프로그램을 작성하세요.
		
		참고 ]
			게시물이 없는 경우는
			게시물이 없는 페이지가 적어도 1페이지는 필요하다.
			
 */
public class Ex03 {
	public static void main(String[] args) {
		// 랜덤수 발생
		int num = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		// 게시물 페이지 변수 선언
		int page = 1;
		
		// 게시물 페이지 판별
		int result = (num <= 15) ? (page) : 
						(num <= 30) ? (page + 1) : 
						(num <= 45) ? (page + 2) : 
						(num <= 60) ? (page + 3) : 
						(num <= 75) ? (page + 4) : 
						(num <= 90) ? (page + 5) : 
						(num <= 105) ? (page + 6) : (page);
		
		// 게시물 페이지 계산 후 출력
		System.out.println("페이지 1개당 최대 게시물 수 : 15 개");
		System.out.println("게시물 수 : " + num + " 개");
		System.out.println("필요한 페이지 수 : " + result + " 페이지");
	}
}
