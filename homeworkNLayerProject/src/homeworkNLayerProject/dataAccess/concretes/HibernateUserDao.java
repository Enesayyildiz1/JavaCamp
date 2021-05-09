package homeworkNLayerProject.dataAccess.concretes;
import java.util.ArrayList;
import java.util.List;

import homeworkNLayerProject.dataAccess.abstracts.UserDao;
import homeworkNLayerProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	public List<User> users;
	public HibernateUserDao() {
		
		this.users = new ArrayList<User>();
	}

	@Override
	public void register(User user) {
		System.out.println(user.getName()+"Kayýt Baþarýlý");
		this.users.add(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		
		return this.users;
	}

	

}
