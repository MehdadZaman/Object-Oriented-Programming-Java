public class TestCourse {
	public static void main(String[] args) {
		
		Course course = new Course("CSE 114");
		course.addStudent("Peter Jones");
		course.addStudent("Kim Smith");
		course.addStudent("Anne Kennedy");
		course.dropStudent("Peter Jones");
		String[] students = course.getStudents();
		System.out.println("Students in CSE114");
		for(int i = 0; i < students.length; i++)
		{
			System.out.print(students[i] + ", ");
		}
		System.out.println();
		
	}
}
class Course{
	private String courseName;
	private int numberOfStudents;
	private String[] students = new String[numberOfStudents];
	public Course(String courseName) 
	{
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		String[] students_update = new String[students.length + 1];
		for(int i = 0; i < students.length; i++)
		{
			students_update[i] = students[i];
		}
		students_update[numberOfStudents] = student;		
		students = students_update; 
		numberOfStudents++;
	}
	
public String[] getStudents() {
		String[] newarr = new String[numberOfStudents];
		for(int i = 0, j = 0; i < students.length; i++, j++)
		{
			if(students[i]==null)
			{					
				j--;
			}
			else {
				newarr[j] = students[i];
			}
		}
	return newarr;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) 
	{
		for(int i = 0; i < students.length; i++)
		{
			if(students[i].equals(student))
			{
				students[i] = null;
			}
		}
		numberOfStudents--;
	}
	public void clear() {
		for(int i = 0; i < students.length; i++)
		{
			students[i] = null;
		}
		students = new String[0];
	}
}