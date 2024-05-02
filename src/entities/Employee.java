package entities;

public class Employee {
	public Integer id;
	public String name;
	public Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void salaryIncrease(double percentage) {
		this.salary += this.salary *  (percentage/100);
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	
	
}
