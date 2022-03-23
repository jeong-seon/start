package day18;

public class Test13 {

	public Test13() {
		Sun sun = new Sun();
		Sky sky = new Sky();
		// 일반 클래스 new 시킨 것과 같다.
		
		// New Born 상태로 만들어준다.
		Thread t1 = new Thread(sun);
		Thread t2 = new Thread(sky);
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();		
	}

	public static void main(String[] args) {
		new Test13();
	}

}

class Sun implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("선우씨가 자바를 " + (i + 1) + " 번째 코딩합니다.");
			// 한번 출력하면 비록 시간이 남았지만...
			// 이번에는 아예 Block 상태로 보낸다.
			// 복귀 시간을 정해서 보낸다.
			try{
				Thread.sleep(1000);	// 복귀 시간은 1초로 한다.
			}catch (Exception e) {
				
			}
		}
	}
}

class Sky implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t하늘씨가 " + (i + 1) + " 번째 복습을 합니다.");
			try {
				Thread.sleep(1000);	// 1초 후 Block 상태에서 Runnable 상태로 전위.
			}catch (Exception e) {}
		}
	}	
}