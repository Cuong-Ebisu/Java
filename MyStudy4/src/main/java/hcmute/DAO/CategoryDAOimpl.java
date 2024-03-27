package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hcmute.models.CategoryModels;

public class CategoryDAOimpl implements ICategoryDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public List<CategoryModels> findAll() {
		//xu ly du lieu hien thi tat ca category
		List<CategoryModels> listcate = new ArrayList<CategoryModels>();
		String sql = "Select * from Category";
		try {
			conn = new DBConnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				CategoryModels category = new CategoryModels();
				category.setCateID(rs.getInt("CategoryID"));
				category.setCateName(rs.getString("CategoryName"));
				category.setImage(rs.getString("icon"));
				listcate.add(category);
			}
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return listcate;
	}

	@Override
	public void insert(CategoryModels model) {
		//xu ly them category
		String sql = "insert into Category (CategoryName,icon) values (?, ?)";
		try {
			Connection conn = new DBConnectionSQLServer().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			//gan gia tri cho tham so
			
			ps.setString(1, model.getCateName());
			ps.setString(2, model.getImage());
			
			
			ps.executeUpdate();//thuc thi cau query
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void delete (CategoryModels model) {
		String sql = "delete from Category where CategoryID = ? ";
		try {
			conn = new DBConnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			//gan gia tri cho tham so
			ps.setInt(1, model.getCateID());
			
			ps.executeUpdate();
			//thuc thi cau query
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public CategoryModels findOne(int id) {
		String sql="select * from Category where CategoryID=?";
		
		CategoryModels model = new CategoryModels();
		try {
			conn = new DBConnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			while(rs.next()) {
				model.setCateID(rs.getInt("CategoryID"));
				model.setCateName(rs.getString("CategoryName"));
				model.setImage(rs.getString("icon"));
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return model;
	}

	@Override
	public void update(CategoryModels model) {
		String sql = "update Category set CategoryName=?, icon=? where CategoryID=?";
		try {
			conn = new DBConnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			//gan gia tri cho tham so
			
			ps.setString(1, model.getCateName());
			ps.setString(2, model.getImage());
			ps.setInt(3, model.getCateID());
			
			ps.executeUpdate();//thuc thi cau query
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		
		String sql = "delete from Category where CategoryID=?";
		try {
			conn = new DBConnectionSQLServer().getConnection();
			ps = conn.prepareStatement(sql);
			//gan gia tri cho tham so
			
			ps.setInt(1, id);
			
			ps.executeUpdate();//thuc thi cau query
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
