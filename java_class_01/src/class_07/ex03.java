package class_07;

public class Student {
	int studentID;
}

public void study() {
	String place = "도서관";
	
}

public void profile() {
	System.out.println("학번 : " + studentID);
	System.out.println("이름 : " + name);
}

public class ex03 {

	public static void main(String[] args) {
		student student = new Student();
		System.out.println(student.studentID);
		System.out.println(student.name);
		System.out.println();
		student.study();
		student.profile();
		
	}

}
