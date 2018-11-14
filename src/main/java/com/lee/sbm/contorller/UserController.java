package com.lee.sbm.contorller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.sbm.dao.UserInfoMapper;

import com.lee.sbm.domain.UserInfo;





@Controller
@RequestMapping("/u")
public class UserController {

    @Autowired
    private UserInfoMapper userMapper;

    @RequestMapping("/find")
    @ResponseBody
    public String toIndex(){
    	UserInfo u = userMapper.selectByPrimaryKey("1");
    	
		return u.toString();
        
    }
}