import java.time.LocalDate;

public class EmployeeModel {

	private int id;
	private String name;
	private double salary;
	private LocalDate dob;

	public EmployeeModel() {
		super();
	}

	public EmployeeModel(int id, String name, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee id: " + id + ", Nname: " + name + ", Salary: " + salary + ", dob: " + dob;
	}

}
