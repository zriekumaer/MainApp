package com.ust.UserAuthentication.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.ust.UserAuthentication.Entity.User;
import com.ust.UserAuthentication.repo.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	public UserRepository getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public boolean validateUser(String userName, String password) {
		User user = userRepo.findByUsername(userName);
		if (user != null) {
			return user.getPassword().equals(password);
		} else {
			return false;
		}
	}

}
