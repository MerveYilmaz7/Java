package odev;

public class Main {

	public static void main(String[] args) {

		Course course1=new Course(1,"Java",98,"Engin Demiroğ");
		
		Course course2=new Course(); 
		{
			course2.id=2;
			course2.courseName="C#";
			course2.complationStatus=100;
			course2.teacherName="Engin Demiroğ";
		}
		
		Course[] courses=new Course[] {course1,course2};
		for(Course course:courses) 
		{
			System.out.println("Kurs Adı: "+course.courseName+" "+"Kurs Tamamlanma Oranı: "+course.complationStatus+" "
	+"Kursun Eğitmeni: "+course.teacherName);
		}
		
		
		Teacher teacher1=new Teacher(1,"Engin Demiroğ");
		
		CourseManager courseManager=new CourseManager();
		courseManager.register(course1);
		courseManager.register(course2);
	}

}
