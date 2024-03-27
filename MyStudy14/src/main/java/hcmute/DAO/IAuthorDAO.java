package hcmute.DAO;

import java.util.List;

import hcmute.entity.Author;
import hcmute.entity.Author;

public interface IAuthorDAO {
	void insert(Author author);
	void update(Author author);
	void delete(int id) throws Exception;
	List<Author> findAll();
	List<Author> findAll(int page, int pagesize);
	Author findByID(int id);
	List<Author> findByAuthor();
	int count();
}
