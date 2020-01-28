import java.text.NumberFormat;

public class Employee {
	String name;
	int age;
	String designation;
	private double salary;
	String status;
	String insurance;
	String supervisor;
	int employeeId;
	private int bonus = 1000;




	public Employee(int employeeId) {
		this.employeeId = employeeId;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary, int bonus) {
		switch(bonus) {
		case 1:
			double slry = salary + getBonus();
			this.salary = slry;
			break;
		case 0:
			this.salary = salary;
		default:
			this.salary = salary;

		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {

		switch(status) {
		case "F":
			this.status = "Full-Time";
			break;
		case "P":
			this.status = "Part-Time";
			break;
		default:
			this.status = "Unknown";
			break;
		}

	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(int insurance) {
		if (insurance > 0 && insurance < 4) {
			this.insurance = "Option " + insurance;
		}
		else {
			this.insurance = "Unknown " + insurance;
		}
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	public void printEmployee() {
		pointLessMethod();
	}

	private void pointLessMethod(){
		getEmployee(employeeId);
		NumberFormat format = NumberFormat.getCurrencyInstance();
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + format.format(salary));
		System.out.println("Status: " + status);
		System.out.println("Insurance Type: " + insurance);
		System.out.println("Supervisor: " + supervisor + "\n");
	}

	private void getEmployee(int employeeId) {
		switch(employeeId) {
			case 123456:
				setName("James Smith");
				setAge(26);
				setDesignation("Senior Software Engineer");
				setSalary(100000, 1);
				setInsurance(1);
				setStatus("F");
				setSupervisor("Bob Smith");

				break;
			case 654321:
				setName("Mary Jones");
				setAge(20);
				setDesignation("Software Engineer");
				setSalary(50000, 0);
				setInsurance(4);
				setStatus("Y");
				setSupervisor("Sally Barnes");
				break;
			default:
				break;
		}
	}

}
