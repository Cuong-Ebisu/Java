package hcmute.services;

import java.util.List;

import hcmute.entity.Author;
import hcmute.entity.Book;

public interface IAuthorService {
	void insert(Author author);
	void update(Author author);
	void delete(int id) throws Exception;
	List<Author> findAll();
	List<Author> findAll(int page, int pagesize);
	Author findByID(int id);
	
	int count();
}
