import java.util.ArrayList;
public class Lab19_part2 {
		public static void main(String[] args) {
			Course1 course = new Course1("CSE 114");
			course.addStudent("Peter Jones");
			course.addStudent("Kim Smith");
			course.addStudent("Anne Kennedy");
			course.dropStudent("Peter Jones");
			ArrayList<String> students = course.getStudents();
			System.out.println("Students in CSE114");
			System.out.println(students);
		}
	}
	class Course1{
		private String courseName;
		private int numberOfStudents;
		private ArrayList<String> students = new ArrayList<>();
		public Course1(String courseName) 
		{
			this.courseName = courseName;
		}
		public void addStudent(String student) {
			students.add(student);
			numberOfStudents++;
		}
		
		public ArrayList<String> getStudents() {
			return students;
		}
		public int getNumberOfStudents() {
			return numberOfStudents;
		}
		public String getCourseName() {
			return courseName;
		}
		public void dropStudent(String student) 
		{
			students.remove(student);
			numberOfStudents--;
		}
		public void clear() {
			students.clear();
			numberOfStudents = 0;
		}
	}
