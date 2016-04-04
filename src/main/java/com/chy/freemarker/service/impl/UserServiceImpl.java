package com.chy.freemarker.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chy.freemarker.dao.IUserDAO;
import com.chy.freemarker.entity.User;
import com.chy.freemarker.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	@Resource(name = "userDAO")
	private IUserDAO userDao;
	
	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public void validateUser(User user) throws Exception {
		userDao.validateUser(user);
		
	}

}
