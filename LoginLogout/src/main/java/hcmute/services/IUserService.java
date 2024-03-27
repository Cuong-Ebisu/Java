package hcmute.services;

import hcmute.models.UserModel;

public interface IUserService {
	String signup(UserModel model);
	String login(String username, String password);
}
