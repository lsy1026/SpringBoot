package com.backbone.core.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backbone.core.user.mapper.UserMapper;

@Service
public class UserService {
	@Autowired(required=true)
	private UserMapper userMapper;
	
	public List<Map<String, Object>> getAllUser() {
		System.out.println("UserService getAllUser()");
        return userMapper.getAllUser();
    }

	public List<Map<String, Object>> getUsersByUsername(String username) {
        return userMapper.getUsersByUsername(username);
    }
}
