package oopHomework1;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category(1,"Programlama");
		Instructor instructor1=new Instructor(1,"Enes Ayy�ld�z");
		Course course1= new Course(1,"Django Kampi",1,1,"Yakla��k 2 ay s�recek bu kampda ��renciler django teknolojisini t�m incelikleri ile ��renecek");
		Student student1=new Student(1,"Engin" ,"Demiro�","engindemirog@gmail.com","12345");
		
		EnrolManager enrolManager=new EnrolManager();
		enrolManager.Enrol(student1,course1);
		
		
		
	}

}
