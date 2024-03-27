package hcmute.DAO;

import java.util.List;

import hcmute.entity.Author;

public interface IAuthorDAO {
	List<Author> findAll(int start, int total);
	int countAuthor();
}
