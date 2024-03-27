package hcmute.services;

import hcmute.DAO.IUserDAO;
import hcmute.DAO.UserDAOImpl;
import hcmute.models.UserModel;

public class UserServiceImpl implements IUserService{

	IUserDAO userDAO = new UserDAOImpl();
	@Override
	public String signup(UserModel model) {
		return userDAO.signup(model);
	}
	@Override
	public String login(String username, String password) {
		return userDAO.login(username, password);
	}
	
}
