package homeworkNLayerProject;

import java.util.List;

import homeworkNLayerProject.business.concretes.UserManager;
import homeworkNLayerProject.core.concretes.EmailVerificationManager;
import homeworkNLayerProject.core.concretes.LoginUtilitiesManager;
import homeworkNLayerProject.core.concretes.jGoogleAdapter;
import homeworkNLayerProject.dataAccess.concretes.HibernateUserDao;
import homeworkNLayerProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"Enes","Ayyýldýz","enes@engin.com","1234568");
		User user2=new User(2,"edfds","Toraman","endsdses@engin.com","258757");
		
		
		
		UserManager manager=new UserManager(new HibernateUserDao(),new LoginUtilitiesManager(),new EmailVerificationManager(),new jGoogleAdapter());
		
		manager.register(user1);
		System.out.println("---------");
		manager.register(user2);
		
		System.out.println("---------");
		
		manager.login("enes@engin.com","1234568");

	}

}
