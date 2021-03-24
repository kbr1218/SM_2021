public class Teacher extends Members {
	//Chapter3 OPP - 3.3 Inheritance : Lab2-1 (2) Teacher

	String dept;
	Members students[];
	
	public Teacher (String name, String idnum, String dept) {
		super(name, idnum);
		this.dept = dept;
	}

	public void setStudents(Members sub[]) {
		students = sub;
	}
	
	public void work() {
		System.out.println("Teacher: \"" + name + "\"studies hard with his students in " + dept + " dept.");
	}
}
