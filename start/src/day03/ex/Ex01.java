package day03.ex;

/*
	문제 1 ]
		두 개의 숫자를 입력받은 후 (가로, 세로)
		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를
		구해서 결과를 출력하세요.
		
		출력형식 ]
			가로 : xxx
			세로 : xxx
			사각형 넓이 : xxx		=> 가로 x 세로
			삼각형 넓이 : xxx.x		=> 밑변 x 높이 x 1/2
	참고 ]
		자바에서 * 기호의 의미
			1. 연산자로서 곱하기의 의미
			2. 모든것을 뜻하는 의미
 */
//import javax.swing.*;
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		int width = sc.nextInt();
		
		// 출력
		System.out.println("가로 : " + width + "cm");
		
		// 메세지 출력
		System.out.print("세로 : ");
		int sero = sc.nextInt();
		
		System.out.println("세로 : " + sero + "cm");
		
		// 사각형 넓이
		int sagak = width * sero;
		System.out.println("사각형의 넓이 : " + sagak + "cm²");
		
		// 삼각형 넓이
		double samgak = width * sero * 0.5;
		System.out.println("삼각형의 넓이 : " + samgak + "cm²");
		
		/*
			정수로 입력받는 방법
			
			int 변수이름 = sc.nextInt();
		 */

		/*
		// 입력메세지 출력
		System.out.print("가로 : ");
		String garo = sc.nextLine();	// 문자열로 입력받는 방법
		// 문자형태의 문자열을 정수로 변환하는 방법
		// Integer.parseInt(문자열);
		int width = Integer.parseInt(garo);
		
		// 출력
		System.out.println("입력된 가로 : " + (garo + 20));
		System.out.println("입력된 정수 가로 : " + (width + 20));
		*/
		/*
		// 가로 : width, 세로 : heigth
		int width = sc.nextInt();
		int height = sc.nextInt();
		String garo = JOptionPane.showInputDialog("가로의 길이를 입력하세요");
		String sero = JOptionPane.showInputDialog("세로의 길이를 입력하세요");
		JOptionPane.showMessageDialog(null, "가로 : " + garo);
		JOptionPane.showMessageDialog(null, "세로 : " + sero);
		*/
	}
}
