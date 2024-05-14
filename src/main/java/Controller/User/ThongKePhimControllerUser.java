package Controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.CHITIETPHIEUPHIM;
import Service.ThongKePhimService;


@Controller
@RequestMapping("/user")
public class ThongKePhimControllerUser {
	
	@Autowired
	private ThongKePhimService tkpService;
	
	@GetMapping("/thongkephim")
	public String Phim(Model model) {
		List<Object[]> ctpp = this.tkpService.getAll();
		model.addAttribute("ctpp", ctpp);
		return "User/thongkephim";
	}
}
