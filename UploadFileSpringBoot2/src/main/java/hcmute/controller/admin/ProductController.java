package hcmute.controller.admin;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import hcmute.entity.Product;
import hcmute.model.ProductModel;
import hcmute.service.IProductService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("admin/products")
public class ProductController {
	@Autowired(required = true)

	IProductService productService;

	@GetMapping("add")

	public String add(ModelMap model) {

		ProductModel proModel = new ProductModel();

		proModel.setIsEdit(false);

		// chuyển dữ liệu từ model vào biến product để đưa lên view

		model.addAttribute("product", proModel);

		return "admin/products/addOrEdit";

	}
	@PostMapping("saveOrUpdate")

	public ModelAndView saveOrUpdate(ModelMap model,

			@Valid @ModelAttribute("product") ProductModel proModel, BindingResult result) {

		if (result.hasErrors()) {

			return new ModelAndView("admin/products/addOrEdit");

		}

		Product entity = new Product();

		// copy từ Model sang Entity

		BeanUtils.copyProperties(proModel, entity);

		// gọi hàm save trong service

		productService.save(entity);

		// đưa thông báo về cho biến message

		String message = "";

		if (proModel.getIsEdit() == true) {

			message = "Product is Edited!!!!!!!!";

		} else {

			message = "Product is saved!!!!!!!!";

		}

		model.addAttribute("message", message);

		// redirect về URL controller

		return new ModelAndView("forward:/admin/products", model);

	}
	@RequestMapping("")

	public String list(ModelMap model) {

		// gọi hàm findAll() trong service

		List<Product> list = productService.findAll();

		// chuyển dữ liệu từ list lên biến categories

		model.addAttribute("products", list);

		return "admin/products/list";

	}
	
	@GetMapping("edit/{id}")

	public ModelAndView edit(ModelMap model, @PathVariable("id") Long id) {

		Optional<Product> optProduct = productService.findById(id);

		ProductModel proModel = new ProductModel();

		// kiểm tra sự tồn tại của product

		if (optProduct.isPresent()) {

			Product entity = optProduct.get();

			// copy từ entity sang cateModel

			BeanUtils.copyProperties(entity, proModel);

			proModel.setIsEdit(true);

			// đẩy dữ liệu ra view

			model.addAttribute("product", proModel);

			return new ModelAndView("admin/products/addOrEdit", model);

		}

		model.addAttribute("message", "Product is not existed!!!!");

		return new ModelAndView("forward:/admin/products", model);

	}
	@GetMapping("delete/{id}")

	public ModelAndView delet(ModelMap model, @PathVariable("id") Long id) {

		productService.deleteById(id);

		model.addAttribute("message", "Product is deleted!!!!");

		return new ModelAndView("forward:/admin/products", model);

	}

}
