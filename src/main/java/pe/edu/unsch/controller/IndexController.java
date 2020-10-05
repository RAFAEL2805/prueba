package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class IndexController {
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", "Rafael");
		model.addAttribute("cuerpo", "holamundo");
		model.addAttribute("cuerpo2", "ale");
		return "views/index";
	}
}