public class EmployeeManager {
	
	public Employee employee;
	
	public double tax() {
		double taxAmount;

		return taxAmount = employee.getSalary() >= 1000 ? ((employee.getSalary() * 3) / 100) : 0;
	}

	public double bonus() {
		double bonus;

		return bonus = employee.getWorkHours() > 40 ? ((employee.getWorkHours() - 40) * 30) : 0;
	}

	public double raiseSalary() throws Exception {
		int year;
		double raise = 0;
		year = 2021 - employee.getHireYear();

		if (year < 10) {
			raise = (employee.getSalary() * 5) / 100;
		}

		else if (year > 9 && year < 20) {
			raise = (employee.getSalary() * 10) / 100;
		} 
		else if (year > 20) {
			raise = (employee.getSalary() * 15) / 100;
		}
		else {
			throw new Exception("Yılı yanlış girdiniz.");
		}

		return raise;
	}

	public String toString() {
		try {
			return("Adı: " + employee.getName() + "\nMaaşı: " + employee.getSalary() + "\nÇalışma Saati: " + employee.getWorkHours() + 
					"\nBaşlangıç Yılı: " + employee.getHireYear() + "\nVergi: " + tax() + "\nBonus: " + bonus() + 
					"\nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: " + (employee.getSalary() + bonus() - tax()) + 
					"\nToplam Maaş: " + (employee.getSalary() + raiseSalary() + bonus() - tax()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	/*
	 * 	public double tax() {
		double taxAmount;

		// taxAmount = salary>=1000 ? ((salary*3)/100) : 0;

		return taxAmount = salary >= 1000 ? ((salary * 3) / 100) : 0;
	}

	public double bonus() {
		double bonus;

		return bonus = workHours > 40 ? ((workHours - 40) * 30) : 0;
	}

	public double raiseSalary() {
		int year;
		double raise = 0;
		year = 2021 - hireYear;

		if (year < 10) {
			raise = (salary * 5) / 100;
		}

		else if (year > 9 && year < 20) {
			raise = (salary * 10) / 100;
		} else if (year > 20) {
			raise = (salary * 15) / 100;
		}

		return raise;
	}

	public String toString() {
		return("Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours + 
				"\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() + 
				"\nMaaş Artışı: " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: " + (salary + bonus() - tax()) + 
				"\nToplam Maaş: " + (salary+ raiseSalary() + bonus() - tax()));

	}
	 */

}
