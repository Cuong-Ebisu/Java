package hcmute.DAO;

import hcmute.Entity.User;

public interface IUserDAO {
	String signup(User model);
	String login(String username, String password);
}
