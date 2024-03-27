package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.Message;

import hcmute.models.ProductModel;

public class ProductDAOImpl implements IProductDAO {

	@Override
	public List<ProductModel> findAll() {
		List<ProductModel> productList = new ArrayList<>();

		try {
			Connection conn = new DBConnectionSQL().getConnection();

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Product");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ProductModel product = new ProductModel();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getDouble("price"));
				product.setQuantity(rs.getInt("quantity"));
				product.setManufacturer(rs.getString("manufacturer"));
				product.setReleaseDate(rs.getDate("release_date"));
				product.setImagePath(rs.getString("image_path"));

				productList.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return productList;
	}

	@Override
	public void addProduct(ProductModel product) {
		String sql = "INSERT INTO Product (name, description, price, quantity, manufacturer, release_date, image_path) VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQuantity());
            ps.setString(5, product.getManufacturer());
            ps.setDate(6, product.getReleaseDate());
            ps.setString(7, product.getImagePath());

            ps.executeUpdate();
            conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ProductModel getProductById(int productId) {
        String sql = "SELECT * FROM Product WHERE id = ?";
        ProductModel product = new ProductModel();
        
        try (Connection conn = new DBConnectionSQL().getConnection();
        	     PreparedStatement ps = conn.prepareStatement(sql)) {
        	    ps.setInt(1, productId);
        	    try (ResultSet rs = ps.executeQuery()) {
        	        if (rs.next()) {
        	            product.setId(rs.getInt("id"));
        	            product.setName(rs.getString("name"));
        	            product.setDescription(rs.getString("description"));
        	            product.setPrice(rs.getDouble("price"));
        	            product.setQuantity(rs.getInt("quantity"));
        	            product.setManufacturer(rs.getString("manufacturer"));
        	            product.setReleaseDate(rs.getDate("release_date"));
        	            product.setImagePath(rs.getString("image_path"));
        	        }
        	    }
        	} catch (Exception e) {
        	    e.printStackTrace();
        	}
        return product;
	}

	@Override
	public void updateProduct(ProductModel product) {
		String sql = "UPDATE Product SET name=?, description=?, price=?, quantity=?, manufacturer=?, releaseDate=?, imagePath=? WHERE id=?";
        try {
            Connection conn = new DBConnectionSQL().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQuantity());
            ps.setString(5, product.getManufacturer());
            ps.setDate(6, product.getReleaseDate());
            ps.setString(7, product.getImagePath());
            ps.setInt(8, product.getId());

            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
