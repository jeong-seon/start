package day03.ex;

/*
	문제 3 ]
	
	84232원을 지불할려고 한다.
	우리나라 화폐단위로 이 금액을 지불하려면
	각 단위가 몇 개씩 필요한지 계산해서 출력하세요.
	
	화폐단위
		50000원
		10000원
		5000원
		1000원
		500원
		100원
		50원
		10원
		1원
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 현재 화폐 잔액
		int don = 84232;
		
		int temp = don;
		
		// 5만원권
		int oman = temp / 50000;
		// 5만원권을 제외한 금액을 기억
		temp = temp % 50000;
		
		// 1만원권
		int man = temp / 10000;
		// 1만원권을 제외한 금액을 기억
		temp = temp % 10000;
		
		// 5천원권
		int ochun = temp / 5000;
		// 5천원권을 제외한 금액을 기억
		temp = temp % 5000;
		
		// 1천원권
		int chun = temp / 1000;
		// 1천원권을 제외한 금액을 기억
		temp = temp % 1000;
		
		// 500원권
		int obeak = temp / 500;
		// 500원권을 제외한 금액을 기억
		temp = temp % 500;
		
		// 100원권
		int beak = temp / 100;
		// 100원권을 제외한 금액을 기억
		temp = temp % 100;
		
		// 50원권
		int oship = temp / 50;
		// 50원권을 제외한 금액을 기억
		temp = temp % 50;
		
		// 10원권
		int ship = temp / 10;
		
		// 1원권
		int il = temp % 10;
		
		System.out.println("돈 : " + don + "원");
		
		// 결과 출력
		System.out.println("5만원권 : " + oman + " 개");
		System.out.println("1만원권 : " + man + " 개");
		System.out.println("5천원권 : " + ochun + " 개");
		System.out.println("1천원권 : " + chun + " 개");
		System.out.println("500원권 : " + obeak + " 개");
		System.out.println("100원권 : " + beak + " 개");
		System.out.println("50원권 : " + oship + " 개");
		System.out.println("10원권 : " + ship + " 개");
		System.out.println("1원권 : " + il + " 개");
		
		/*
		System.out.println("50000원권 : " + (don / 50000) + "개");
		int don1 = don % 50000;
		System.out.println("10000원권 : " + (don1 / 10000) + "개");
		int don2 = don1 % 10000;
		System.out.println("5000원권 : " + (don2 / 5000) + "개");
		int don3 = don2 % 5000;
		System.out.println("1000원권 : " + (don3 / 1000) + "개");
		int don4 = don3 % 1000;
		System.out.println("500원권 : " + (don4 / 500) + "개");
		int don5 = don4 % 500;
		System.out.println("100원권 : " + (don5 / 100) + "개");
		int don6 = don5 % 100;
		System.out.println("50원권 : " + (don6 / 50) + "개");
		int don7 = don6 % 50;
		System.out.println("10원권 : " + (don7 / 10) + "개");
		int don8 = don7 % 10;
		System.out.println("1원권 : " + (don8 / 1) + "개");
		*/
	}
}
