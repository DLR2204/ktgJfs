package oops;

public class Employee {	//pojo
	
	private String empName; //global instance variables
	
	private int empId;
	
	private String empAdd;
	
	private int empSal;
	
	
	public void setEmpName(String empName) {		//setters :- i/p
		this.empName = empName;
	}
	
	public String getEmpName() {			//getters :- o/p
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	public Employee() {
		
	}

	public Employee(String empName, int empId, String empAdd, int empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAdd = empAdd;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAdd=" + empAdd + ", empSal=" + empSal + "]";
	}
	
	

}
