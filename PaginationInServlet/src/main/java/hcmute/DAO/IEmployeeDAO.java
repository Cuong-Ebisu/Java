package hcmute.DAO;

import java.util.List;

import hcmute.models.EmployeeModel;

public interface IEmployeeDAO {
	List<EmployeeModel> getReCords(int start, int total);
	
	int countEmployee();
}
