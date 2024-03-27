package hcmute.services;

import java.util.List;
import hcmute.entity.Author;
import hcmute.DAO.*;
public class AuthorServiceImpl implements IAuthorService{

	IAuthorDAO authorDAO = new AuthorDAOimpl();
	public void insert(Author author) {
		authorDAO.insert(author);
	}

	@Override
	public void update(Author author) {
		authorDAO.update(author);
		
	}

	@Override
	public void delete(int id) throws Exception {
		authorDAO.delete(id);
		
	}

	@Override
	public List<Author> findAll() {
		return authorDAO.findAll();
	}

	@Override
	public List<Author> findAll(int page, int pagesize) {
		return authorDAO.findAll(page,pagesize);
	}

	@Override
	public Author findByID(int id) {
		return authorDAO.findByID(id);
	}


	@Override
	public int count() {
		return authorDAO.count();
	}

}
