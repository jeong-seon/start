package day14.ex;

public class Circle {
	private int rad;
	private double arround, area;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "원 - 반지름 : " + rad + " , 둘레 : " + arround + " , 면적 : " + area;
//		return System.out.printf("원 - 반지름 : %3d , 둘레 : %6.2f , 면적 : %6.2f", rad, arround, area);
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		
		Circle nam = null;
		
		try {
			nam = (Circle) o;
		} catch (Exception e) {
			return false;
		}
		
		int namR = nam.getRad();
		
		bool = rad == namR;
		
		return bool;
	}
}
