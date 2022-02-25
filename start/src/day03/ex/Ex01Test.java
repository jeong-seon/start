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
import javax.swing.*;
public class Ex01Test {
	public static void main(String[] args) {
		// 길이를 입력 받을 메세지박스
		String garo = JOptionPane.showInputDialog("가로의 길이를 입력하세요");
		String sero = JOptionPane.showInputDialog("세로의 길이를 입력하세요");
		
		// 가로 세로 길이를 int 형 데이터로 파싱
		int width = Integer.parseInt(garo);
		int height = Integer.parseInt(sero);
		
		// 길이를 출력 받을 메세지박스
		JOptionPane.showMessageDialog(null, "가로 : " + garo + "cm");
		JOptionPane.showMessageDialog(null, "세로 : " + sero + "cm");
		
		// 사각형 넓이 공식
		int sagak = width * height;
		
		// 삼각형 넓이 공식
		double samgak = width * height * 0.5;
		
		// 출력
		JOptionPane.showMessageDialog(null, "사각형 넓이 : " + sagak + "cm²");
		JOptionPane.showMessageDialog(null, "삼각형 넓이 : " + samgak + "cm²");
	}
}
