package hcmute.services;

import java.util.List;

import hcmute.DAO.IUserDAO;
import hcmute.DAO.UserDAOImpl;
import hcmute.entity.User;

public class UserServiceImpl implements IUserService {
	IUserDAO userDao = new UserDAOImpl();
	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(int id) throws Exception {
		userDao.delete(id);
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

	@Override
	public List<User> findAll(int page, int pagesize) {
		// TODO Auto-generated method stub
		return userDao.findAll(page, pagesize);
	}

	@Override
	public User findByID(int id) {
		// TODO Auto-generated method stub
		return userDao.findByID(id);
	}

	@Override
	public boolean register(String email, String passwd, String fullname, String code) {
		if (userDao.checkExistUserEmail(email)) {
			return false;
		}
		userDao.insertRegister(new User(email, passwd, fullname, code));
		return true;
	}

	@Override
	public boolean checkExistUserEmail(String emai) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User login(String email, String passwd) {
		User user = this.findByEmail(email);
		if (user != null && passwd.equals(user.getPasswd())) {
			return user;
		}
		return null;
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

}
