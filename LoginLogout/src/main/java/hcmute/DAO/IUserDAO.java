package hcmute.DAO;

import hcmute.models.UserModel;

public interface IUserDAO {
	String signup(UserModel model);
	String login(String username, String password);
}
