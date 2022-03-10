package day11;


public class Test00_03 {
	Nemo[] sagak;
	
	public Test00_03() {
		// 배열 세팅
		setSagak();
		
		// rank 순위 결정하고
		setRank();
		
		
		// 출력
		toPrint();
	}
	
	// 배열 세팅해주는 함수
	public void setSagak() {
		sagak = new Nemo[5];
		for (int i = 0; i < sagak.length; i++) {
			sagak[i] = new Nemo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
		}
		// 세팅한 후 정렬
		setSort();
	}
	
	// rank 결정해주는 함수
	public void setRank() {
		// 할 일
		for (int i = 0; i < sagak.length; i++) {
			// 각 네모를 꺼내고
			Nemo n = sagak[i];
			
			// 꺼낸 네모의 면적 꺼내고
			int me = n.getArea();
			
			
			// 다른 네모들과 면적 비교해서 순위 수정하고
			for (int j = 0; j < sagak.length; j++) {
				// 꺼낸 네모의 순위를 꺼내고
				int na = n.getRank();
				
				// 다른 네모의 면적 꺼내고
				int you = sagak[j].getArea();
				
				if (me < you) {
					n.setRank(na + 1);
				}
			}
		}
		
	}
	
	// (숙제) 네모 순위별로 정렬해서 기억시키고 출력
	public void setSort() {
		for (int i = 0; i < sagak.length - 1; i++) {
			
			for (int j = i + 1; j < sagak.length; j++) {
				int pre = sagak[i].getArea();
				int post = sagak[j].getArea();
				if (post > pre) {
					int tmp = pre;
					pre = post;
					post = tmp;
					
					setSagak();
				}
			}
		}
	}

	
	// 배열의 내용 출력해주는 함수
	public void toPrint() {
		for (int i = 0; i < 5; i++) {
			Nemo n = sagak[i];
			
			int height = n.getHeight();
			int width = n.getWidth();
			int area = n.getArea();
			int rank = n.getRank();
			
			// 출력
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 이고 %2d 번째로 큽니다.", height, width, area, rank);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Test00_03();
	}

}
