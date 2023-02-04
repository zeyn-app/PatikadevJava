public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("kemal", 2000, 45, 1985);
		EmployeeManager employeeManager = new EmployeeManager();
		
		employeeManager.employee = employee;
		
		System.out.println(employeeManager.toString());

	}

}
