package in.com.cg.dataLayerDAO;

import java.util.ArrayList;
import java.util.List;

import in.com.cg.employeebean.Employee;

public class EmployeeDAO {

	private List<Employee> setOfEmployees = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		setOfEmployees.add(employee);
	}
	
	public List<Employee> viewAllEmployee()
	{
		return setOfEmployees;
	}
	
	public Employee getEmpById(int ID)
	{
		for(Employee employee : setOfEmployees)
		{
			if(employee.getID() == ID) {
				return employee;
			}
		}
		return null;
	}
	
	public void deleteEmpById(int ID)
	{
		for(Employee employee : setOfEmployees)
		{
			if(employee.getID() == ID) {
				setOfEmployees.remove(employee);
				break;
			}
		}
	}
	
}