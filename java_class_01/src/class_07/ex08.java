package class_07;

class Student2 {
	String school = "Sangwon Univ.";
	int studentID;
	String name;
	int age;
	
	public Student2() {}
	public Student2(int studentID) {
		this();
	}
	
	public Student2(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public Student2(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
}

public class ex08 {

	public static void main(String[] args) {
		Student2 student = new Student2(202244825, "김미현", 17);
	}

}
