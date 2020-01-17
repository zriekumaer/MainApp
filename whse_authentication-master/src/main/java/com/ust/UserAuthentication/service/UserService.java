package com.ust.UserAuthentication.service;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public boolean validateUser(String userName, String password);
}
