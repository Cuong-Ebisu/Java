package hcmute.services;

import java.util.List;

import hcmute.DAO.BookDAOImpl;
import hcmute.DAO.IBookDAO;
import hcmute.entity.Book;

public class BookServiceImp implements IBookService{

	IBookDAO bookDAO = new BookDAOImpl();
	public void insert(Book book) {
		bookDAO.insert(book);
	}

	@Override
	public void update(Book book) {
		bookDAO.update(book);
		
	}

	@Override
	public void delete(int id) throws Exception {
		bookDAO.delete(id);
		
	}

	@Override
	public List<Book> findAll() {
		return bookDAO.findAll();
	}

	@Override
	public List<Book> findAll(int page, int pagesize) {
		return bookDAO.findAll(page,pagesize);
	}

	@Override
	public Book findByID(int id) {
		return bookDAO.findByID(id);
	}

	@Override
	public List<Book> findByCateName(String name) {
		return bookDAO.findByAuthorName(name);
	}

	@Override
	public int count() {
		return bookDAO.count();
	}

	@Override
	public List<Book> findByRating() {
		
		return bookDAO.findByRating();
	}

}
