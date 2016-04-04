package com.chy.freemarker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_user")
public class User {

	@Id
	@GeneratedValue(generator = "uuid.hex")
	@GenericGenerator(name = "uuid.hex", strategy = "uuid.hex")
	private String id;
	
	@Column(name = "user_name", length = 20)
	private String name;
	
	@Column(name = "user_password", length = 32)
	private String password;
	
	public User() {}
	
	public User(String name){
		this.name = name;
	}
	
	public User(String name, String password){
		this.name = name;
		this.setPassword(password);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password != null)
			this.password = DigestUtils.md5Hex(password);
	}
	
}
