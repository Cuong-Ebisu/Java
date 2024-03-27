package hcmute.services;

import java.util.List;

import hcmute.entity.Book;

public interface IBookService {
	void insert(Book book);
	void update(Book book);
	void delete(int id) throws Exception;
	List<Book> findAll();
	List<Book> findAll(int page, int pagesize);
	Book findByID(int id);
	List<Book> findByCateName(String name);
	List<Book> findByRating();
	int count();	
}
