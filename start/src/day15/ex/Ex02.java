package day15.ex;

/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서
	10개를 TreeSet 에 입력한 후
	내림차순으로 정렬해서 출력하세요.
 */
import java.util.*;

import day15.Circle;

public class Ex02 {
/*
	이 경우는 기존 가지고 있는 정렬기준을 바꾸는 작업이 되기때문에
	Comparator 를 트리셋을 만들 때 적용시켜서 만들면 된다.
 */

	public Ex02() {
		TreeSet set = new TreeSet();
		
		
		TreeSet set1 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int result = (int)o1 - (int)o2;
				
				return -result;
			}
		});
		while (true) {
			int no = (int)(Math.random() * 99 + 1);
			set.add(no);
			set1.add(no);
			
			if (set.size() == 10) {
				break;
			}
			if (set1.size() == 10) {
				break;
			}
			
		}
		for (Object o : set) {
			System.out.println(o);
		}
		
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
