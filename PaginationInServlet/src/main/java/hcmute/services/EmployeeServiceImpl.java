package hcmute.services;

import java.util.List;

import hcmute.DAO.EmployeeDAOImpl;
import hcmute.DAO.IEmployeeDAO;
import hcmute.models.EmployeeModel;

public class EmployeeServiceImpl implements IEmployeeService{

	IEmployeeDAO emplDao = new EmployeeDAOImpl();
	@Override
	public List<EmployeeModel> getReCords(int start, int total) {
		return emplDao.getReCords(start, total);
	}
	@Override
	public int countEmployee() {
		return emplDao.countEmployee();
	}

}
