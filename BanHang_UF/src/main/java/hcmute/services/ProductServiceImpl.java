package hcmute.services;

import java.util.List;

import hcmute.models.ProductModel;
import hcmute.DAO.ProductDAOImpl;
import hcmute.DAO.IProductDAO;

public class ProductServiceImpl implements IProductService {
	IProductDAO proDao = new ProductDAOImpl();

	@Override
	public List<ProductModel> findAll() {
		
		return proDao.findAll();
	}

	@Override
	public List<ProductModel> findProductByCateory(int cateid) {
		
		return proDao.findProductByCateory(cateid);
	}

	@Override
	public List<ProductModel> countProductByCategory() {
		
		return proDao.countProductByCategory();
	}

	@Override
	public void insert(ProductModel model) {
		proDao.insert(model);
		
	}

	@Override
	public void update(ProductModel model) {
		ProductModel newPro = proDao.findOne(model.getProductID());
		newPro.setProductName(model.getProductName());
		newPro.setDescription(model.getDescription());
		newPro.setPrice(model.getPrice());
		newPro.setImageLink(model.getImageLink());
		newPro.setCategory(model.getCategory());
		newPro.setAmount(model.getAmount());
		newPro.setStoke(model.getStoke());
		
		proDao.update(newPro);
		
		proDao.update(model);
		
	}

	@Override
	public ProductModel findOne(int id) {
		
		return proDao.findOne(id);
	}

	
	

	
}
