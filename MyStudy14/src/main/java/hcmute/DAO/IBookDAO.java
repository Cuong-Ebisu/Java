package hcmute.DAO;

import java.util.List;

import hcmute.entity.Book;
import hcmute.entity.Rating;


public interface IBookDAO {
	void insert(Book book);
	void update(Book book);
	void delete(int id) throws Exception;
	List<Book> findAll();
	List<Book> findAll(int page, int pagesize);
	Book findByID(int id);
	List<Book> findByAuthorName(String name);
	List<Book> findByRating();
	double calculateAverageRating(List<Rating> ratings);
	int count();	
}