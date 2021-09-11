package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Configuration.DBconnect;
import Model.Employee;

public class EmpDaoImpl implements EmpDao {

	static Scanner sc = new Scanner(System.in);
	private static Connection connection;
	private static Object preparedStatement;
	private static Object scanner;

	public static int addEmployee(Employee e) {

		int status = 0;
		try (Connection con = DBconnect.getConnection();
				PreparedStatement pst = con.prepareStatement("insert into employee(EmpId, EmpName, EmpDept, EmpaAge, EmpMobile, EmpCity, EmpMail, Did, Rid) values(?,?,?,?,?,?,?,?,?);")) {
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getEmpName());
			pst.setString(3, e.getEmpDept());
			pst.setInt(4, e.getEmpAge());
			pst.setLong(5, e.getEmpMobile());
			pst.setString(6, e.getEmpCity());
			pst.setString(7, e.getEmpMail());
			pst.setInt(8, e.getDid());
			pst.setInt(9, e.getRid());

			status = pst.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
			finally{
				try{
					if(preparedStatement!=null)
						((Connection) preparedStatement).close();
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
				try{
				    if(connection!=null)
						connection.close();
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
				try{
				    if(scanner!=null)
						((Connection) scanner).close();
				}catch (SQLException e1) {
					e1.printStackTrace();
			}
				
		}
		return status;
	}

	public int deleteEmployee(int EmpId) {
		int status = 0;

		try {
			Connection con = DBconnect.getConnection();

			PreparedStatement pst = con
					.prepareStatement("delete from Employee where EmpId=?");
			pst.setInt(1, EmpId);

			status = pst.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally{
			try{
				if(preparedStatement!=null)
					((Connection) preparedStatement).close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
			try{
			    if(connection!=null)
					connection.close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return status;
	}

	public List<Employee> getAllemp() {
		ArrayList<Employee> emplist = new ArrayList<>();
		try (Connection con = DBconnect.getConnection();
				Statement st = con.createStatement()) {

			ResultSet rs = st.executeQuery("select * from Employee");

			while (rs.next()) {
				Employee e2 = new Employee();
				e2.setEmpId(rs.getInt(1));
				e2.setEmpName(rs.getString(2));
				e2.setEmpDept(rs.getString(3));
				e2.setEmpAge(rs.getInt(4));
				e2.setEmpMobile(rs.getLong(5));
				e2.setEmpCity(rs.getString(6));
				e2.setEmpMail(rs.getString(7));
				e2.setDid(rs.getInt(8));
				e2.setRid(rs.getInt(9));
				emplist.add(e2);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		finally{
			try{
				if(preparedStatement!=null)
					((Connection) preparedStatement).close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
			try{
			    if(connection!=null)
					connection.close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return emplist;

	}

	public int Update(int empid) {

		int count = 0;
		try (Connection con = DBconnect.getConnection()) {
			PreparedStatement pst = con
					.prepareStatement("update employee set EmpName=?,EmpDept=?,EmpaAge=?, EmpMobile=?,EmpCity=?,EmpMail=?,Did=?,Rid=? where empid = ?");

			System.out.println("current details are");
			System.out
					.println("enter empname,empdept,empage,empmobile,empcity,empmail,did,rid");

			String nm = sc.next();
			String dept = sc.next();
			String age = sc.next();
			Long mb = sc.nextLong();
			String city = sc.next();
			String mail = sc.next();
			int did = sc.nextInt();
			int rid = sc.nextInt();

			pst.setString(1, nm);
			pst.setString(2, dept);
			pst.setString(3, age);
			pst.setLong(4, mb);
			pst.setString(5, city);
			pst.setString(6, mail);
			pst.setInt(7, did);
			pst.setInt(8, rid);
			pst.setInt(9, empid);

			count = pst.executeUpdate();
			System.out.println("update successfully");
			return count;
		}

		catch (Exception e) {
			e.printStackTrace();

		}
		finally
		{
			try{
				if(preparedStatement!=null)
					((Connection) preparedStatement).close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
			try{
			    if(connection!=null)
					connection.close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return count;
}

	public String search_EmployeebyEmpId(int EmpId) {

		ResultSet status = null;
		String output = null;
		try (Connection con = DBconnect.getConnection())
		{
			PreparedStatement pst = con.prepareStatement("select * from Employee where EmpId = ?");
			pst.setInt(1,EmpId);
			status = pst.executeQuery();
			status.next();
				output = "EmpId:-" + status.getInt(1) + " EmpName:-"
						+ status.getString(2) + " EmpDept:-"
						+ status.getString(3) + " EmpAge:-"
						+ status.getString(4) + " EmpMobile:-"
						+ status.getLong(5) + " EmpCity:-" + status.getString(6)
						+ " EmpMail:-" + status.getString(7) + " Did:-"
						+ status.getInt(8) + " Rid:-" + status.getInt(9);
				
				System.out.println(output);
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally{
			try{
				if(preparedStatement!=null)
					((Connection) preparedStatement).close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
			try{
			    if(connection!=null)
					connection.close();
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		return output;
	}
	
	

	@Override
	public void updateByEmpName(int EmpId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmpById(int EmpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int EmpId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

}
