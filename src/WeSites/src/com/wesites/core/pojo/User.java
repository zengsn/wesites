package com.wesites.core.pojo;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Set<Role> roles = new HashSet<Role>(0);
	private Set<Wechat> wechat = new HashSet<Wechat>(0);

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Set<Wechat> getWechat() {
		return wechat;
	}
	public void setWechat(Set<Wechat> wechat) {
		this.wechat = wechat;
	}
	

}
