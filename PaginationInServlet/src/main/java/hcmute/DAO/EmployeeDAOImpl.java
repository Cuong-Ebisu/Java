package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hcmute.models.EmployeeModel;

public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public List<EmployeeModel> getReCords(int start, int total) {
		List<EmployeeModel> list = new ArrayList<EmployeeModel>();
		String sql = "SELECT * FROM Employee ORDER BY id ASC OFFSET ? rows fetch next ? rows only";

		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, start - 1); // Số hàng bắt đầu
			ps.setInt(2, total); //  Số hàng cần lấy
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				EmployeeModel empl = new EmployeeModel();
				empl.setId(rs.getInt(1));
				empl.setName(rs.getString(2));
				empl.setSalary(rs.getInt(3));
				list.add(empl);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int countEmployee() {
		String sql = "SELECT COUNT(*) FROM Employee";
		int countEmpl = 0;
		
		try {
			Connection conn = new DBConnectionSQL().getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				countEmpl = rs.getInt(1);
			}
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return countEmpl;
	}

}
