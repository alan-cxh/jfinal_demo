package com.xiaomuedu.common.model;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;


@SuppressWarnings("serial")
public class User extends Model<User> implements IBean {
	
	public static final User dao = new User();
	
	public User() {}
	
	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}
	
	public void setUsername(java.lang.String username) {
		set("username", username);
	}

	public java.lang.String getUsername() {
		return get("username");
	}
	public void setPassword(java.lang.String password) {
		set("password", password);
	}
	
	public java.lang.String getPassword() {
		return get("password");
	}
	
	
	
}
