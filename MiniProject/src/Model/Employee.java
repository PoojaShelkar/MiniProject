package Model;

public class Employee {

	private int EmpId;
	private String EmpName;
	private String EmpDept;
	private int EmpAge;
	private long EmpMobile;
	private String EmpCity;
    private String EmpMail;
    private int Did;
    private int Rid;
	
	
    public Employee()
	{
		
	}
    
   
	public Employee(int empId, String empName, String empDept, int empAge,
			long empmobile, String empCity, String empMail, int did, int rid) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpDept = empDept;
		EmpAge = empAge;
		EmpMobile = empmobile;
		EmpCity = empCity;
		EmpMail = empMail;
		Did = did;
		Rid = rid;
	}
	
	

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}

	public int getEmpAge() {
		return EmpAge;
	}

	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	public long getEmpMobile() {
		return EmpMobile;
	}

	public void setEmpMobile(long empMobile) {
		EmpMobile = empMobile;
	}

	public String getEmpCity() {
		return EmpCity;
	}

	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}

	public String getEmpMail() {
		return EmpMail;
	}

	public void setEmpMail(String empMail) {
		EmpMail = empMail;
	}

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public int getRid() {
		return Rid;
	}

	public void setRid(int rid) {
		Rid = rid;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName
				+ ", EmpDept=" + EmpDept + ", EmpAge=" + EmpAge
				+ ", Empmobile=" + EmpMobile + ", EmpCity=" + EmpCity
				+ ", EmpMail=" + EmpMail + ", Did=" + Did + ", Rid=" + Rid
				+ "]";
	}
	
}
	
   	