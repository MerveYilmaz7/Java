package homework;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+" ��renci ba�ar� ile eklenmi�tir.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" ��renci ba�ar� ile silinmi�tir.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName()+" ��renci ba�ar� ile g�ncellenmi�tir.");
	}
}
