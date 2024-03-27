package hcmute.DAO;

import java.util.List;

import hcmute.models.CategoryModels;

public interface ICategoryDAO {
	//dinh nghia ca phuong thuc
	List<CategoryModels> findAll();
	
	void insert (CategoryModels model);

	void delete(int id);
	
	CategoryModels findOne(int id);
	void update(CategoryModels model);

	void delete(CategoryModels model);
}
