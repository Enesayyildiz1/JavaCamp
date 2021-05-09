package homeworkNLayerProject.business.abstracts;

import homeworkNLayerProject.entities.concretes.User;

public interface UserService {
	void login(String email,String password);
	void register(User user);
	boolean checkEmail(String email);
}
