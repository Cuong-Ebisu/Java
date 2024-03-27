package vn.iotstar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.iotstar.services.ICategoryService;

@Controller
@RequestMapping("admin/products")
public class ProductController {

	@Autowired
	ICategoryService categoryService;
	
}
