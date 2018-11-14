package com.lee.sbm.contorller;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.sbm.dao.UserInfoMapper;

import com.lee.sbm.domain.UserInfo;
import com.lee.sbm.service.UserServiceI;





@Controller
@RequestMapping("/u")
public class UserController {

    @Autowired
    private UserServiceI us;

    @RequestMapping("/find")
    @ResponseBody
    public String toIndex(Map<String, Object> map){
    	UserInfo u = us.getUserInfoById("1");
    	map.put("u",u.toString());
		return "hello";
        
    }
}