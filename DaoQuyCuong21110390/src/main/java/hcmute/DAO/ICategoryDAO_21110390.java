package hcmute.DAO;

import java.util.List;

import hcmute.entity.Category;

public interface ICategoryDAO_21110390 {
	List<Category> findAll(int start, int total);
	int countCategory();
	void insert(Category cate);
	Category findByID(int id);
	void update(Category cate);
	void delete(int id) throws Exception;
}
