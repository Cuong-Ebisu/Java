package hcmute.services;

import java.util.List;

import hcmute.DAO.CategoryDAOImpl;
import hcmute.DAO.ICategoryDAO;
import hcmute.models.CategoryModels;

public class CategoryServiceImpl implements ICategoryService{

	ICategoryDAO cateDAO = new CategoryDAOImpl();
	@Override
	public List<CategoryModels> findAll() {
		return cateDAO.findAll();
	}
	@Override
	public void insert(CategoryModels model) {
		cateDAO.insert(model);
		
	}
	@Override
	public CategoryModels findOne(int id) {
		return cateDAO.findOne(id);
	}
	@Override
	public void update(CategoryModels model) {
		// TODO Auto-generated method stub
		
	}

}
