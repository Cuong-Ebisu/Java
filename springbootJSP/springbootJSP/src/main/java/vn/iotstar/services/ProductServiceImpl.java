package vn.iotstar.services;

import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import vn.iotstar.repository.ProductRepository;

public class ProductServiceImpl implements IStorageService{

	@Autowired
	ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String storeFilename) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Path load(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource loadAsResource(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void store(MultipartFile file, String storeFilename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStorageFilename(MultipartFile file, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
