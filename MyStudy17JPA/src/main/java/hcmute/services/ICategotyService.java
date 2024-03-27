package hcmute.services;

import java.util.List;

import hcmute.entity.Category;

public interface ICategotyService {
	List<Category> findAll();
	void insert(Category cate);
	Category findByID(int id);
	void update(Category category);
	void delete(int id) throws Exception;
}
