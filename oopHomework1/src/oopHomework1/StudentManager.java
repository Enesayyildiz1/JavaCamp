package oopHomework1;

public class StudentManager extends UserManager{
	public void add(User user)
	{
		super.add(user);
		System.out.println(user.name+" öğrenci eklendi.");
		
	}
	
}
