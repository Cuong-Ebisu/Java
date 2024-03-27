package hcmute.DAO;

import java.util.List;

import hcmute.entity.Category;

public interface ICategotyDAO {
	// dinh nghia cac phuong thuc
	List<Category> findAll();
	
	void insert(Category cate);
	
	Category findByID(int id);
	
	void update(Category model);
	
	void delete(int id)throws Exception;
	
}
