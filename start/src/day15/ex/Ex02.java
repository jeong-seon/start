package day15.ex;

/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서
	10개를 TreeSet 에 입력한 후
	내림차순으로 정렬해서 출력하세요.
 */
import java.util.*;

public class Ex02 {

	public Ex02() {
		TreeSet set = new TreeSet();
		
		
		TreeSet set1 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = (int)o1 - (int)o2;
				
				return -result;
			}
		});
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random() * 99 + 1);
			set.add(no);
			set1.add(no);
			
		}
//		for(int i = 0; i < 10; i++) {
//			set1.add((int)(Math.random() * 99 + 1));
//			
//		}
		
		System.out.println("========== 내림차순 정렬 전 ===========");
		System.out.println(set);
		System.out.println();
		System.out.println("========== 내림차순 정렬 후 ===========");
		System.out.println(set1);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
