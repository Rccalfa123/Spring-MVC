package in.com.cg.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.cg.AppController.AppController;
import in.com.cg.employeebean.Employee;

public class UIController {

	public void startUI()
	{
		Employee employee;
		Scanner scanner = new Scanner(System.in);
		 List<Employee> arrayList = new ArrayList<Employee>();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		AppController appController = (AppController) context.getBean("appController");
		
		while(true)
		{
			System.out.println("Press 1 for Inputting Data : ");
			System.out.println("Press 2 for Displaying Data : ");
			System.out.println("Press 3 for Search by Employee Id : ");
			System.out.println("Press 4 for Delete by Employee Id : ");
			System.out.println("Press 5 for Exit");
			System.out.println("\nEnter Your Choice : ");
			
			int ch = scanner.nextInt();
			
			switch (ch) {
			
			case 1: employee = new Employee();
					System.out.println("Enter The Employee Name : ");
					employee.setName(scanner.next());
					System.out.println("Enter Your Salary : ");
					employee.setSalary(scanner.nextDouble());
					appController.addEmployee(employee);
					break;

			case 2: arrayList = appController.viewAllEmployee();
					arrayList.stream().forEach(System.out::println);
					break;
					
			case 3: System.out.println("Enter the Id");
					int id = scanner.nextInt();
					System.out.println(appController.getEmpById(id));
					break;	
					
			case 4: System.out.println("Enter the Id");
					int id_del = scanner.nextInt();
					appController.deleteEmpById(id_del);
					break;			
			
			case 5: System.exit(0);
			 		break;
    
				    
			default:System.out.println("Enter a Valid Option....");
				break;
			}
			
		}
		
		
	}
}
