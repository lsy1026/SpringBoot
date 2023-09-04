package com.backbone.core.user;

import java.util.Iterator;
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
	@Autowired(required = true)
	private UserService userService;
	
	private void mapListPrint(List<Map<String, Object>> mapList) {
		Iterator<Map<String, Object>> iterator = mapList.iterator();
		while (iterator.hasNext()) {
			Map<String, Object> user = iterator.next();
			System.out.println("UUID="+user.get("UUID")
								+" ID="+user.get("ID")
								+" NAME="+user.get("NAME")
								+" MEMO="+user.get("MEMO")
								+" ETC="+user.get("ETC"));
		}
	}

	@GetMapping("/userlist")
	public List<Map<String, Object>> getAllUser() {
		System.out.println("get all user list!! ");
		
		List<Map<String, Object>> users = userService.getAllUser();
		mapListPrint(users);

		return userService.getAllUser();
	}

	@GetMapping("/{username}")
	public List<Map<String, Object>> getUsersByUsername(@PathVariable String username) {
		System.out.println("username -> " + username);
		
		List<Map<String, Object>> users = userService.getUsersByUsername(username);
		mapListPrint(users);
		
		return userService.getUsersByUsername(username);
	}
}
