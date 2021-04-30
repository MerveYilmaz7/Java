package homework;

public class Main {

	public static void main(String[] args) {
		User user1=new User("Merve","123456");
		Instructor instructor1=new Instructor(5,"Melike");
		Student student1=new Student(1,"Seher","Yılmaz");
		
		UserManager userManager=new UserManager();
		userManager.login(user1);

	}

}
