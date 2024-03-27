package hcmute.services;

import java.util.List;

import hcmute.DAO.CategoryDAOImpl_21110390;
import hcmute.DAO.ICategoryDAO_21110390;
import hcmute.entity.Category;

public class CategoryServiceImpl_21110390 implements ICategoryService_21110390{

	ICategoryDAO_21110390 cateDAO = new CategoryDAOImpl_21110390();
	@Override
	public List<Category> findAll(int start, int total) {
		return cateDAO.findAll(start, total);
	}

	@Override
	public int countCategory() {
		return cateDAO.countCategory();
	}

	@Override
	public void insert(Category cate) {
		cateDAO.insert(cate);
		
	}

	@Override
	public Category findByID(int id) {
		return cateDAO.findByID(id);
	}

	@Override
	public void update(Category cate) {
		cateDAO.update(cate);
		
	}

	@Override
	public void delete(int id) throws Exception {
		cateDAO.delete(id);
	}

}
