package hcmute.services;

import java.util.List;

import hcmute.DAO.IProductDAO;
import hcmute.DAO.ProductDAOImpl;
import hcmute.models.ProductModel;

public class ProductServiceImpl implements IProductService{

	IProductDAO proDAO = new ProductDAOImpl();
	@Override
	public List<ProductModel> findAll() {
		return proDAO.findAll();
	}
	@Override
	public void addProduct(ProductModel product) {
		proDAO.addProduct(product);
		
	}
	@Override
	public ProductModel getProductById(int productId) {
		return proDAO.getProductById(productId);
	}
	@Override
	public void updateProduct(ProductModel product) {
		proDAO.updateProduct(product);
		
	}
	
}
