package hcmute.services;

import java.util.List;

import hcmute.entity.Author;

public interface IAuthorService {
	List<Author> findAll(int start, int total);
	int countAuthor();
}
