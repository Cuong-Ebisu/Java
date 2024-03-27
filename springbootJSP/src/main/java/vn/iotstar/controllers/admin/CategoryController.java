package vn.iotstar.controllers.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
import vn.iotstar.Model.CategoryModel;
import vn.iotstar.entity.Category;
import vn.iotstar.services.ICategoryService;

@Controller
@RequestMapping("admin/categories")
public class CategoryController {

	@Autowired
	ICategoryService categoryService;
	
	
	@GetMapping("add")
	public String add(ModelMap model) {
		CategoryModel cateModel = new CategoryModel();
		cateModel.setIsEdit(false);
		// chuyển dữ liệu từ model vào biến category để đưa lên view
		model.addAttribute("category", cateModel);
		return "admin/categories/addOrEdit";
	}
	
	@PostMapping("saveOrUpdate")
	public ModelAndView saveOrUpdate(ModelMap model, @Valid @ModelAttribute("category") CategoryModel cateMdoel,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("admin/categories/addOrEdit");
		}

		Category entity = new Category();
		// copy từ Model sang Entity
		BeanUtils.copyProperties(cateMdoel, entity);
		// gọi hàm save trong service
		categoryService.save(entity);
		// đưa thông báo về cho biến message
		String message = "";
		if (cateMdoel.getIsEdit() == true) {
			message = "Category is Edited!!!!!!!!";
		} else {
			message = "Category is saved!!!!!!!!";
		}
		model.addAttribute("message", message);
		// redirect về URL controller
		return new ModelAndView("forward:/admin/categories", model);
	}
	
	
	@RequestMapping("")
	public String list(ModelMap model) {
		//goi ham findAll trong service
		List<Category> list = categoryService.findAll();
		//chuyen du lieu tu list len bien categories
		model.addAttribute("categories", list);
		return "admin/categories/list";
	}
	
	@GetMapping("edit/{categoryId}")
	public ModelAndView edit(ModelMap model, @PathVariable("categoryId") Long categoryId) {
		Optional<Category> optCategory = categoryService.findById(categoryId);
		CategoryModel cateModel = new CategoryModel();
		// kiểm tra sự tồn tại của category
		if (optCategory.isPresent()) {
			Category entity = optCategory.get();
			// copy từ entity sang cateModel
			BeanUtils.copyProperties(entity, cateModel);
			cateModel.setIsEdit(true);
			// đẩy dữ liệu ra view
			model.addAttribute("category", cateModel);
			return new ModelAndView("admin/categories/addOrEdit", model);
		}
		model.addAttribute("message", "Category is not existed!!!!");
		return new ModelAndView("forward:/admin/categories", model);
	}
	
	@GetMapping("delete/{categoryId}")
	public ModelAndView delet(ModelMap model, @PathVariable("categoryId") Long categoryId) {
		categoryService.deleteById(categoryId);
		model.addAttribute("message", "Category is deleted!!!!");
		return new ModelAndView("redirect:/admin/categories", model);
	}
}
