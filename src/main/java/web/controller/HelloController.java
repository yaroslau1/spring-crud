package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.Service;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	private UserService userService;

	@Autowired
	public HelloController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		List<User>  userList = userService.getAllUsers();
		model.addAttribute("userList", userList);
        System.out.println(userList);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String showCars(ModelMap model, /*@RequestParam*/ int count){
		Service service = new Service();
		System.out.println(service.getSpecifiedCars(count));
		model.addAttribute("cars", service.getSpecifiedCars(count));
		return "cars";
	}
	
}