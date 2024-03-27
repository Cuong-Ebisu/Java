package hcmute.repository;

import org.springframework.stereotype.Repository;

import hcmute.Model.Books;

import org.springframework.data.repository.CrudRepository;  

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>{


}
