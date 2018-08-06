package in.com.cg.AppController;

import java.util.List;

import in.com.cg.ServiceLayer.ServiceLayer;
import in.com.cg.employeebean.Employee;

public class AppController {

	ServiceLayer serviceLayer;
	
	public void setServiceLayer(ServiceLayer serviceLayer) {
		this.serviceLayer = serviceLayer;
	}

	public void addEmployee(Employee employee) {
		serviceLayer.addEmployee(employee);
	}
	
	public List<Employee> viewAllEmployee()
	{
		return serviceLayer.viewAllEmployee();
	}
	
	public Employee getEmpById( int ID)
	{
	
		return serviceLayer.getEmpById(ID);
	}
	
	public void deleteEmpById(int ID)
	{
		serviceLayer.deleteEmpById(ID);
	}
	
}
