package Dao;

import java.util.List;

import Model.Employee;


public interface  EmpDao {
	
	public boolean add(Employee e);
	public void delete(int EmpId);
	public List<Employee> getAllEmp();
	public void updateByEmpName(int EmpId);
	public Employee getEmpById(int EmpId);

}
