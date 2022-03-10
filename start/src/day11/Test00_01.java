package day11;

// sagak 배열을 지역변수로 선언

public class Test00_01 {

	public Test00_01() {
		Nemo[] sagak = new Nemo[5];
		// 만들어진 배열에 사각형 채워주는 함수 호출
		setArr(sagak);
		
		// 출력
		toPrint(sagak);
	}
	
	// 넘겨받은 배열에 사각형 채워주는 함수 호출
	public void setArr(Nemo[] sagak) {
		// 할 일
		// 건네받은 배열의 길이만큼 먼저 네모객체 채워주고
		for (int i = 0; i < sagak.length; i++) {
			sagak[i] = new Nemo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
		}
	}
	
	// 출력
	public void toPrint(Nemo[] sagak) {
		for (int i = 0; i < sagak.length; i++) {
			Nemo n = sagak[i];
			
			int height = n.getHeight();
			int width = n.getWidth();
			int area = n.getArea();
			
			// 출력
			System.out.printf("이 사각형 %2d 은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.", i, height, width, area);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test00_01();
	}

}
