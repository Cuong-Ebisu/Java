package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hcmute.models.UserModel;

public class UserDAOImpl implements IUserDAO{

	@Override
	public List<UserModel> getUser(int start, int total) {
		List<UserModel> list = new ArrayList<UserModel>();
		String sql = "SELECT * FROM Users ORDER BY Username ASC OFFSET ? rows fetch next ? rows only";
		
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, start - 1); // So hang bat dau
			ps.setInt(2, total); // So hang can lay
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UserModel user = new UserModel();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setPhone(rs.getString(3));
				user.setFullname(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setAdmin(rs.getBoolean(6));
				user.setActive(rs.getBoolean(7));
				user.setImages(rs.getString(8));
				list.add(user);
			}
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int countUser() {
		String sql = "SELECT COUNT(*) FROM Users";
		int countuser = 0;
		
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				countuser = rs.getInt(1);
			}
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return countuser;
	}
	
}
