package day12.sub;

/*
	랜덤하게 0 ~ 2 정수를 발생시켜서
		0 이 나오면 삼각형
		1 가 나오면 사각형
		2 가 나오면 원
	의 형태로 10개의 도형을 만들어서
	하나의 변수로 관리하고
	각 도형의 내용을 출력하세요.
*/
public class Ex01 {
	Figure[] f;
	public Ex01() {
		setFig();
		figPrint();
	}
	// fig 배열 출력함수
	public void figPrint() {
		for(Figure fig : f) {
			fig.toPrint();
		}
	}
	
	
	// fig 배열 초기화
	public void setFig() {
		f = new Figure[10];
		for(int i = 0; i < f.length; i++) {
			// 랜덤 0 ~ 2 정수 뽑기
			int no = getRand();
			
			// 0 ~ 2 일때 데이터
			switch(no) {
			case 0:
				// Semo : 삼각형
				f[i] = new Semo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
				break;
			case 1:
				// Nemo : 사각형
				f[i] = new Nemo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
				break;
			case 2:
				// Won : 원
				f[i] = new Won((int)(Math.random() * 21 + 5));
				break;
			}
			
		}
	}
	
	// 랜덤 0 ~ 2 정수 뽑기
	public int getRand() {
		return (int)(Math.random() * 3);
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
