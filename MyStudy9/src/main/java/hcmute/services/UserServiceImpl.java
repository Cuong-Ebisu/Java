package hcmute.services;

import java.util.List;

import hcmute.DAO.IUserDAO;
import hcmute.DAO.UserDAOImpl;
import hcmute.models.UserModel;

public class UserServiceImpl implements IUserService{

	IUserDAO userDAO = new UserDAOImpl();
	@Override
	public List<UserModel> getUser(int start, int total) {
		return userDAO.getUser(start, total);
	}

	@Override
	public int countUser() {
		return userDAO.countUser();
	}

}
