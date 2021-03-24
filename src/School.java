public class School {
//Chapter3 OPP - 3.3 Inheritance : Lab2-2 School

	Teacher yiyoon;
	Members kim, song, choi, lee;
	Members st;
	
	public School() {
		yiyoon = new Teacher("Yoon", "M10313", "IT 공학전공");
		kim = new Members("kim", "IT200324");
		song = new Members("song", "IT190324");
		choi = new Members("choi", "IT1800324");
	
		st = new Student("st", "ST001", "IT공학전공");
	}
		
	public void makeWork() {
		Student.study();
		}

	public static void main (String args[]) {
		School mycom = new School();
		mycom.makeWork();
	}
}
