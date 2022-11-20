package class_09;

class Outer1 {
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥틀래스 메소드");
	}
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	class Inner1 {
		private int y = 300;
		
		public void disp() {
			
		}
	}
}

public class ex01 {

	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		
		Outer1.Inner1 inner = outer.new Inner1();
		
		inner.disp();
	}

}
