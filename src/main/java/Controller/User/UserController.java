package Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.PHIM;
import Service.PhimService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@GetMapping
	public String index(){
		return "redirect:/user/phim";
	}
	
	@RequestMapping("/")
	public String admin(Model model) {
		return "User/phim";
	}
}
