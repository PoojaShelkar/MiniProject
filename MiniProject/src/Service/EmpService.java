package Service;

import java.util.List;

import Model.Employee;

public interface EmpService {
	public void add(Employee e);
	public void delete(int empid);
	public List<Employee> getAllemp();
	public void updateByempname(int empid);

}
