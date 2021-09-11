package Service;

import java.util.List;

import Dao.EmpDao;
import Model.Employee;

public class EmpServiceImpl implements EmpService {
	
	private EmpDao empDao;
	
	
	
	public EmpServiceImpl(EmpDao empDao) {
		super();
		this.empDao = empDao;
	}

	public void add(Employee e) {
		empDao.add(e);
	}

	public void delete(int empid) {
		// TODO Auto-generated method stub

	}

	public List<Employee> getAllemp() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateByempname(int empid) {
		// TODO Auto-generated method stub

	}

}
