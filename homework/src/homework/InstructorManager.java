package homework;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" E�itmeni ba�ar� ile eklenmi�tir.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" E�itmeni ba�ar� ile silinmi�tir.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" E�itmeni ba�ar� ile g�ncellenmi�tir.");
	}
	
}
