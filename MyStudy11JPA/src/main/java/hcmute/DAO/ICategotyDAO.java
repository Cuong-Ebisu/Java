package hcmute.DAO;

import java.util.List;

import entity.Category;

public interface ICategotyDAO {
	// dinh nghia cac phuong thuc
	List<Category> findAll();
	
	void insert(Category category);
	
	Category findById(int cateid);
	
	void update(Category category);
	
	void delete(int cateid) throws Exception;
	
}
