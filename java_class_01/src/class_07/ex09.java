package class_07;

class Car {
	private String color;
	private int speed;
	public Car(String color, int speed) {
		this.color = color;
		if(speed < 30 || speed > 200) {
			System.out.println("속도는 30~ 200 사이여야 합니다");
			System.out.println("속도를 30으로 설정합니다");
			this.speed = 30;
		} else {
			this.speed = speed;
		}
		carProfile();
	}
	public void carProfile() {
		System.out.println("자동차 색상 : ");
		System.out.println("자동차 속도 : " + speed);
	}
}

public class ex09 {

	public static void main(String[] args) {
		new Car("빨강", 70);
	}

}
