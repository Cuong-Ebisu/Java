package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

import hcmute.models.UserModel;

public class UserDAOImpl implements IUserDAO {

	@Override
	public String signup(UserModel model) {
		String sql = "Insert into users(uname, upwd, uemail, umobile) values (?,?,?,?)";

		Connection conn = null;
		String status = null;
		try {
			conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, model.getUname());
			ps.setString(2, model.getUpwd());
			ps.setString(3, model.getUemail());
			ps.setString(4, model.getUmobile());

			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				status = "success";
			} else {
				status = "failed";
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String login(String username, String password) {
		String sql = "Select *from users where uemail = ? and upwd = ? ";
		String uname = null;
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs =  ps.executeQuery();
			if(rs.next()) {
				uname = rs.getString("uname");
				
			}else {
				uname = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uname;
	}

}
