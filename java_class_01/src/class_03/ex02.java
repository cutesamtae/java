package class_03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		char gender = ' ';
		String ssn = " ";
		Scanner scan = new Scanner(System.in);
		ssn = scan.next();
		gender = ssn.charAt(7);
		switch(gender); {
			case '1':
			case '3':
				System.out.println("man");
			case'2':
			case'4':
				System.out.println("women");
	}
		

	}

}
