package Controller.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.KHUNGGIOCHIEU;
import Model.LICHCHIEU;
import Model.LichChieuDTO;
import Model.LichChieuDisplay;
import Model.PHIM;
import Model.PHONGCHIEU;
import Model.THELOAIPHIM;
import Service.KhungGioChieuService;
import Service.LichChieuService;
import Service.PhimService;
import Service.PhongChieuService;

@Controller
@RequestMapping("/user")
public class LichChieuControllerUser {
	@Autowired
	private LichChieuService lcService;
	
	@GetMapping("/lichchieu")
	public String LichChieu(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
		Page<LichChieuDisplay> danhSachKhungGio = this.lcService.getAll(pageNo,3);
		model.addAttribute("totalPage", danhSachKhungGio.getTotalPages());
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("danhSachKhungGio", danhSachKhungGio);
		return "User/lichchieu";
	}
	
	@GetMapping("/quanlilichchieu")
	public String QLLichChieu(Model model) {
		List<LichChieuDTO> lichchieu = this.lcService.getAll();
		model.addAttribute("lichchieu", lichchieu);
		return "User/quanlilichchieu";
	}

}
