package hcmute.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcmute.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
