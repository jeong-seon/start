package day04.ex;

/*
	문제 5 ]
		3 자리 숫자 (100 ~ 999)를 입력받아서
		이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
		얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
		
		예 ]
			241 은 200 에 가까우므로 41을 빼야한다.
			777 은 800 에 가까우므로 23을 더해준다.
 */
public class Ex05 {
	public static void main(String[] args) {
		// 랜덤수 발생
		int num = (int)(Math.random() * ( 999 - 100 + 1) + 100);
		
		// 랜덤수 출력
		System.out.println("     랜덤으로 발생한 3자리 숫자     : " + num + " 입니다.");
		
		// 100으로 나눈 나머지 수
		int nam = num % 100;
		
		// 100의 배수 만들기
		int result = (num % 50) == 0 ? (num) :
						(num % 100) == 0 ? (num) :
						(num > 950) ? (num + (100 - nam)) :
						(num > 900) ? (num - nam) :
						(num > 850) ? (num + (100 - nam)) :
						(num > 800) ? (num - nam) :
						(num > 750) ? (num + (100 - nam)) :
						(num > 700) ? (num - nam) :
						(num > 650) ? (num + (100 - nam)) :
						(num > 600) ? (num - nam) :
						(num > 550) ? (num + (100 - nam)) :
						(num > 500) ? (num - nam) :
						(num > 450) ? (num + (100 - nam)) :
						(num > 400) ? (num - nam) :
						(num > 350) ? (num + (100 - nam)) :
						(num > 300) ? (num - nam) :
						(num > 250) ? (num + (100 - nam)) :
						(num > 200) ? (num - nam) :
						(num > 150) ? (num + (100 - nam)) : (num);
		
		// 데이터 출력
		System.out.println("=================== 계 산 중 ===================");
		System.out.println("3자리 숫자와 가장 가까운 100의 배수 : " + result + " 입니다.");
		
		
	}
}
