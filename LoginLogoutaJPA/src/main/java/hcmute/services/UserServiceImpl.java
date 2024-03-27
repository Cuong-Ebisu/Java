package hcmute.services;

import hcmute.DAO.IUserDAO;
import hcmute.DAO.UserDAOImpl;
import hcmute.Entity.User;


public class UserServiceImpl implements IUserService{

	IUserDAO userDAO = new UserDAOImpl();
	@Override
	public String signup(User model) {
		return userDAO.signup(model);
	}
	@Override
	public String login(String username, String password) {
		return userDAO.login(username, password);
	}
	
}
