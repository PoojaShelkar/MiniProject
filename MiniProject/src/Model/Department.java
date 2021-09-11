package Model;

public class Department {
	
	private int Deptid;
	private String DeptName;
	
	public Department ()
	{
		
	}

	public Department(int deptid, String deptName) {
		super();
		Deptid = deptid;
		DeptName = deptName;
	}

	public int getDeptid() {
		return Deptid;
	}

	public void setDeptid(int deptid) {
		Deptid = deptid;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [Deptid=" + Deptid + ", DeptName=" + DeptName + "]";
	}
	
}
	
	