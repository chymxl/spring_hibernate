package com.chy.freemarker.dao;

import com.chy.freemarker.entity.User;

public interface IUserDAO {
	void saveUser(User user);
	
	void validateUser(User user) throws Exception;
}
