package hcmute.DAO;

import java.util.List;

import hcmute.models.CategoryModels;
import hcmute.models.ProductModel;

public interface IProductDAO {
	// dinh nghia cac phuong thuc
	List<ProductModel> findAll();
	List<ProductModel> findProductByCategory(int cateid);
	List<ProductModel> orderByListProduct(int stoke);
	ProductModel findOne(int stoke);
}
