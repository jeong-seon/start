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

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		// 랜덤수 발생
		int num = (int)(Math.random() * ( 999 - 100 + 1) + 100);
		
		// 랜덤수 출력
		System.out.println("     랜덤으로 발생한 3자리 숫자     : " + num + " 입니다.");
		
		// 100으로 나눈 나머지 수
		int nam = num % 100;
		
		// 100의 배수 만들기						
		int result = (nam == 0) ? (num) : (nam > 50) ? (num + (100 - nam)) : (num - nam);
		
		// 데이터 출력
		System.out.println("=================== 계 산 중 ===================");
		System.out.println("3자리 숫자와 가장 가까운 100의 배수 : " + result + " 입니다.");
		
		// 세자리 정수를 입력
		String sno = JOptionPane.showInputDialog("세자리 정수 입력 : ");
		
		// 입력받은 데이터는 정수형태의 문자열이므로 정수로 변환해줘야 한다.
		// 정수 형태의 문자열을 정수로 변환해주는 기능을 가지고있는 함수는
		// Integer.parseInt(문자열);
		int no = Integer.parseInt(sno);
		
		// 10단위 이하만 추출해낸다.
		int num1 = no % 100;
		
		// num1 이 50보다 큰지 판별한다.
		int hap = 0;
		int result1 = 0;
		
		hap = (num1 > 50) ? (100 - num1) : (num1);
		
//		result1 = (num1 > 50) ? (num1 + hap) : (num1 - hap);
		result1 = (num1 > 50) ? (num1 / 100 + 1) * 100 : (num1 / 100) * 100;
		
		String str = num1 > 50 ? "더해줘야한다." : "빼줘야한다.";
		
		// 출력
		System.out.println("입력한 정수 " + no + " 는 " + result1 + " 에 가까우므로 " + hap + " 을 " + str);
	}
}
