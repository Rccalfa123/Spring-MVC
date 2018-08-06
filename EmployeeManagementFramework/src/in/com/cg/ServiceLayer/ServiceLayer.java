package in.com.cg.ServiceLayer;

import java.util.List;

import in.com.cg.dataLayerDAO.EmployeeDAO;
import in.com.cg.employeebean.Employee;

public class ServiceLayer {
	
	EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	public void addEmployee(Employee employee) {
		dao.addEmployee(employee);
	}
	
	public List<Employee> viewAllEmployee()
	{
		return dao.viewAllEmployee();
	}
	
	public Employee getEmpById( int ID)
	{
	
		return dao.getEmpById(ID);
	}
	
	public void deleteEmpById(int ID)
	{
		dao.deleteEmpById(ID);
	}

}
