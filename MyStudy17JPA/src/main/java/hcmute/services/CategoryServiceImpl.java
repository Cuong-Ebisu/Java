package hcmute.services;

import java.util.List;

import hcmute.DAO.CategoryDAOimpl;
import hcmute.DAO.ICategotyDAO;
import hcmute.entity.Category;

public class CategoryServiceImpl implements ICategotyService{
	//goi cac phuong thuc trong DAO
	ICategotyDAO cateDao = new CategoryDAOimpl();
	
	@Override
	public List<Category> findAll() {
		//Xu ly logic
		//goi va truyen cho DAO
		return cateDao.findAll();
	}

	@Override
	public void insert(Category cate) {
		cateDao.insert(cate);
	}

	@Override
	public Category findByID(int id) {
		return cateDao.findByID(id);
	}

	@Override
	public void update(Category category) {
		cateDao.update(category);
		
	}

	@Override
	public void delete(int id) throws Exception {
		cateDao.delete(id);
	}


		
}
