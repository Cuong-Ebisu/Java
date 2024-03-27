package hcmute.DAO;

import java.util.List;

import hcmute.models.UserModel;

public interface IUserDAO {
	List<UserModel> getUser(int start, int total);
	
	int countUser();
}
