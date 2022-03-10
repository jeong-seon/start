package day11;

/*
	사각형의 정보를 기억할 클래스 Nemo를 정의하고
	필요한 데이터를 입력해서 가로, 세로가 객체가 되는 순간 입력이 되도록 하고
	그 클래스의 객체를 5개를 관리할 배열을 만들고
	배열이 완성되면 출력하세요.
 */

/**
 * 
 * @author	JSW
 * @since	2022/03/10
 * @version	v.1.0
 */

public class Nemo {
	private int height, width, area, rank;
	
	// 기본생성자
	public Nemo() {
		
	}
	
	// 입력받은 데이터를 세팅해서 객체로 만들 수 있는 생성자
	public Nemo(int height, int width) {
		this.height = height;
		this.width = width;
		setArea();
		rank = 1;
	}
	
	public void setArea() {
		area = height * width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Nemo [height=" + height + ", width=" + width + ", area=" + area + "]";
	}
	

}
