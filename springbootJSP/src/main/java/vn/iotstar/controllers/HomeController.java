package vn.iotstar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value ="/")
	public String trangchu() {
		
		return "admin/categories/list";
	}
}
