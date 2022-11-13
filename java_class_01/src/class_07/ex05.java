package class_07;

class Car2 {
	String color;
	int speed;
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
}

public class ex05 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.color = "빨강";
		myCar.speed = 100;
		System.out.println("내 자동차 색상 : " + myCar.color);
		System.out.println("내 자동차 속도 : " + myCar.speed);
		System.out.println();
		System.out.println("파랑");
		System.out.println("120");
		
	}

}
