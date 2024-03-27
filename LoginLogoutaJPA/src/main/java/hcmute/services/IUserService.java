package hcmute.services;

import hcmute.Entity.User;

public interface IUserService {
	String signup(User model);
	String login(String username, String password);
}
