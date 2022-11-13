package class_06;

public class ex01 {

	public static void method1() {
		System.out.println("void 형 메소드는 돌려줄 값이 없음");
	}
	public static int method2() {
		int b = 100;
		System.out.println("리턴 타입은 int형인 메소드");
		return b;
	}
	public static void main(String[] args) {
		System.out.println("main 메소드");
		method1();
		int a = method2();
		System.out.println("method2에서 돌려준 값: " + a);
	}

}
