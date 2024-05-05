package employeeRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int numberEmployees = scanner.nextInt();
		

		for(int i = 0; i<numberEmployees; i++) {
			scanner.nextLine();
			System.out.println("Employee " +(i+1) +"#:");
			System.out.print("ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Salary:");
			double salary = scanner.nextDouble();
			
			Employee employeeData = new Employee(id,name,salary);
			employees.add(employeeData);
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the porcentage:");
		double percentage = scanner.nextDouble();
		
		for (Employee employee: employees) {
			if(employee.getId() == idIncrease) {
				employee.salaryIncrease(percentage);
				break; 
			}
			else {
				System.out.println("This ID does not exist!");
			}
		}
		
		System.out.println("List of employees: ");
		
		for (Employee employee: employees) {
			System.out.println(employee);
		}
	
		
		scanner.close();
	}

}
