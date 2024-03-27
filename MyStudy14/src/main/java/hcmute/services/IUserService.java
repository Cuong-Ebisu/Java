package hcmute.services;

import java.util.List;

import hcmute.entity.User;



public interface IUserService {
	void insert(User user);
	void update(User user);
	void delete(int id) throws Exception;
	List<User> findAll();
	List<User> findAll(int page, int pagesize);
	User findByID(int id);
	User findByEmail(String email);
	boolean register(String email, String passwd, String fullname, String code);
	boolean checkExistUserEmail(String emai);
	User login(String email, String passwd);
}
