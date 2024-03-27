package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAOimpl implements IUserDAO{

	@Override
	public boolean login(String name, String password) {
		String sql = "SELECT password FROM usertable WHERE name = ?";
		boolean flag = false;
		try {
			Connection conn = new  DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				String dbPassword = rs.getString("password");
				if(dbPassword.equals(password)) {
					flag = true;
				}
				else {
					flag = false;
				}
			}
			else {
				flag = false;
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(flag) {
			return true;
		}else {
			return false;
		}
			
	}


}
