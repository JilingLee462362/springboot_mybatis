package com.lee.sbm.service;

import com.lee.sbm.domain.UserInfo;

public interface UserServiceI {
	public UserInfo getUserInfoById(String UserId);
	boolean addUser(UserInfo u);
}
