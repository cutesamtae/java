package class_01;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		String str = (10<30) ? "10이 30보다 작습니다" : "10이 30보다 큽니다";
		System.out.println(str);
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100까지의 정수 중 하나를 입력해주세요");
		System.out.println((su >= 80) ? "합격입니다" : "불합격입니다");
		scan.close();
	}

}
