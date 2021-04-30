package homework;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName()+" Öðrenci baþarý ile eklenmiþtir.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" Öðrenci baþarý ile silinmiþtir.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName()+" Öðrenci baþarý ile güncellenmiþtir.");
	}
}
