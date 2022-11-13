package class_07;

class Student {
	String school = "ITSchool";
	int studentID;
	String name;
	int age;
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		helloStudent();
	}
	public void helloStudent() {
		System.out.println(name + "님 안녕하세요");
	}
}

public class ex07 {

	public static void main(String[] args) {
		Student student = new Student(202246957, "김지현", 17);
		System.out.println("학교명 : " + student.school);
		System.out.println("학번 : " + student.studentID);
		System.out.println("이름 : " + student.name);
		System.out.println("나이 : " + student.age);
		
	}

}
