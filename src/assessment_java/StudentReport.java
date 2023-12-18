package assessment_java;
class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
}
class Classroom{
	public String registerStudent(Student student) {
		if(!student.name.matches(".*[A-Z].*")) {
			return "Block letter needed";
		}
		if(student.score < 0 || student.score >=100) {
			return "invalid Score";
		}
		else {
			return "Registered";
		}
	}
	public String studentCard(String card) {
		if(card.matches("\\d+")) {
			return "valid card";
		}
		else{
			return "Invalid card";
		}
	}
}

public class StudentReport {
	public static void main(String[] args) {
		Student obj =new Student("s",89);
		Classroom c =new Classroom();
		System.out.println(c.registerStudent(obj));
		System.out.println(c.studentCard("123"));
	}

}
