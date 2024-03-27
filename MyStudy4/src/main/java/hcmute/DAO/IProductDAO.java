package hcmute.DAO;

import java.util.List;

import hcmute.models.ProductModel;

public interface IProductDAO {
	List<ProductModel> findAll();
	List<ProductModel> findProductByCateory(int cateid);
	List<ProductModel> countProductByCategory();
	void insert (ProductModel model);
	void update (ProductModel model);
	ProductModel findOne(int id);
	void delete(int id);
	void delete(ProductModel model);
}