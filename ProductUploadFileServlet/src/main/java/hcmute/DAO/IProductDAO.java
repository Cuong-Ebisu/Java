package hcmute.DAO;

import java.util.List;

import hcmute.models.ProductModel;

public interface IProductDAO {
	List<ProductModel> findAll();
	void addProduct(ProductModel product);
	ProductModel getProductById(int productId);
	void updateProduct(ProductModel product);
}
