package class_06;

public class ex04 {
	
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static int add(int x, int y) {
		int result;
		result = x+y;
		return result;
	}

	public static void main(String[] args) {
		powerOn();
		int result = add(100,200);
		System.out.println("100 + 200 : " + result);
	}

}
