package day11;

public class Nemo01 extends Moyang {
	private int garo, sero;
	private double area;
	
	public Nemo01() {}
	public Nemo01(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {	// 오버로딩
		area = garo * sero;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("가로가 %8d 이고, 세로가 %6d 이고, 넓이가 %7.2f 인 사각형\n", garo, sero, area);
	}
	
}
