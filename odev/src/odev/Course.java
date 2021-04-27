package odev;

public class Course {
	public Course() 
	{
		
	}
	
	public Course(int id,String courseName,int complationStatus,String teacherName) 
	{
		this();
		this.id=id;
		this.courseName=courseName;
		this.complationStatus=complationStatus;
		this.teacherName=teacherName;
	}
	
	int id;
	String courseName;
	int complationStatus;
	String teacherName;
}
