package oopHomework1;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category(1,"Programlama");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setName("Enes");
		instructor1.setLastName("Ayyýldýz");
		
		Course course1= new Course(1,"Django Kampi",1,1,"Yaklaþýk 2 ay sürecek bu kampda öðrenciler django teknolojisini tüm incelikleri ile öðrenecek");
		Student student1=new Student();
		student1.setName("Engin");
		student1.setId(2);
		student1.setLastName("Demiroð");
		student1.setEmail("endindemirog@gmail.com");
		student1.setPassword("12345");
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		instructorManager.add(instructor1);
		studentManager.add(student1);
		
		
	}

}
