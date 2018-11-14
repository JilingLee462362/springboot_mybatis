package com.lee.sbm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lee.sbm.dao.UserInfoMapper;
import com.lee.sbm.domain.UserInfo;

@Service("userServiceI")
public class UserServiceImpl implements UserServiceI {
	@Resource
	private UserInfoMapper mapper;
	
	@Override
	public UserInfo getUserInfoById(String UserId) {
		
		return mapper.selectByPrimaryKey(UserId);
	}

	@Override
	public boolean addUser(UserInfo u) {
		boolean result = false;
        try {
        	mapper.insert(u);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return result;
	}

}
