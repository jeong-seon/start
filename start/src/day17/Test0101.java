package day17;

import java.io.*;

public class Test0101 {

	public Test0101() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("src/day17/result/writerTest01.txt");
			bw = new BufferedWriter(fw);
			
			String str = "대한민국 만세";
			
			
			bw.write(str);
			
			bw.flush();
			
			System.out.println("writer 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test0101();
	}

}
