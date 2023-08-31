package com.backbone.core.user;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backbone.core.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired(required=true)
    private UserService userService;

    @GetMapping("/{username}")
    public List<Map<String, Object>> getUsersByUsername(@PathVariable String username) {
    	System.out.println("username -> " + username);
        return userService.getUsersByUsername(username);
    }
}
