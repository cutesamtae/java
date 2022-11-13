package class_06;

import java.util.Scanner;

public class ex07 {
	
	public static int randomNumber() {
		return (int)(Math.random() * 10) + 1;
	}
	
	public static String[] inputName(int number) {
		String[] names = new String[number];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1 + "번째 번호 입력 : ");
			names[i] = scan.next();
		}
		return names;
	}
	
	public static void namePrint(String[] names) {
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1 + "번째 이름 : " + names[i]);
		}
	}

	public static void main(String[] args) {
		int su = randomNumber();
		System.out.println("randomNumber 메소드로 얻은 점수 : " + su);
		String[] names = inputName(su);
		namePrint(names);
	}

}
