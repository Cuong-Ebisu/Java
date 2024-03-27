package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hcmute.models.CategoryModels;

public class CategoryDAOImpl implements ICategoryDAO{

	@Override
	public List<CategoryModels> findAll() {
		List<CategoryModels> listcate = new ArrayList<CategoryModels>();
		String sql = "SELECT *FROM Category";
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CategoryModels category = new CategoryModels();
				category.setCateID(rs.getInt("CategoryID"));
				category.setCateName(rs.getString("CategoryName"));
				category.setImage(rs.getString("icon"));
				listcate.add(category);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listcate;
		
	}

	@Override
	public void insert(CategoryModels model) {
		String sql = "INSERT INTO Category(CategoryName, icon) VALUES(?, ?)";
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, model.getCateName());
			ps.setString(2, model.getImage());
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public CategoryModels findOne(int id) {
		//xu ly du lieu lay ra 1 doi tuong Category
		String sql = "SELECT *FROM Category WHERE CategoryID = ?";
		CategoryModels model = new CategoryModels();
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				model.setCateID(rs.getInt("CategoryID"));
				model.setCateName(rs.getString("CategoryName"));
				model.setImage(rs.getString("icon"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
		
	}

	@Override
	public void update(CategoryModels model) {
		// TODO Auto-generated method stub
		
	}

}
