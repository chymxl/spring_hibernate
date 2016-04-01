package com.chy.freemarker.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chy.freemarker.dao.IUserDAO;
import com.chy.freemarker.entity.User;

@Service("userDAO")
public class UserDAOImpl implements IUserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
//	@Autowired
//	public void setSuperSessionFactory(SessionFactory sessionFactory){
//		super.setSessionFactory(sessionFactory);
//	}
	
	@Override
	public void saveUser(User user) {
//		getHibernateTemplate().save(user);
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
	
}
