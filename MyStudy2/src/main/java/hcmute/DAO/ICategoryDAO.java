package hcmute.DAO;

import java.util.List;

import hcmute.models.CategoryModels;

public interface ICategoryDAO {
	List<CategoryModels> findAll();
	void insert(CategoryModels model);
	
	CategoryModels findOne(int id);
	
	void update(CategoryModels model);
}
