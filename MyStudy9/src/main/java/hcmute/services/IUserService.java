package hcmute.services;

import java.util.List;

import hcmute.models.UserModel;

public interface IUserService {
	List<UserModel> getUser(int start, int total);

	int countUser();
}
