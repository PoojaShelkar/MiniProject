package Controller;

import java.util.List;
import java.util.Scanner;
import Dao.EmpDaoImpl;
import Model.Employee;

public class MainEntry {

	public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	System.out.println("**********Welcome To HR  Management System**********");
	
	System.out.println("1-->Add Employee");	
	System.out.println("2-->Delete Employee");
	System.out.println("3-->All Employee");
	System.out.println("4-->Update Employee");	
	System.out.println("5-->Search Employee By EmpId ");	
	System.out.println("enter Your Choice");
	
	int choice =sc.nextInt();
	
	int status=0;
	EmpDaoImpl employeeDaoImlp = new EmpDaoImpl(); 
	
	switch(choice)
	 {
	 case 1 : 
		 System.out.println("Enter EmpId:");
	     int id=sc.nextInt();
	     System.out.println("Enter EmpName:");
	     String nm=sc.next();
	     System.out.println("Enter EmpDept:");
         String dept=sc.next();
         System.out.println("Enter Empage:");
	     int age=sc.nextInt();
	     System.out.println("Enter EmpMobile:");
	     Long mb=sc.nextLong();
	     System.out.println("Enter EmpCity:");
	     String city=sc.next();
	     System.out.println("Enter Empmail:");
	     String mail=sc.next();
	     System.out.println("Enter Did:");
	     int did=sc.nextInt();
	     System.out.println("Enter Rid:");
	     int rid=sc.nextInt();
	    
	     Employee emp=new Employee(id,nm,dept,age,mb,city,mail,did,rid);
		 status=EmpDaoImpl.addEmployee(emp);
	 
	if(status>0)
	{
		System.out.println("Employee Added Successfully");
	}else
	{
		System.out.println("unable");
	}
	break;
	 
	
	 case 2 :
		System.out.println("Enter EmpId to delete reocrd:-");
		int EmpId=sc.nextInt();
	    int status1=employeeDaoImlp.deleteEmployee(EmpId);
		if(status1>0)
		{
			System.out.println("Record of deleted successfully");
		}else
		{
			System.out.println("unable to delete record of Employee");
		}
		
	
		
	  case  3 :
		
		List<Employee> emplist=employeeDaoImlp.getAllemp();
		for(Employee e2:emplist)
			System.out.println(e2);
	
	
	break;


       case 4 :
    	   System.out.println("***Update***");
    	   
    	   System.out.println("Enter EmpId to Update");
    	   EmpId=sc.nextInt();
    	   employeeDaoImlp.Update(EmpId);
    	   break;
    	   
	
       case 5 :
    	   
    	   System.out.println("1-->Search By EmpId ");
    	   System.out.println("Enter your choice:");
    	   int ch = sc.nextInt();
    	   if(ch==1){
    	       System.out.println("Enter EmpId to search Employee");
    		   EmpId = sc.nextInt();
    		   
			@SuppressWarnings("unused")
			String temp  = employeeDaoImlp.search_EmployeebyEmpId(EmpId);
    	  } 
      }
	
	}
}
	
