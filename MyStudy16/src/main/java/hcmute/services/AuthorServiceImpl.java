package hcmute.services;

import java.util.List;

import hcmute.DAO.AuthorDAOImpl;
import hcmute.DAO.IAuthorDAO;
import hcmute.entity.Author;

public class AuthorServiceImpl implements IAuthorService{

	IAuthorDAO authorDAO = new AuthorDAOImpl();
	@Override
	public List<Author> findAll(int start, int total) {
		return authorDAO.findAll(start,total);
	}

	@Override
	public int countAuthor() {
		return authorDAO.countAuthor();
	}

}
