package class_06;

public class ex02 {
	public static void hello() {
		int i = 0;
		while(i < 5) {
			System.out.println("안뇽하세요");
			i++;
			if(i==3) {
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		hello();
		System.out.println("main 메소드 입니다");
	}

}
