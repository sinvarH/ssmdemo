package sinvar.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sinvar.demo.pojo.User;
import sinvar.demo.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/showUser")
	public@ResponseBody User toIndex(Model model){  
    
        User user = this.userService.getUserById(1);   
        return user;  
    }  
}
