package hcmute.services;

import java.util.List;

import hcmute.models.EmployeeModel;

public interface IEmployeeService {
	List<EmployeeModel> getReCords(int start, int total);
	
	int countEmployee();
}
