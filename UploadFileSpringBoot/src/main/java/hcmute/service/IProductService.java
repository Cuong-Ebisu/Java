package hcmute.service;

import java.util.List;
import java.util.Optional;

import hcmute.entity.Product;

public interface IProductService {

	void deleteById(Long id);

	long count();

	Optional<Product> findById(Long id);

	List<Product> findAllById(Iterable<Long> ids);

	List<Product> findAll();

	<S extends Product> S save(S entity);
	
}
