package hcmute.services;

import java.util.List;

import hcmute.models.ProductModel;

public interface IProductService {
	List<ProductModel> findAll();
	void addProduct(ProductModel product);
	ProductModel getProductById(int productId);
	void updateProduct(ProductModel product);
	
}
