package homeworkNLayerProject.dataAccess.abstracts;

import java.util.List;

import homeworkNLayerProject.entities.concretes.User;

public interface UserDao {
		void register(User user);
		List<User> getAll();
}
