package com.lee.sbm;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lee.sbm.dao.UserInfoMapper;
import com.lee.sbm.domain.UserInfo;
import com.lee.sbm.service.UserServiceI;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbmApplicationTests {
	@Resource(name="userServiceI")
    private UserServiceI s;

	@Test
	public void contextLoads() {
		UserInfo u = s.getUserInfoById("1");
		System.out.println(u);
		
		
	}

}
