package oopHomework1;

public class InstructorManager extends UserManager{
	public void add(User user)
	{
		super.add(user);
		System.out.println(user.name+" eðitmen eklendi.");
	}
	
}
