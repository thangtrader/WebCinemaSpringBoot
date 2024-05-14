package Controller.Admin;

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
@RequestMapping("/admin")
public class LichChieuController {
	@Autowired
	private LichChieuService lcService;
	
	@Autowired
	private PhongChieuService pcService;
	
	@Autowired
	private KhungGioChieuService kgcService;
	
	@Autowired
	private PhimService phimService;

	@GetMapping("/lichchieu")
	public String LichChieu(Model model, @Param("keyword") String keyword, @RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo) {
		Page<LichChieuDisplay> danhSachKhungGio = this.lcService.getAll(pageNo,3);
		model.addAttribute("totalPage", danhSachKhungGio.getTotalPages());
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("danhSachKhungGio", danhSachKhungGio);
		return "LichChieu/lichchieu";
	}
//	@GetMapping("/lichchieu")
//	public String LichChieu(Model model) {
//		List<LichChieuDTO> lichchieu = this.lcService.getAll();
//		model.addAttribute("lichchieu", lichchieu);
//		return "LichChieu/lichchieu";
//	}
	
	@GetMapping("/quanlilichchieu")
	public String QLLichChieu(Model model) {
		List<LichChieuDTO> lichchieu = this.lcService.getAll();
		model.addAttribute("lichchieu", lichchieu);
		return "LichChieu/quanlilichchieu";
	}
	
	@GetMapping("/themlichchieu")
	public String ThemLichChieu(Model model) {
		LICHCHIEU lichchieu = new LICHCHIEU();
		model.addAttribute("lichchieu", lichchieu);
		List<PHIM> phim = this.phimService.getAll();
		model.addAttribute("phim", phim);
		List<PHONGCHIEU> pc = this.pcService.getAll();
		model.addAttribute("pc", pc);
		List<KHUNGGIOCHIEU> kgc = this.kgcService.getAll();
		model.addAttribute("kgc", kgc);
		return "LichChieu/themlichchieu";
	}
	
	@PostMapping("/themlichchieu")
	public String Save(@ModelAttribute("lichchieu") LICHCHIEU lichchieu) {
		if(this.lcService.create(lichchieu)) {
			return "redirect:/admin/quanlilichchieu";
		}else {
			return "/admin/themlichchieu";
		}
	}
	
//	@GetMapping("/lichchieu/sualichchieu/{NgayChieu}")
//	public String SuaPhim(Model model, @PathVariable("NgayChieu") Date NgayChieu) {
//		LICHCHIEU lichchieu = this.lcService.findByNgayChieu(NgayChieu);
//		model.addAttribute("lichchieu", lichchieu);
//		List<PHIM> phim = this.phimService.getAll();
//		model.addAttribute("phim", phim);
//		List<PHONGCHIEU> pc = this.pcService.getAll();
//		model.addAttribute("pc", pc);
//		List<KHUNGGIOCHIEU> kgc = this.kgcService.getAll();
//		model.addAttribute("kgc", kgc);
//		return "LichChieu/sualichchieu";
//	}
	@GetMapping("/sualichchieu/{NgayChieu}")
	public String SuaPhim(Model model, @PathVariable("NgayChieu") String NgayChieuStr) throws ParseException {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    Date NgayChieu = formatter.parse(NgayChieuStr);
	    
	    LICHCHIEU lichchieu = this.lcService.findByNgayChieu(NgayChieu);
	    model.addAttribute("lichchieu", lichchieu);
	    List<PHIM> phim = this.phimService.getAll();
	    model.addAttribute("phim", phim);
	    List<PHONGCHIEU> pc = this.pcService.getAll();
	    model.addAttribute("pc", pc);
	    List<KHUNGGIOCHIEU> kgc = this.kgcService.getAll();
	    model.addAttribute("kgc", kgc);
	    
	    return "LichChieu/sualichchieu";
	}
	
	@PostMapping("/sualichchieu")
	public String Update(@ModelAttribute("lichchieu") LICHCHIEU lichchieu) {
		if(this.lcService.update(lichchieu)) {
			return "redirect:/admin/quanlilichchieu";
		}else {
			return "/admin/sualichchieu";
		}
	}
	
	@GetMapping("/xoalichchieu/{NgayChieu}")
	public String XoaLichChieu(@PathVariable("NgayChieu") String NgayChieuStr) throws ParseException {
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    Date NgayChieu = formatter.parse(NgayChieuStr);
		if(this.lcService.delete(NgayChieu)) {
			return "redirect:/admin/quanlilichchieu";
		}else {
			return "redirect:/admin/quanlilichchieu";
		}
	}
}
