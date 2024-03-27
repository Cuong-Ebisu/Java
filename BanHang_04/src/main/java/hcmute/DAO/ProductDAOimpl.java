package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.List;

import hcmute.models.CategoryModels;
import hcmute.models.ProductModel;

public class ProductDAOimpl implements IProductDAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	ICategotyDAO cateDAO = new CategoryDAOimpl();
	IProductDAO proDAO = new ProductDAOimpl();

	@Override
	public List<ProductModel> findAll() {
		// xu ly du lieu hien thi tat ca category
		List<ProductModel> listcate = new ArrayList<ProductModel>();
		String sql = "Select * from Product";
		try {
			conn = new DBConnectionSQL().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				ProductModel product = new ProductModel();
				product.setProductID(rs.getInt("ProductID"));
				product.setProductName(rs.getString("ProductName"));
				product.setDescription(rs.getString("Description"));
				product.setPrice(rs.getInt("Price"));
				product.setImageLink(rs.getString("imageLink"));
				product.setCategoryID(rs.getInt("CategoryID"));
				product.setSellerID(rs.getInt("SellerID"));
				product.setAmount(rs.getInt("Amount"));
				product.setStoke(rs.getInt("stoke"));

				listcate.add(product);
			}
			// ket noi du lieu
			// truy van du lieu
			// chuyen du liieu ra view
			// view nao se nhan du lieu
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listcate;
	}

	public List<ProductModel> findProductByCategory(int cateid) {
		// xu ly du lieu hien thi tat ca category
		List<ProductModel> listcate = new ArrayList<ProductModel>();
		String sql = "Select * from Product where CategoryID = ?";
		try {
			conn = new DBConnectionSQL().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, cateid);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModels model1 = cateDAO.findOne(rs.getInt("CategoryID"));
				ProductModel product = new ProductModel();
				product.setProductID(rs.getInt("ProductID"));
				product.setProductName(rs.getString("ProductName"));
				product.setDescription(rs.getString("Description"));
				product.setPrice(rs.getInt("Price"));
				product.setImageLink(rs.getString("imageLink"));
				product.setCategoryID(model1.getCateID());
				product.setSellerID(rs.getInt("SellerID"));
				product.setAmount(rs.getInt("Amount"));
				product.setStoke(rs.getInt("stoke"));

				listcate.add(product);
			}
			// ket noi du lieu
			// truy van du lieu
			// chuyen du liieu ra view
			// view nao se nhan du lieu
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listcate;
	}

	public static void main(String[] args) {
		IProductDAO proDAO = new ProductDAOimpl();
		List<ProductModel> list = proDAO.findProductByCategory(3);
		System.out.println(list);
	}

	@Override
	public List<ProductModel> orderByListProduct(int stoke) {
		// xu ly du lieu hien thi tat ca category
		List<ProductModel> listcate = new ArrayList<ProductModel>();
		String sql = "Select * from Product where stoke = ?";
		try {
			conn = new DBConnectionSQL().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, stoke);
			rs = ps.executeQuery();
			while (rs.next()) {
				CategoryModels model1 = cateDAO.findOne(rs.getInt("CategoryID"));
				ProductModel product = new ProductModel();
				product.setProductID(rs.getInt("ProductID"));
				product.setProductName(rs.getString("ProductName"));
				product.setDescription(rs.getString("Description"));
				product.setPrice(rs.getInt("Price"));
				product.setImageLink(rs.getString("imageLink"));
				product.setCategoryID(model1.getCateID());
				product.setSellerID(rs.getInt("SellerID"));
				product.setAmount(rs.getInt("Amount"));
				product.setStoke(rs.getInt("stoke"));

				listcate.add(product);
			}
			// ket noi du lieu
			// truy van du lieu
			// chuyen du liieu ra view
			// view nao se nhan du lieu
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listcate;
	}

	@Override
	public ProductModel findOne(int stoke) {
		// TODO Auto-generated method stub
		return null;
	}

}
