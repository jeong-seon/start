package day16.ex;

/*
	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 수 만큼의 학생의 점수를 기억하는
	HashMap 을 만들어서 데이터를 기억시키고
	꺼내서 출력하세요.
	데이터를 꺼낼 때 키를 모두 추출해서 꺼내는 방식으로 출력하세요.
 */
import java.util.*;

public class Ex01 {

	public Ex01() {		
		int no = setNum();
		HashMap map = new HashMap();

		
		for (int i = 1; i <= no; i++) {
			map.put(i, setScore());
			
		}
		Set set = map.keySet();
		
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			Object obj = itor.next();
			int key = (int) obj;
			int value = (int) map.get(key);
			System.out.println("학생 " + key + " : " + value);
		}
		
//		System.out.println();
//		System.out.println(no);
		
	}

	public int setNum() {
		int result = (int)(Math.random() * (10 - 5 + 1) + 5);
		
		return result;
	}
	public int setScore() {
		int result = (int)(Math.random() * 41 + 60);
		return result;
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
