package sample.mybatis.domain;

public class Employee {

	private int id;
	private String email;
	private String empName;
	
	public Employee() {}

    public Employee(String email, String empName) {
        this.email = email;
        this.empName = empName;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
