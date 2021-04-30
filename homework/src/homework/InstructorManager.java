package homework;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" Eðitmeni baþarý ile eklenmiþtir.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" Eðitmeni baþarý ile silinmiþtir.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getInstructorName()+" Eðitmeni baþarý ile güncellenmiþtir.");
	}
	
}
