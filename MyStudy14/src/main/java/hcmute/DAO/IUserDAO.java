package hcmute.DAO;

import java.util.List;

import hcmute.entity.User;

public interface IUserDAO {
	void insert(User user);
	void update(User user);
	void delete(int id) throws Exception;
	List<User> findAll();
	List<User> findAll(int page, int pagesize);
	User findByID(int id);
	User findByEmail(String email);
	int count();	
	void insertRegister(User user);
	boolean checkExistUserEmail(String emai);
}
