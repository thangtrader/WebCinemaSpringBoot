package Controller.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.PHIM;
import Model.THELOAIPHIM;
import Repository.PhimRepository;
import Service.PhimService;
import Service.TheLoaiPhimService;

@Controller
@RequestMapping("/user")
public class PhimControllerUser {
	@Autowired
	private PhimService phimService;

	
	@GetMapping("/phim")
	public String danhSachPhim(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
		Page<PHIM> danhSachPhim = phimService.getAll(pageNo);
		model.addAttribute("totalPage", danhSachPhim.getTotalPages());
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("danhSachPhim", danhSachPhim);
		return "User/phim";
	}
	
	@GetMapping("/quanliphim")
	public String QLPhim(Model model) {
		Iterable<PHIM> phim = this.phimService.getAll();
		model.addAttribute("phim", phim);
		return "User/quanliphim";
	}
}
