package hcmute.services;

import java.util.List;

import hcmute.DAO.ProductDAOimpl;
import hcmute.DAO.IProductDAO;
import hcmute.models.ProductModel;

public class ProductServiceImpl implements IProductService{
	//goi cac phuong thuc trong DAO
	IProductDAO proDao = new ProductDAOimpl();
	
	@Override
	public List<ProductModel> findAll() {
		//Xu ly logic
		//goi va truyen cho DAO
		return proDao.findAll();
	}
	public List<ProductModel> findProductByCategory(int id) {
		//Xu ly logic
		//goi va truyen cho DAO
		return proDao.findProductByCategory(id);
	}
	@Override
	public List<ProductModel> orderByListProduct() {
		return proDao.orderByListProduct();
	}
}
