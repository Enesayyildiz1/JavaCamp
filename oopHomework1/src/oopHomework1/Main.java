package oopHomework1;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category(1,"Programlama");
		Instructor instructor1=new Instructor(1,"Enes Ayyýldýz");
		Course course1= new Course(1,"Django Kampi",1,1,"Yaklaþýk 2 ay sürecek bu kampda öðrenciler django teknolojisini tüm incelikleri ile öðrenecek");
		Student student1=new Student(1,"Engin" ,"Demiroð","engindemirog@gmail.com","12345");
		
		EnrolManager enrolManager=new EnrolManager();
		enrolManager.Enrol(student1,course1);
		
		
		
	}

}
