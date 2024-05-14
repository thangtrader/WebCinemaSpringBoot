package Controller.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Service.ThongKeNhanVienService;


@Controller
@RequestMapping("/admin")
public class ThongKeNhanVienController {
	
	@Autowired
	private ThongKeNhanVienService tknvService;
	
	@GetMapping("/thongkenhanvien")
	public String NhanVien(Model model) {
		List<Object[]> tknv = this.tknvService.getAll();
		model.addAttribute("tknv", tknv);
		return "ThongKe/thongkenhanvien";
	}
}
