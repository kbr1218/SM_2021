public class Student extends Members {
	//Chapter3 OPP - 3.3 Inheritance : Lab2-1 (2) Student
	//Members를 상속한 Student 만들기

	String dept;
	Members students[];
	
	public Student (String name, String idnum) {
		super(name, idnum);
	}

	public void study() {
		System.out.println("Teacher: \"" + name + "\"studies hard with his students in " + dept + " dept.");
	}
}

