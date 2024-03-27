package hcmute.repository;
import org.springframework.data.repository.CrudRepository;  
import hcmute.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  {

}
