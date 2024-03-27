package hcmute.services;

import hcmute.DAO.IUserDAO;
import hcmute.DAO.UserDAOimpl;

public class UserService implements IUserService{

	IUserDAO userDAO = new UserDAOimpl();
	@Override
	public boolean login(String name, String password) {
		return userDAO.login(name, password);
	}

}
