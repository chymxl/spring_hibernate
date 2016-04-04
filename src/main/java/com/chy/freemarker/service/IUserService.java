package com.chy.freemarker.service;

import com.chy.freemarker.entity.User;

public interface IUserService {

	void saveUser(User user);
	
	void validateUser(User user) throws Exception;
	
}
