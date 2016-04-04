package com.chy.freemarker.dao.impl;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.chy.freemarker.dao.IUserDAO;
import com.chy.freemarker.entity.User;

@Service("userDAO")
public class UserDAOImpl extends HibernateDaoSupport implements IUserDAO {

	@Autowired
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void saveUser(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public void validateUser(User user) throws Exception {
		String hql = "select count(*) from User where name=? and password=?";
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getHibernateTemplate().find(hql, user.getName(), DigestUtils.md5Hex(user.getPassword()));
		if(users == null ||users.size() == 0)
			throw new Exception("用户名或密码不正确");
	}

}
