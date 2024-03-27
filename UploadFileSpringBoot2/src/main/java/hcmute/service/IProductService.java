package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import hcmute.entity.Product;

public interface IProductService {

	<S extends Product> S save(S entity);

	void deleteAll();

	void delete(Product entity);

	void deleteById(Long id);

	long count();

	<S extends Product> Optional<S> findOne(Example<S> example);

	Optional<Product> findById(Long id);

	List<Product> findAllById(Iterable<Long> ids);

	List<Product> findAll(Sort sort);

	Page<Product> findAll(Pageable pageable);

	List<Product> findAll();
	
}
