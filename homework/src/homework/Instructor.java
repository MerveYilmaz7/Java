package homework;

public class Instructor {
	int id;
	String instuctorName;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String instructorName) {
		super();
		this.id=id;
		this.instuctorName=instructorName;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getInstructorName() {
		return this.instuctorName;
	}
	
	public void setInstructorName(String instructorName) {
		this.instuctorName=instructorName;
	}
}

