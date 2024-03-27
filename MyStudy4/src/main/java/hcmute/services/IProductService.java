package hcmute.services;

import java.util.List;

import hcmute.models.ProductModel;

public interface IProductService {
	List<ProductModel> findAll();
	List<ProductModel> findProductByCateory(int cateid);
	List<ProductModel> countProductByCategory();
	void insert (ProductModel model);
	void update (ProductModel model);
	ProductModel findOne(int id);
	void delete (int id);
}
